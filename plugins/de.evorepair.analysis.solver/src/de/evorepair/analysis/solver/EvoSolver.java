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
import org.chocosolver.util.objects.setDataStructures.iterable.IntIterableSet;
import org.chocosolver.util.objects.setDataStructures.iterable.IntIterableSetUtils;

import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.evolution.evovariable.EvoFeatureRelation;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoFeatureVariableType;
import de.evorepair.evolution.evovariable.EvoGroupVariable;
import de.evorepair.evolution.evovariable.EvoSetVariable;
import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.evolution.evovariable.EvoVariableType;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.logic.evologic.EvoBiconditional;
import de.evorepair.logic.evologic.EvoChildrenOf;
import de.evorepair.logic.evologic.EvoFeatureType;
import de.evorepair.logic.evologic.EvoForAll;
import de.evorepair.logic.evologic.EvoGroupType;
import de.evorepair.logic.evologic.EvoParentOf;
import de.evorepair.logic.evologic.EvoSetCardinality;
import de.evorepair.logic.evologic.EvoSetDifference;
import de.evorepair.logic.evologic.EvoSetElementOf;
import de.evorepair.logic.evologic.EvoSetInclusion;
import de.evorepair.logic.evologic.EvoSetIntersection;
import de.evorepair.logic.evologic.EvoSetNotElementOf;
import de.evorepair.logic.evologic.EvoSetSymmetricDifference;
import de.evorepair.logic.evologic.EvoSetTerm;
import de.evorepair.logic.evologic.EvoSetUnion;
import de.evorepair.logic.evologic.EvoSize;
import de.evorepair.logic.evologic.EvoVariableTerm;
import de.evorepair.logic.evologic.EvoXOr;
import eu.hyvar.evolution.util.HyEvolutionUtil;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.HyFeatureChild;
import eu.hyvar.feature.HyFeatureType;
import eu.hyvar.feature.HyGroup;
import eu.hyvar.feature.HyGroupComposition;
import eu.hyvar.feature.HyGroupType;
import eu.hyvar.feature.configuration.HyConfigurationElement;
import eu.hyvar.feature.configuration.HyFeatureSelected;
import eu.hyvar.feature.expression.HyAndExpression;
import eu.hyvar.feature.expression.HyBinaryExpression;
import eu.hyvar.feature.expression.HyEqualExpression;
import eu.hyvar.feature.expression.HyExpression;
import eu.hyvar.feature.expression.HyImpliesExpression;
import eu.hyvar.feature.expression.HyNotEqualExpression;
import eu.hyvar.feature.expression.HyNotExpression;
import eu.hyvar.feature.expression.HyOrExpression;

public class EvoSolver {

	/**
	 * Contains all for the solver necessary features of a model. The key to identify the feature is a HyFeature
	 */
	HashMap<HyFeature, IntVar> featureVariables = new HashMap<>();
	
	/**
	 * Contains all for the solver necessary groups of a model. The key to identify the group is a HyGroup
	 */
	HashMap<HyGroup, IntVar> groupVariables = new HashMap<>();
	
	/**
	 * Contains all for the solver necessary sets of a model. The key to identify the group is a String
	 */
	HashMap<String, IntIterableRangeSet> setVariables = new HashMap<>();

	/**
	 * The model that contains all the clauses and is used by the solver for derivating the solution
	 */
	Model model;

	/**
	 * Adds a variable to the solver. Depending on the type, a new feature, group or set variable is added
	 * @param operation that contains the variable
	 * @param variable the variable to add
	 */
	private void addVariable(EvoOperation operation, EvoVariable variable, boolean bounded){
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

					addVariable(operation, childVariable, false);

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
				addVariable(operation, variable, false);
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
	public boolean determineValueOfFeatureTypeOperation(EvoFeatureType operation, HyFeature oldFeature, Variable replacedByVariable, EvoVariable variableToBeReplaced){
		Date date = new Date();

		for(EvoVariableTerm variable : operation.getVariables()){
			HyFeature feature = null;
			if(variable.getType() == EvoVariableType.EVO_TARGET || variable.getType() == EvoVariableType.EVO_IDENTIFIER){
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)variable.getVariable();
				
				// find the HyFeature of the replacement variable
				if(featureVariable.equals(variableToBeReplaced)) {
					for(HyFeature key : this.featureVariables.keySet()) {
						if(featureVariables.get(key).equals(replacedByVariable)){
							feature = key;
						}
					}
				}else
					feature = featureVariable.getFeature();
			}else if(variable.getType() == EvoVariableType.EVO_SOURCE){
				feature = oldFeature;
			}

			if(feature != null){
				if(getFeatureType(feature, date).getType() != operation.getType())
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
			if(variable.getType() == EvoVariableType.EVO_TARGET || variable.getType() == EvoVariableType.EVO_IDENTIFIER){
				EvoGroupVariable groupVariable = (EvoGroupVariable)variable.getVariable();
				group = groupVariable.getGroup();
			}else if(variable.getType() == EvoVariableType.EVO_SOURCE){
				group = oldGroup;
			}

			if(group != null){
				if(getGroupType(group, date).getType() != operation.getType())
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
	private IntIterableRangeSet getSet(HyExpression term, Date date){
		if(term instanceof EvoSetVariable){
			EvoSetVariable setTerm = (EvoSetVariable)term;
			return setVariables.get(setTerm.getName());
		}else{ // compute the set if it is not defined as a set variable
			return solveSetTerm(term, date);
		}
	}

	/**
	 * Returns the variables defined in the given abstract term and saved in the hashmap
	 * @param term
	 * @return
	 */
	private List<Variable> getVariable(HyExpression term, Date date, boolean bounded, Variable replacedByVariable, EvoVariable variableToBeReplaced){
		List<Variable> result = new ArrayList<>();
		
		if(term instanceof EvoFeatureVariable){
			EvoFeatureVariable featureVariableTerm = (EvoFeatureVariable)term;
			
			if(((EvoFeatureVariable)term).equals(variableToBeReplaced)) {
				result.add(replacedByVariable);
				return result;
			}else {
				result.add(featureVariables.get(featureVariableTerm.getFeature()));
				return result;				
			}
				

		}else if(term instanceof EvoVariableTerm){
			EvoVariableTerm variableTerm = (EvoVariableTerm)term;
			EvoFeatureVariable featureVariable = (EvoFeatureVariable)variableTerm.getVariable();
			HyFeature feature = featureVariable.getFeature();
			
			/*
			 * In case that the reference to the HyFeature was not set check if a relationship to 
			 * another variable exist and resolve it
			 */
			if(feature == null) {	
				if(((EvoFeatureVariable)variableTerm.getVariable()).equals(variableToBeReplaced)) {
					result.add(replacedByVariable);
					return result;
				}
				
				if(featureVariable.getRelation() != null) {
					EvoFeatureRelation relation = featureVariable.getRelation();
					
					if(relation.getFeatureType() == EvoFeatureVariableType.EVO_CHILD) {
						for(EvoFeatureVariable relatedFeatureVariable : relation.getRelatedFeatures()) {
							// find currently valid parent feature
							if(HyEvolutionUtil.isValid(relatedFeatureVariable.getFeature(), date)) {
								HyFeature parent = relatedFeatureVariable.getFeature();
								for(HyFeatureChild child : HyEvolutionUtil.getValidTemporalElements(parent.getParentOf(), date)) {
									for(HyGroupComposition composition : HyEvolutionUtil.getValidTemporalElements(child.getChildGroup().getParentOf(), date)) {
										int index = 0; 
										for(HyFeature childFeature : HyEvolutionUtil.getValidTemporalElements(composition.getFeatures(), date)) {		
											// add the feature to the solver
											if(!featureVariables.containsKey(childFeature)) {												
												String parentName = HyEvolutionUtil.getValidTemporalElement(parent.getNames(), date).getName();
												String childName = HyEvolutionUtil.getValidTemporalElement(childFeature.getNames(), date).getName();
												featureVariables.put(childFeature, model.intVar(parentName+'_'+childName, featureVariables.size()));
											}
											result.add(featureVariables.get(childFeature));
										}
									}
								}
							}
						}
					}
					
					return result;
				// throw an error because the variable doesn't have a relation reference and cannot be established	
				} else {
					// TODO error handling
				}
				
			}else {
				if(((EvoFeatureVariable)term).equals(variableToBeReplaced)) {
					result.add(replacedByVariable);
					return result;
				}else {
					result.add(featureVariables.get(feature));
					return result;				
				}
			}
			
			
			
		}else if(term instanceof EvoGroupVariable){
			EvoGroupVariable groupVariableTerm = (EvoGroupVariable)term;
			result.add( groupVariables.get(groupVariableTerm.getName()));
			return result;
		}

		return null;
	}

	/**
	 * Sometimes a set is not immediately visible and needs to be calculated: e.g. the intersection of two sets. 
	 * This method derivates the solution of arbitrary (set) formulas and returns the resulting set
	 * 
	 * @param term
	 * @param date
	 * @return The derivated set
	 */
	private IntIterableRangeSet solveSetTerm(HyExpression term, Date date){

		if(term instanceof EvoVariableTerm){
			EvoVariableTerm variableTerm = (EvoVariableTerm)term;
			EvoVariable variable = variableTerm.getVariable();
			
			if(variable instanceof EvoConfigurationVariable){
				IntIterableRangeSet result = new IntIterableRangeSet();
				for(HyConfigurationElement element : ((EvoConfigurationVariable) variable).getConfiguration().getElements()){
					if(element instanceof HyFeatureSelected){
						HyFeatureSelected feature = (HyFeatureSelected)element;
						
						IntVar var = featureVariables.get(feature.getSelectedFeature());
						
						// feature variable was not added to the list, add it now
						if(var == null) {
							featureVariables.put(feature.getSelectedFeature(), model.intVar(featureVariables.size()));
							
							var = featureVariables.get(feature.getSelectedFeature());
						}
						
						result.add(var.getValue());
					}
				}
				
				return result;
			}
		}else if(term instanceof EvoSetTerm){
			EvoSetTerm setTerm = (EvoSetTerm)term;

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(HyExpression variable : setTerm.getVariables()){
				EvoVariableTerm variableTerm = (EvoVariableTerm)variable;

				if(variableTerm.getVariable() instanceof EvoFeatureVariable){
					result.add(this.featureVariables.get(((EvoFeatureVariable)variableTerm.getVariable()).getFeature()).getValue());
				}
			}

			return result;
		}else if(term instanceof EvoSetIntersection){
			EvoSetIntersection intersectionTerm = (EvoSetIntersection)term;

			IntIterableRangeSet set1 = getSet(intersectionTerm.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(intersectionTerm.getOperand2(), date);

			return IntIterableSetUtils.intersection(set1, set2);
		}else if(term instanceof EvoSetUnion){
			EvoSetUnion unionTerm = (EvoSetUnion)term;

			IntIterableRangeSet set1 = getSet(unionTerm.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(unionTerm.getOperand2(), date);

			return IntIterableSetUtils.union(set1, set2);
		}else if(term instanceof EvoSetDifference){
			EvoSetDifference differenceTerm = (EvoSetDifference)term;

			IntIterableRangeSet set1 = getSet(differenceTerm.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(differenceTerm.getOperand2(), date);

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(int i : set1){
				if(!set2.contains(i))
					result.add(i);
			}	

			return result;
		}else if(term instanceof EvoSetSymmetricDifference){
			EvoSetSymmetricDifference differenceTerm = (EvoSetSymmetricDifference)term;

			IntIterableRangeSet set1 = getSet(differenceTerm.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(differenceTerm.getOperand2(), date);

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

	/**
	 * Solves all cardinality based terms and adds corresponding clauses to the solver. 
	 * @param term
	 * @param relationTerm options are equal and unequal
	 * @param date
	 * @param equal boolean flag to indicate if cardinality has to be equal to a certain value or unequal to it
	 */
	private void solveSetCardinality(HyExpression term, HyBinaryExpression relationTerm, Date date, Boolean equal){

		if(relationTerm.getOperand1() instanceof EvoSetCardinality){
			EvoSetCardinality leftCardinalityTerm = (EvoSetCardinality)term;
			IntIterableRangeSet leftSet = getSet(leftCardinalityTerm.getOperand(), date);

			if(relationTerm.getOperand2() instanceof EvoSetCardinality){
				EvoSetCardinality rightCardinalityTerm = (EvoSetCardinality)term;
				IntIterableRangeSet rightSet = getSet(rightCardinalityTerm.getOperand(), date);	

				BoolVar result = model.boolVar(leftSet.size() == rightSet.size());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}else if(relationTerm.getOperand2() instanceof EvoSize){
				BoolVar result = model.boolVar(leftSet.size() == ((EvoSize)relationTerm.getOperand2()).getSize());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}
		}else if(relationTerm.getOperand2() instanceof EvoSetCardinality){
			EvoSetCardinality rightCardinalityTerm = (EvoSetCardinality)term;
			IntIterableRangeSet rightSet = getSet(rightCardinalityTerm.getOperand(), date);

			if(relationTerm.getOperand1() instanceof EvoSetCardinality){
				EvoSetCardinality leftCardinalityTerm = (EvoSetCardinality)term;
				IntIterableRangeSet leftSet = getSet(leftCardinalityTerm.getOperand(), date);	

				BoolVar result = model.boolVar(leftSet.size() == rightSet.size());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}else if(relationTerm.getOperand1() instanceof EvoSize){
				BoolVar result = model.boolVar(rightSet.size() == ((EvoSize)relationTerm.getOperand2()).getSize());
				
				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}
		}	
	}
	
	/**
	 * walks through the formula and translates it into clauses that are added to the solver.
	 * @param term
	 * @param parentTerm
	 * @param date
	 * @return
	 */
	private ILogical solveTerm(HyExpression term, HyExpression parentTerm, Date date, Variable replacedByVariable, EvoVariable variableToBeReplaced){
		if(term instanceof HyAndExpression){
			HyAndExpression andTerm = (HyAndExpression)term;

			BoolVar result = model.boolVar();
			
			BoolVar v1 = (BoolVar)solveTerm(andTerm.getOperand1(), andTerm, date, replacedByVariable, variableToBeReplaced);
			BoolVar v2 = (BoolVar)solveTerm(andTerm.getOperand2(), andTerm, date, replacedByVariable, variableToBeReplaced);
			
			model.addClauseTrue(v1);
			model.addClauseTrue(v2);
			
			return result;
		}else if(term instanceof HyOrExpression){
			HyOrExpression orTerm = (HyOrExpression)term;
			
			BoolVar v1 = (BoolVar)solveTerm(orTerm.getOperand1(), orTerm, date, replacedByVariable, variableToBeReplaced);
			BoolVar v2 = (BoolVar)solveTerm(orTerm.getOperand2(), orTerm, date, replacedByVariable, variableToBeReplaced);
			
			BoolVar result = model.boolVar();
			model.addClausesBoolOrEqVar(v1, v2, result);
			model.addClauseTrue(result);
			
			return result;
		}else if(term instanceof EvoXOr){
			EvoXOr xorTerm = (EvoXOr)term;
			return LogOp.xor(solveTerm(xorTerm.getOperand1(), xorTerm, date, replacedByVariable, variableToBeReplaced), 
							 solveTerm(xorTerm.getOperand2(), xorTerm, date, replacedByVariable, variableToBeReplaced));
		}else if(term instanceof HyNotExpression){
			HyNotExpression notTerm = (HyNotExpression)term;
			BoolVar var1 = model.boolVar();
			LogOp.reified(var1, solveTerm(notTerm.getOperand(), notTerm, date, replacedByVariable, variableToBeReplaced));

			if(!model.addClauseFalse(var1)){
				System.err.println("Error: not clause could not be added to the model");
			}
		}else if(term instanceof HyEqualExpression){
			HyEqualExpression equalTerm = (HyEqualExpression)term;
			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(equalTerm.getOperand1() instanceof EvoSetCardinality){
				solveSetCardinality(equalTerm.getOperand1(), equalTerm, date, true);
			}
			if(equalTerm.getOperand2() instanceof EvoSetCardinality){
				solveSetCardinality(equalTerm.getOperand2(), equalTerm, date, true);
			}
			if(!(equalTerm.getOperand1() instanceof EvoSetCardinality || equalTerm.getOperand2() instanceof EvoSetCardinality)){
				LogOp.reified(var1, solveTerm(equalTerm.getOperand1(), equalTerm, date, replacedByVariable, variableToBeReplaced));
				LogOp.reified(var2, solveTerm(equalTerm.getOperand2(), equalTerm, date, replacedByVariable, variableToBeReplaced));

				if(!model.addClausesBoolEq(var1, var2)){
					System.err.println("Error: equal clause could not be added to the model");
				}				
			}


		}else if(term instanceof HyNotEqualExpression){
			HyNotEqualExpression unequalTerm = (HyNotEqualExpression)term;

			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(unequalTerm.getOperand1() instanceof EvoSetCardinality){
				solveSetCardinality(unequalTerm.getOperand1(), unequalTerm, date, false);
			}
			if(unequalTerm.getOperand2() instanceof EvoSetCardinality){
				solveSetCardinality(unequalTerm.getOperand2(), unequalTerm, date, false);
			}
			if(!(unequalTerm.getOperand1() instanceof EvoSetCardinality || unequalTerm.getOperand2() instanceof EvoSetCardinality)){
				LogOp.reified(var1, solveTerm(unequalTerm.getOperand1(), unequalTerm, date, replacedByVariable, variableToBeReplaced));
				LogOp.reified(var2, solveTerm(unequalTerm.getOperand2(), unequalTerm, date, replacedByVariable, variableToBeReplaced));

				if(!model.addClausesBoolNot(var1, var2)){
					System.err.println("Error: unequal clause could not be added to the model");
				}
			}


		}else if(term instanceof HyImpliesExpression){
			HyImpliesExpression implicationTerm = (HyImpliesExpression)term;

			return LogOp.implies(solveTerm(implicationTerm.getOperand1(), implicationTerm, date, replacedByVariable, variableToBeReplaced), 
								 solveTerm(implicationTerm.getOperand2(), implicationTerm, date, replacedByVariable, variableToBeReplaced));
		}else if(term instanceof EvoBiconditional){
			EvoBiconditional biconditionalTerm = (EvoBiconditional)term;

			return LogOp.ifOnlyIf(solveTerm(biconditionalTerm.getOperand1(), biconditionalTerm, date, replacedByVariable, variableToBeReplaced), 
								  solveTerm(biconditionalTerm.getOperand2(), biconditionalTerm, date, replacedByVariable, variableToBeReplaced));
		}else if(term instanceof EvoFeatureType){
			EvoFeatureType featureTypeTerm = (EvoFeatureType)term;

			BoolVar result = model.boolVar("ft_"+(new Date()), determineValueOfFeatureTypeOperation(featureTypeTerm, null, replacedByVariable, variableToBeReplaced));

			if(parentTerm == null)
				model.addClauseTrue(result);
			
			return result;
		}else if(term instanceof EvoGroupType){	
			EvoGroupType groupTypeTerm = (EvoGroupType)term;

			BoolVar result =  model.boolVar("gt_"+(new Date()), determineValueOfGroupTypeOperation(groupTypeTerm, null));
			
			if(parentTerm == null)
				model.addClauseTrue(result);
			
			return result;
		}else if(term instanceof EvoSetElementOf){
			EvoSetElementOf setElementOfTerm = (EvoSetElementOf)term;

			IntIterableRangeSet set = getSet(setElementOfTerm.getOperand2(), date);
			IntVar var = (IntVar)getVariable(setElementOfTerm.getOperand1(), date, false, replacedByVariable, variableToBeReplaced).get(0);
			boolean value = IntIterableSetUtils.includedIn(var, set);

			BoolVar variable = model.boolVar(value);
			
			if(parentTerm == null)
				model.addClauseTrue(variable);
			
			if(parentTerm instanceof HyNotExpression)
				model.addClauseFalse(variable);

			return variable;			 
		}else if(term instanceof EvoSetInclusion){
			EvoSetInclusion inclusionTerm = (EvoSetInclusion)term;

			IntIterableRangeSet set1 = getSet(inclusionTerm.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(inclusionTerm.getOperand2(), date);

			BoolVar variable = model.boolVar(IntIterableSetUtils.includedIn(set1, set2));
			model.addClauseTrue(variable);
			return variable;		
		}else if(term instanceof EvoSetNotElementOf){
			EvoSetNotElementOf elementOfTerm = (EvoSetNotElementOf)term;

			IntVar element = (IntVar)getVariable(elementOfTerm.getOperand1(), date, false, replacedByVariable, variableToBeReplaced).get(0);
			IntIterableRangeSet set = getSet(elementOfTerm.getOperand2(), date);

			return model.boolVar(IntIterableSetUtils.notIncludedIn(element, set));
		}else if(term instanceof EvoForAll){
			EvoForAll forAllTerm = (EvoForAll)term;
			List<Variable> variables = new ArrayList<>();
			
			BoolVar result = model.boolVar();
			
			List<BoolVar> operationResults = new ArrayList<>();
			for(EvoVariableTerm variableTerm : forAllTerm.getBoundedVariables()){
				List<Variable> resolvedVariables = getVariable(variableTerm, date, false, replacedByVariable, variableToBeReplaced);
				
				for(Variable resolvedVariable: resolvedVariables) {
					operationResults.add((BoolVar)solveTerm(forAllTerm.getOperand(), forAllTerm, date, resolvedVariable, variableTerm.getVariable()));
				}

				
				
			}
			 
			BoolVar[] operationResultsArray = new BoolVar[operationResults.size()];
			operationResultsArray = operationResults.toArray(operationResultsArray);
			
			model.addClausesBoolAndArrayEqVar(operationResultsArray, result);
			model.addClauseTrue(result);
			return result;
		}

		return null;
	}

	/**
	 * Checks for all in the given guidance table defined anomalies if one occures
	 * @param guidanceTable
	 */
	public List<EvoAnomaly> solve(EvoGuidanceTable guidanceTable){
		model = new Model("");
		
		featureVariables.clear();
		groupVariables.clear();
		setVariables.clear();

		// get all variables defined in each triggering operation and add them to the solver
		collectVariables(guidanceTable);

		List<EvoAnomaly> anomalies = new ArrayList<>();
		
		for(EvoAnomaly anomaly : guidanceTable.getAnomalies()){
			solveTerm(anomaly.getCondition().getTerm(), null, new Date(), null, null);

			Solver solver = model.getSolver();
			solver.setSearch(Search.defaultSearch(model));
			
			// a condition for an anomaly was true so inform the user with the help of the guidance element
			if(solver.solve()){
				anomalies.add(anomaly);
			}else{
				System.err.println(":(");
			}			
		}

		return anomalies;
	}
}
