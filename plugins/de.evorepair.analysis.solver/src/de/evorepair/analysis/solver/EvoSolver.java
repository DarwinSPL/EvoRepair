package de.evorepair.analysis.solver;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.nary.cnf.ILogical;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.constraints.set.PropIntersection;
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
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractSetTerm;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
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
import de.evorepair.logic.evofirstorderlogic.EvoSetUnion;
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
	private class EvoFeature{
		public IntVar variable;
		public HyFeature feature;

		public EvoFeature(IntVar variable, HyFeature feature){
			this.variable = variable;
			this.feature = feature;
		}
	}

	private class EvoGroup{
		public IntVar variable;
		public HyGroup group;

		public EvoGroup(IntVar variable, HyGroup group){
			this.variable = variable;
			this.group = group;
		}
	}

	HashMap<HyFeature, IntVar> featureVariables = new HashMap<>();
	HashMap<HyGroup, IntVar> groupVariables = new HashMap<>();
	HashMap<String, IntIterableRangeSet> setVariables = new HashMap<>();

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
	 * Checks for all in the given guidance table defined anomalies if one occures
	 * @param guidanceTable
	 */
	public void solve(EvoGuidanceTable guidanceTable){

		// get all variables defined in each triggering operation and add them to the solver
		collectVariables(guidanceTable);
	}

	private HyFeatureType getFeatureType(HyFeature feature, Date date){
		return HyEvolutionUtil.getValidTemporalElement(feature.getTypes(), date);
	}
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

	private HyGroupType getGroupType(HyGroup group, Date date){
		return HyEvolutionUtil.getValidTemporalElement(group.getTypes(), date);
	}
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
	
	Model model;

	private IntIterableRangeSet getSet(EvoAbstractTerm term){
		if(term instanceof EvoSetVariable){
			EvoSetVariable setTerm = (EvoSetVariable)term;
			return setVariables.get(setTerm.getName());
		}

		return null;
	}

	private Variable getVariable(EvoAbstractTerm term){
		if(term instanceof EvoFeatureVariable){
			EvoFeatureVariable featureVariableTerm = (EvoFeatureVariable)term;
			return featureVariables.get(featureVariableTerm.getName());
		}else if(term instanceof EvoGroupVariable){
			EvoGroupVariable groupVariableTerm = (EvoGroupVariable)term;
			return groupVariables.get(groupVariableTerm.getName());
		}

		return null;
	}
	private boolean solveSetTerm(EvoAbstractSetTerm term){
		// TODO implement
		if(term instanceof EvoSetCardinality){
			EvoSetCardinality cardinalityTerm = (EvoSetCardinality)term;
			IntIterableRangeSet set = getSet(cardinalityTerm.getElement());

			System.err.println("SetCardinality not implemented");
			return true;

			// TODO implement
		}else if(term instanceof EvoSetInclusion){
			return true;
			// TODO implement
		}else if(term instanceof EvoSetIntersection){
			PropIntersection intersection = new PropIntersection(null, null);

		}else if(term instanceof EvoSetUnion){
			EvoSetUnion unionTerm = (EvoSetUnion)term;

			IntIterableRangeSet set1 = getSet(unionTerm.getLeftElement());
			IntIterableRangeSet set2 = getSet(unionTerm.getRightElement());

			IntIterableRangeSet union = IntIterableSetUtils.union(set1, set2);
		}else if(term instanceof EvoSetDifference){
		}else if(term instanceof EvoSetSymmetricDifference){
		}else if(term instanceof EvoSetElementOf){
			EvoSetElementOf elementOfTerm = (EvoSetElementOf)term;

			IntVar element = (IntVar)getVariable(elementOfTerm.getLeftElement());
			IntIterableRangeSet set = getSet(elementOfTerm.getRightElement());

			return IntIterableSetUtils.includedIn(element, set);
		}else if(term instanceof EvoSetNotElementOf){
			EvoSetNotElementOf elementOfTerm = (EvoSetNotElementOf)term;

			IntVar element = (IntVar)getVariable(elementOfTerm.getLeftElement());
			IntIterableRangeSet set = getSet(elementOfTerm.getRightElement());

			return IntIterableSetUtils.notIncludedIn(element, set);
		}

		return false;
	}

	private ILogical solveTerm(EvoAbstractTerm term, Date date){
		if(term instanceof EvoAnd){
			EvoAnd andTerm = (EvoAnd)term;
			return LogOp.and(solveTerm(andTerm.getLeftElement(), date), solveTerm(andTerm.getRightElement(), date));
		}else if(term instanceof EvoOr){
			EvoOr evoOr = (EvoOr)term;
			return LogOp.or(solveTerm(evoOr.getLeftElement(), date), solveTerm(evoOr.getRightElement(), date));			
		}else if(term instanceof EvoXOr){
			EvoXOr xorTerm = (EvoXOr)term;
			return LogOp.xor(solveTerm(xorTerm.getLeftElement(), date), solveTerm(xorTerm.getRightElement(), date));
		}else if(term instanceof EvoNot){
			EvoNot notTerm = (EvoNot)term;
			BoolVar var1 = model.boolVar();
			LogOp.reified(var1, solveTerm(notTerm.getElement(), date));
			
			model.addClauseFalse(var1);
		}else if(term instanceof EvoEqual){
			EvoEqual equalTerm = (EvoEqual)term;
			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();
			
			LogOp.reified(var1, solveTerm(equalTerm.getLeftElement(), date));
			LogOp.reified(var2, solveTerm(equalTerm.getRightElement(), date));
			
			if(!model.addClausesBoolEq(var1, var2)){
				System.err.println("Error: equal clause could not be added to the model");
			}
		}else if(term instanceof EvoImplication){
			EvoImplication implicationTerm = (EvoImplication)term;
			return LogOp.implies(solveTerm(implicationTerm.getLeftElement(), date), solveTerm(implicationTerm.getRightElement(), date));
		}else if(term instanceof EvoBiconditional){
			EvoBiconditional biconditionalTerm = (EvoBiconditional)term;
			return LogOp.ifOnlyIf(solveTerm(biconditionalTerm.getLeftElement(), date), solveTerm(biconditionalTerm.getRightElement(), date));
		}else if(term instanceof EvoFeatureType){
			EvoFeatureType featureTypeTerm = (EvoFeatureType)term;

			return model.boolVar("ft_"+(new Date()), determineValueOfFeatureTypeOperation(featureTypeTerm, null));
		}else if(term instanceof EvoGroupType){	
			EvoGroupType groupTypeTerm = (EvoGroupType)term;
			
			return model.boolVar("gt_"+(new Date()), determineValueOfGroupTypeOperation(groupTypeTerm, null));
		}else if(term instanceof EvoSetElementOf){
			EvoSetElementOf setElementOfTerm = (EvoSetElementOf)term;
			
			boolean value = IntIterableSetUtils.includedIn((IntVar)getVariable(setElementOfTerm.getLeftElement()), getSet(setElementOfTerm.getRightElement()));
			return model.boolVar(value);			 
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
		}else if(term instanceof EvoChildrenOf){
			EvoChildrenOf childrenOfTerm = (EvoChildrenOf)term;
			EvoFeatureVariable variable = (EvoFeatureVariable)childrenOfTerm.getVariable();
			
			HyGroupComposition groupComposition = HyEvolutionUtil.getValidTemporalElement(variable.getFeature().getGroupMembership(), date);
			HyFeatureChild featureChild = HyEvolutionUtil.getValidTemporalElement(groupComposition.getCompositionOf().getChildOf(), date);
			HyFeature feature = featureChild.getParent();
			
			
			if(featureVariables.containsKey(feature)){
				//return featureVariables.get(feature);
			}else{
				IntVar intVar = model.intVar(featureVariables.size());
				featureVariables.put(feature, intVar);
			}			
		}

		return null;
	}

	public void solve(){
		Model model = new Model("");

		BoolVar var1 = model.boolVar("f0", false);
		BoolVar var2 = model.boolVar("f1", false);

		//model.boolVar("featureType", determineValueOfFeatureTypeOperation())
		model.addClauses(LogOp.or(var1, var2));
		//model.addClauses(LogOp.implies(arg0, arg1))
		//model.addCl
		//model.addConstraint(Choco.reifiedConstraint(b, Choco.eq(x,y), Choco.TRUE)).reify();


		Solver solver = model.getSolver();
		solver.setSearch(Search.defaultSearch(model));
		if(solver.solve()){
			System.out.println(":)");
		}else{
			System.err.println(":(");
		}
	}
}
