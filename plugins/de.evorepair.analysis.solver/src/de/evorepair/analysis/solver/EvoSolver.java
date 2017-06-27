package de.evorepair.analysis.solver;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.nary.cnf.ILogical;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.search.strategy.Search;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.Variable;
import org.chocosolver.util.objects.setDataStructures.iterable.IntIterableRangeSet;
import org.chocosolver.util.objects.setDataStructures.iterable.IntIterableSetUtils;

import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoGroupVariable;
import de.evorepair.evolution.evovariable.EvoSetVariable;
import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.evolution.evovariable.EvoVariableType;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractSetTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTwoParameterTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAnd;
import de.evorepair.logic.evofirstorderlogic.EvoBiconditional;
import de.evorepair.logic.evofirstorderlogic.EvoChildrenOf;
import de.evorepair.logic.evofirstorderlogic.EvoEqual;
import de.evorepair.logic.evofirstorderlogic.EvoFeatureType;
import de.evorepair.logic.evofirstorderlogic.EvoGroupType;
import de.evorepair.logic.evofirstorderlogic.EvoImplication;
import de.evorepair.logic.evofirstorderlogic.EvoNot;
import de.evorepair.logic.evofirstorderlogic.EvoOr;
import de.evorepair.logic.evofirstorderlogic.EvoParentOf;
import de.evorepair.logic.evofirstorderlogic.EvoSetCardinality;
import de.evorepair.logic.evofirstorderlogic.EvoSetDifference;
import de.evorepair.logic.evofirstorderlogic.EvoSetElementOf;
import de.evorepair.logic.evofirstorderlogic.EvoSetInclusion;
import de.evorepair.logic.evofirstorderlogic.EvoSetIntersection;
import de.evorepair.logic.evofirstorderlogic.EvoSetNotElementOf;
import de.evorepair.logic.evofirstorderlogic.EvoSetSymmetricDifference;
import de.evorepair.logic.evofirstorderlogic.EvoSetTerm;
import de.evorepair.logic.evofirstorderlogic.EvoSetUnion;
import de.evorepair.logic.evofirstorderlogic.EvoSize;
import de.evorepair.logic.evofirstorderlogic.EvoUnequal;
import de.evorepair.logic.evofirstorderlogic.EvoVariableTerm;
import de.evorepair.logic.evofirstorderlogic.EvoXOr;
import eu.hyvar.evolution.util.HyEvolutionUtil;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.HyFeatureChild;
import eu.hyvar.feature.HyFeatureType;
import eu.hyvar.feature.HyGroup;
import eu.hyvar.feature.HyGroupComposition;
import eu.hyvar.feature.HyGroupType;

public class EvoSolver {


	HashMap<HyFeature, IntVar> featureVariables = new HashMap<>();
	HashMap<HyGroup, IntVar> groupVariables = new HashMap<>();
	HashMap<String, IntIterableRangeSet> setVariables = new HashMap<>();

	Model model;

	/**
	 * Adds a variable to the solver
	 * @param operation
	 * @param variable
	 */
	private void addVariable(EvoOperation operation, EvoVariable variable){
		if(variable instanceof EvoFeatureVariable){
			EvoFeatureVariable featureVariable = (EvoFeatureVariable)variable;

			String key = createVariableName(operation, variable);
			featureVariables.put(featureVariable.getFeature(), model.intVar(key, featureVariables.size()));
		}else if(variable instanceof EvoGroupVariable){
			EvoGroupVariable groupVariable = (EvoGroupVariable)variable;

			String key = createVariableName(operation, variable);
			groupVariables.put(groupVariable.getGroup(), model.intVar(key, groupVariables.size()));
		}else if(variable instanceof EvoSetVariable){
			EvoSetVariable setVariable = (EvoSetVariable)variable;

			String key = createVariableName(operation, variable);
			IntIterableRangeSet set = new IntIterableRangeSet();

			for(EvoVariable childVariable : setVariable.getElements()){
				String childKey = createVariableName(operation, childVariable); 

				// the variable was not added to the solver yet, add it immediatly to continue
				if( !featureVariables.containsKey(childKey) &&
						!groupVariables.containsKey(childKey) && 
						!setVariables.containsKey(childKey)){

					addVariable(operation, childVariable);

					if(featureVariables.containsKey(childKey))
						set.add(featureVariables.get(childKey).getValue());
					if(groupVariables.containsKey(childKey))
						set.add(featureVariables.get(childKey).getValue());
				}
			}

			setVariables.put(key, set);
		}
	}

	/**
	 * Collect variables of a guidance table and adds them to the solver
	 * @param guidanceTable
	 */
	private void collectVariables(EvoGuidanceTable guidanceTable){
		for(EvoOperation operation : guidanceTable.getTriggeringOperations()){
			for(EvoVariable variable : operation.getVariables()){
				addVariable(operation, variable);
			}
		}
	}		

	/**
	 * Creates an unique name for each variable containing the operation and the variable name
	 * @param operation
	 * @param variable
	 * @return
	 */
	private String createVariableName(EvoOperation operation, EvoVariable variable){
		return operation.getName() + "_" + variable.getName();
	}

	/**
	 * returns the feature type valid at a given date
	 * @param feature
	 * @param date
	 * @return valid feature type at given date
	 */
	private HyFeatureType getFeatureType(HyFeature feature, Date date){
		return HyEvolutionUtil.getValidTemporalElement(feature.getTypes(), date);
	}

	/**
	 * Checks if a certain feature has the desired type and returns the result
	 * @param operation
	 * @param oldFeature
	 * @return
	 */
	public boolean determineValueOfFeatureTypeOperation(EvoFeatureType operation, HyFeature oldFeature){
		Date date = new Date();

		for(EvoVariableTerm variable : operation.getVariables()){
			HyFeature feature = null;
			if(variable.getType() == EvoVariableType.EVO_TARGET){
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)variable.getVariable();
				feature = featureVariable.getFeature();
			}else if(variable.getType() == EvoVariableType.EVO_SOURCE){
				feature = oldFeature;
			}

			if(feature != null){
				if(getFeatureType(oldFeature, date).getType() != operation.getType())
					return false;
			}else{ 
				System.err.println("Error: feature in EvoVariableType operation could not be determined.");
				return false;
			}

		}

		return true;
	}

	/**
	 * returns the group type valid at a given date
	 * @param group
	 * @param date
	 * @return valid group type at given date
	 */
	private HyGroupType getGroupType(HyGroup group, Date date){
		return HyEvolutionUtil.getValidTemporalElement(group.getTypes(), date);
	}

	/**
	 * Chekcs if a certain group has the desired type and returns the result
	 * @param operation
	 * @param oldGroup
	 * @return
	 */
	public boolean determineValueOfGroupTypeOperation(EvoGroupType operation, HyGroup oldGroup){
		Date date = new Date();

		for(EvoVariableTerm variable : operation.getVariables()){
			HyGroup group = null;
			if(variable.getType() == EvoVariableType.EVO_TARGET){
				EvoGroupVariable groupVariable = (EvoGroupVariable)variable.getVariable();
				group = groupVariable.getGroup();
			}else if(variable.getType() == EvoVariableType.EVO_SOURCE){
				group = oldGroup;
			}

			if(group != null){
				if(getGroupType(oldGroup, date).getType() != operation.getType())
					return false;
			}else{ 
				System.err.println("Error: group in EvoGroupType operation could not be determined.");
				return false;
			}

		}

		return true;
	}	

	/**
	 * Returns the set variable, saved in the hashmap or calls a function to compute the corresponding set
	 * @param term
	 * @return
	 */
	private IntIterableRangeSet getSet(EvoAbstractTerm term, Date date){
		if(term instanceof EvoSetVariable){
			EvoSetVariable setTerm = (EvoSetVariable)term;
			return setVariables.get(setTerm.getName());
		}else{ // compute the set if it is not defined as a set variable
			return FOOsolveSetTerm(term, date);
		}
	}

	/**
	 * Returns the variable defined in the given abstract term and saved in the hashmap
	 * @param term
	 * @return
	 */
	private Variable getVariable(EvoAbstractTerm term){
		if(term instanceof EvoFeatureVariable){
			EvoFeatureVariable featureVariableTerm = (EvoFeatureVariable)term;
			return featureVariables.get(featureVariableTerm.getFeature());
		}else if(term instanceof EvoVariableTerm){
			EvoVariableTerm variableTerm = (EvoVariableTerm)term;
			return featureVariables.get(((EvoFeatureVariable)variableTerm.getVariable()).getFeature());
		}else if(term instanceof EvoGroupVariable){
			EvoGroupVariable groupVariableTerm = (EvoGroupVariable)term;
			return groupVariables.get(groupVariableTerm.getName());
		}

		return null;
	}

	private IntIterableRangeSet FOOsolveSetTerm(EvoAbstractTerm term, Date date){
		if(term instanceof EvoSetTerm){
			EvoSetTerm setTerm = (EvoSetTerm)term;

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(EvoAbstractTerm variable : setTerm.getVariables()){
				EvoVariableTerm variableTerm = (EvoVariableTerm)variable;

				if(variableTerm.getVariable() instanceof EvoFeatureVariable){
					result.add(this.featureVariables.get(((EvoFeatureVariable)variableTerm.getVariable()).getFeature()).getValue());
				}
			}

			return result;
		}else if(term instanceof EvoSetIntersection){
			EvoSetIntersection intersectionTerm = (EvoSetIntersection)term;

			IntIterableRangeSet set1 = getSet(intersectionTerm.getLeftElement(), date);
			IntIterableRangeSet set2 = getSet(intersectionTerm.getRightElement(), date);

			return IntIterableSetUtils.intersection(set1, set2);
		}else if(term instanceof EvoSetUnion){
			EvoSetUnion unionTerm = (EvoSetUnion)term;

			IntIterableRangeSet set1 = getSet(unionTerm.getLeftElement(), date);
			IntIterableRangeSet set2 = getSet(unionTerm.getRightElement(), date);

			return IntIterableSetUtils.union(set1, set2);
		}else if(term instanceof EvoSetDifference){
			EvoSetDifference differenceTerm = (EvoSetDifference)term;

			IntIterableRangeSet set1 = getSet(differenceTerm.getLeftElement(), date);
			IntIterableRangeSet set2 = getSet(differenceTerm.getRightElement(), date);

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(int i : set1){
				if(!set2.contains(i))
					result.add(i);
			}	

			return result;
		}else if(term instanceof EvoSetSymmetricDifference){
			EvoSetSymmetricDifference differenceTerm = (EvoSetSymmetricDifference)term;

			IntIterableRangeSet set1 = getSet(differenceTerm.getLeftElement(), date);
			IntIterableRangeSet set2 = getSet(differenceTerm.getRightElement(), date);

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(int i : set1){
				if(!set2.contains(i))
					result.add(i);
			}

			for(int i : set2){
				if(!set1.contains(i))
					result.add(i);
			}

			return result;
		}else if(term instanceof EvoParentOf){
			EvoParentOf parentOfTerm = (EvoParentOf)term;
			EvoFeatureVariable variable = (EvoFeatureVariable)parentOfTerm.getVariable();

			IntIterableRangeSet set = new IntIterableRangeSet();
			List<HyFeature> children = new ArrayList<>();
			for(HyFeatureChild featureChild : HyEvolutionUtil.getValidTemporalElements(variable.getFeature().getParentOf(), date)){
				for(HyGroupComposition groupComposition : HyEvolutionUtil.getValidTemporalElements(featureChild.getChildGroup().getParentOf(), date)){
					for(HyFeature feature : groupComposition.getFeatures())
						if(HyEvolutionUtil.isValid(feature, date)){
							children.add(feature);

							if(featureVariables.containsKey(feature)){
								set.add(featureVariables.get(feature).getValue());
							}else{
								IntVar intVar = model.intVar(featureVariables.size());
								featureVariables.put(feature, intVar);

								set.add(intVar.getValue());
							}

						}					
				}
			}

			return set;
		}else if(term instanceof EvoChildrenOf){
			EvoChildrenOf childrenOfTerm = (EvoChildrenOf)term;
			EvoFeatureVariable variable = (EvoFeatureVariable)childrenOfTerm.getVariable();

			HyGroupComposition groupComposition = HyEvolutionUtil.getValidTemporalElement(variable.getFeature().getGroupMembership(), date);
			HyFeatureChild featureChild = HyEvolutionUtil.getValidTemporalElement(groupComposition.getCompositionOf().getChildOf(), date);
			HyFeature feature = featureChild.getParent();

			IntIterableRangeSet set = new IntIterableRangeSet();
			if(featureVariables.containsKey(feature)){
				set.add(featureVariables.get(feature).getValue());
			}else{
				IntVar intVar = model.intVar(featureVariables.size());
				featureVariables.put(feature, intVar);
				set.add(intVar.getValue());
			}			

			return set;
		}

		return null;
	}

	private BoolVar solveSetTerm(EvoAbstractSetTerm term){
		// TODO implement


		return null;
	}


	private void solveSetCardinality(EvoAbstractTerm term, EvoAbstractTwoParameterTerm relationTerm, Date date, Boolean equal){

		if(relationTerm.getLeftElement() instanceof EvoSetCardinality){
			EvoSetCardinality leftCardinalityTerm = (EvoSetCardinality)term;
			IntIterableRangeSet leftSet = getSet(leftCardinalityTerm.getElement(), date);

			if(relationTerm.getRightElement() instanceof EvoSetCardinality){
				EvoSetCardinality rightCardinalityTerm = (EvoSetCardinality)term;
				IntIterableRangeSet rightSet = getSet(rightCardinalityTerm.getElement(), date);	

				BoolVar result = model.boolVar(leftSet.size() == rightSet.size());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}else if(relationTerm.getRightElement() instanceof EvoSize){
				BoolVar result = model.boolVar(leftSet.size() == ((EvoSize)relationTerm.getRightElement()).getSize());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}
		}else if(relationTerm.getRightElement() instanceof EvoSetCardinality){
			EvoSetCardinality rightCardinalityTerm = (EvoSetCardinality)term;
			IntIterableRangeSet rightSet = getSet(rightCardinalityTerm.getElement(), date);

			if(relationTerm.getLeftElement() instanceof EvoSetCardinality){
				EvoSetCardinality leftCardinalityTerm = (EvoSetCardinality)term;
				IntIterableRangeSet leftSet = getSet(leftCardinalityTerm.getElement(), date);	

				BoolVar result = model.boolVar(leftSet.size() == rightSet.size());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}else if(relationTerm.getLeftElement() instanceof EvoSize){
				BoolVar result = model.boolVar(rightSet.size() == ((EvoSize)relationTerm.getRightElement()).getSize());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}
		}	
	}
	private ILogical solveTerm(EvoAbstractTerm term, EvoAbstractTerm parentTerm, Date date){
		if(term instanceof EvoAnd){
			EvoAnd andTerm = (EvoAnd)term;

			BoolVar a = model.boolVar();
			return LogOp.and(solveTerm(andTerm.getLeftElement(), andTerm, date), solveTerm(andTerm.getRightElement(), andTerm, date));
		}else if(term instanceof EvoOr){
			EvoOr orTerm = (EvoOr)term;
			return LogOp.or(solveTerm(orTerm.getLeftElement(), orTerm, date), solveTerm(orTerm.getRightElement(), orTerm, date));			
		}else if(term instanceof EvoXOr){
			EvoXOr xorTerm = (EvoXOr)term;
			return LogOp.xor(solveTerm(xorTerm.getLeftElement(), xorTerm, date), solveTerm(xorTerm.getRightElement(), xorTerm, date));
		}else if(term instanceof EvoNot){
			EvoNot notTerm = (EvoNot)term;
			BoolVar var1 = model.boolVar();
			LogOp.reified(var1, solveTerm(notTerm.getElement(), notTerm, date));

			if(!model.addClauseFalse(var1)){
				System.err.println("Error: not clause could not be added to the model");
			}
		}else if(term instanceof EvoEqual){
			EvoEqual equalTerm = (EvoEqual)term;
			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(equalTerm.getLeftElement() instanceof EvoSetCardinality){
				solveSetCardinality(equalTerm.getLeftElement(), equalTerm, date, true);
			}
			if(equalTerm.getRightElement() instanceof EvoSetCardinality){
				solveSetCardinality(equalTerm.getRightElement(), equalTerm, date, true);
			}
			if(!(equalTerm.getLeftElement() instanceof EvoSetCardinality || equalTerm.getRightElement() instanceof EvoSetCardinality)){
				LogOp.reified(var1, solveTerm(equalTerm.getLeftElement(), equalTerm, date));
				LogOp.reified(var2, solveTerm(equalTerm.getRightElement(), equalTerm, date));

				if(!model.addClausesBoolEq(var1, var2)){
					System.err.println("Error: equal clause could not be added to the model");
				}				
			}


		}else if(term instanceof EvoUnequal){
			EvoUnequal unequalTerm = (EvoUnequal)term;

			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(unequalTerm.getLeftElement() instanceof EvoSetCardinality){
				solveSetCardinality(unequalTerm.getLeftElement(), unequalTerm, date, false);
			}
			if(unequalTerm.getRightElement() instanceof EvoSetCardinality){
				solveSetCardinality(unequalTerm.getRightElement(), unequalTerm, date, false);
			}
			if(!(unequalTerm.getLeftElement() instanceof EvoSetCardinality || unequalTerm.getRightElement() instanceof EvoSetCardinality)){
				LogOp.reified(var1, solveTerm(unequalTerm.getLeftElement(), unequalTerm, date));
				LogOp.reified(var2, solveTerm(unequalTerm.getRightElement(), unequalTerm, date));

				if(!model.addClausesBoolNot(var1, var2)){
					System.err.println("Error: unequal clause could not be added to the model");
				}
			}


		}else if(term instanceof EvoImplication){
			EvoImplication implicationTerm = (EvoImplication)term;

			return LogOp.implies(solveTerm(implicationTerm.getLeftElement(), implicationTerm, date), solveTerm(implicationTerm.getRightElement(), implicationTerm, date));
		}else if(term instanceof EvoBiconditional){
			EvoBiconditional biconditionalTerm = (EvoBiconditional)term;

			return LogOp.ifOnlyIf(solveTerm(biconditionalTerm.getLeftElement(), biconditionalTerm, date), solveTerm(biconditionalTerm.getRightElement(), biconditionalTerm, date));
		}else if(term instanceof EvoFeatureType){
			EvoFeatureType featureTypeTerm = (EvoFeatureType)term;

			return model.boolVar("ft_"+(new Date()), determineValueOfFeatureTypeOperation(featureTypeTerm, null));
		}else if(term instanceof EvoGroupType){	
			EvoGroupType groupTypeTerm = (EvoGroupType)term;

			return model.boolVar("gt_"+(new Date()), determineValueOfGroupTypeOperation(groupTypeTerm, null));
		}else if(term instanceof EvoSetElementOf){
			EvoSetElementOf setElementOfTerm = (EvoSetElementOf)term;


			boolean value = IntIterableSetUtils.includedIn((IntVar)getVariable(setElementOfTerm.getLeftElement()), getSet(setElementOfTerm.getRightElement(), date));

			BoolVar variable = model.boolVar(value);
			model.addClauseTrue(variable);

			return variable;			 
		}else if(term instanceof EvoSetInclusion){
			EvoSetInclusion inclusionTerm = (EvoSetInclusion)term;

			IntIterableRangeSet set1 = getSet(inclusionTerm.getLeftElement(), date);
			IntIterableRangeSet set2 = getSet(inclusionTerm.getRightElement(), date);

			return model.boolVar(IntIterableSetUtils.includedIn(set1, set2));
		}else if(term instanceof EvoSetElementOf){
			EvoSetElementOf elementOfTerm = (EvoSetElementOf)term;

			IntVar element = (IntVar)getVariable(elementOfTerm.getLeftElement());
			IntIterableRangeSet set = getSet(elementOfTerm.getRightElement(), date);

			return model.boolVar(IntIterableSetUtils.includedIn(element, set));
		}else if(term instanceof EvoSetNotElementOf){
			EvoSetNotElementOf elementOfTerm = (EvoSetNotElementOf)term;

			IntVar element = (IntVar)getVariable(elementOfTerm.getLeftElement());
			IntIterableRangeSet set = getSet(elementOfTerm.getRightElement(), date);

			return model.boolVar(IntIterableSetUtils.notIncludedIn(element, set));
		}

		return null;
	}

	/**
	 * Checks for all in the given guidance table defined anomalies if one occures
	 * @param guidanceTable
	 */
	public void solve(EvoGuidanceTable guidanceTable){
		model = new Model("");

		// get all variables defined in each triggering operation and add them to the solver
		collectVariables(guidanceTable);

		EvoAnomaly anomaly = guidanceTable.getAnomalies().get(0);
		solveTerm(anomaly.getCondition().getTerm(), null, new Date());

		Solver solver = model.getSolver();
		solver.setSearch(Search.defaultSearch(model));
		if(solver.solve()){
			for(IntVar var : featureVariables.values()){
				System.out.println(var.getName()+"  "+var.getValue());
			}
			System.out.println("Solutions ="+solver.getSolutionCount());
		}else{
			System.err.println(":(");
		}
	}

	/*
	public void solve(EvoAbstractTerm term, Date date){
		model = new Model("");

		ILogical formula = solveTerm(term, null, date);
		BoolVar b = model.boolVar("partlyFormulaVar");
		LogOp.reified(b, formula);

		model.addClauseTrue(b);


		BoolVar var1 = model.boolVar("f0", false);
		BoolVar var2 = model.boolVar("f1", false);

		Solver solver = model.getSolver();
		solver.setSearch(Search.defaultSearch(model));
		if(solver.solve()){
			System.out.println("Solutions ="+solver.getSolutionCount());
		}else{
			System.err.println(":(");
		}
	}
	 */
}
