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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import de.evorepair.analysis.operator.EvoGuidanceMappingRepairOperator;
import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.eclipse.util.EvoEclipseUtil;
import de.evorepair.evolution.operation.EvoOperation;
import de.evorepair.evolution.variable.EvoConfigurationVariable;
import de.evorepair.evolution.variable.EvoFeatureRelation;
import de.evorepair.evolution.variable.EvoFeatureVariable;
import de.evorepair.evolution.variable.EvoFeatureVariableType;
import de.evorepair.evolution.variable.EvoGroupVariable;
import de.evorepair.evolution.variable.EvoMappingVariable;
import de.evorepair.evolution.variable.EvoSetVariable;
import de.evorepair.evolution.variable.EvoVariable;
import de.evorepair.evolution.variable.EvoVariableType;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoConfigurationAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.guidance.evoguidancecatalog.EvoMappingAnomaly;
import de.evorepair.logic.EvoAbstractQuantifierExpression;
import de.evorepair.logic.EvoBiconditionalExpression;
import de.evorepair.logic.EvoChildrenOfExpression;
import de.evorepair.logic.EvoElementOfExpression;
import de.evorepair.logic.EvoFeatureTypeExpression;
import de.evorepair.logic.EvoForAllExpression;
import de.evorepair.logic.EvoGroupTypeExpression;
import de.evorepair.logic.EvoParentOfExpression;
import de.evorepair.logic.EvoSetCardinalityExpression;
import de.evorepair.logic.EvoSetDifferenceExpression;
import de.evorepair.logic.EvoSetExpression;
import de.evorepair.logic.EvoSetInclusionExpression;
import de.evorepair.logic.EvoSetIntersectionExpression;
import de.evorepair.logic.EvoSetNotElementOfExpression;
import de.evorepair.logic.EvoSetSymmetricDifferenceExpression;
import de.evorepair.logic.EvoSetUnionExpression;
import de.evorepair.logic.EvoSizeExpression;
import de.evorepair.logic.EvoVariableExpression;
import de.evorepair.logic.EvoXOrExpression;
import eu.hyvar.evolution.HyTemporalElement;
import eu.hyvar.evolution.util.HyEvolutionUtil;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.HyFeatureChild;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.HyFeatureType;
import eu.hyvar.feature.HyGroup;
import eu.hyvar.feature.HyGroupComposition;
import eu.hyvar.feature.HyGroupType;
import eu.hyvar.feature.configuration.HyConfiguration;
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
import eu.hyvar.feature.mapping.HyMapping;
import eu.hyvar.feature.mapping.HyMappingModel;

/**
 * Solver to check expressions of anomalies. If a expression is satisfiable, all anomalies of a given guidance table are returned for further studying.
 * 
 * @author Gil Engel
 *
 */
public class EvoSolver {
	HyFeatureModel featureModel;

	/**
	 * Contains all for the solver necessary features of a model. The key to identify the feature is a HyFeature
	 */
	HashMap<String, IntVar> featureVariables = new HashMap<>();

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

	EObject linkedModel;

	EvoResourceProvider configurationModelProvider;
	EvoResourceProvider mappingModelProvider;

	public EvoSolver(HyFeatureModel featureModel) {
		super();
		this.featureModel = featureModel;
	}

	/**
	 * Adds a variable to the solver. Depending on the type, a new feature, group or set variable is added
	 * @param operation that contains the variable
	 * @param variable the variable to add
	 */
	private void addVariable(EvoOperation operation, EvoVariable variable, boolean bounded){
		if(variable instanceof EvoFeatureVariable){
			EvoFeatureVariable featureVariable = (EvoFeatureVariable)variable;

			String key = createVariableName(operation, variable);
			if(featureVariable == null || featureVariable.getFeature() == null)
				System.out.println("");

			featureVariables.put(featureVariable.getFeature().getId(), model.intVar(key, featureVariables.size()));
		}else if(variable instanceof EvoGroupVariable){
			EvoGroupVariable groupVariable = (EvoGroupVariable)variable;

			String key = createVariableName(operation, variable);
			groupVariables.put(groupVariable.getGroup(), model.intVar(key, groupVariables.size()));
		}else if(variable instanceof EvoSetVariable){
			EvoSetVariable setVariable = (EvoSetVariable)variable;

			String key = createVariableName(operation, variable);
			IntIterableRangeSet set = new IntIterableRangeSet();

			for(EvoVariable childVariable : setVariable.getElements()){

				// obtain the corresponding key
				HyTemporalElement childKey = null;
				if(childVariable instanceof EvoFeatureVariable)
					childKey = ((EvoFeatureVariable)childVariable).getFeature();
				if(childVariable instanceof EvoGroupVariable)
					childKey = ((EvoGroupVariable)childVariable).getGroup();

				// the variable was not added to the solver yet, add it immediatly to continue
				if( !featureVariables.containsKey(childKey.getId()) &&
						!groupVariables.containsKey(childKey) && 
						!setVariables.containsKey(createVariableName(operation, childVariable))){

					addVariable(operation, childVariable, false);

					if(featureVariables.containsKey(childKey.getId()))
						set.add(featureVariables.get(childKey.getId()).getValue());
					if(groupVariables.containsKey(childKey))
						set.add(featureVariables.get(childKey.getId()).getValue());
				}
			}

			setVariables.put(key, set);
		}
	}

	/**
	 * Collect variables of a guidance table and adds them to the solver
	 * @param guidanceTable table where the 
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
	 * @param operation represents the term that contains the feature and the type for checking
	 * @param date defines the timestamp to be used to determine the feature type value
	 * @return Returns true if the feature has the correct type, else otherwise
	 */
	public boolean determineValueOfFeatureTypeOperation(EvoFeatureTypeExpression operation, Date date, Variable replacedByVariable, EvoVariable variableToBeReplaced){


		for(EvoVariableExpression variable : operation.getVariables()){
			HyFeature feature = null;
			if(variable.getType() == EvoVariableType.EVO_NOT_SPECIFIED || variable.getType() == EvoVariableType.EVO_POST){
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)variable.getVariable();

				// find the HyFeature of the replacement variable
				if(featureVariable.equals(variableToBeReplaced)) {
					for(String key : this.featureVariables.keySet()) {
						if(featureVariables.get(key).equals(replacedByVariable)){
							for(HyFeature modelFeature : featureModel.getFeatures()) {
								if(modelFeature.getId().equals(key))
									feature = modelFeature;
							}
						}
					}
				}else
					feature = featureVariable.getFeature();
			}

			if(feature != null){
				if(getFeatureType(feature, date).getType() != operation.getType())
					return false;
			}else{ 
				System.err.println("Error: feature in EvoVariableType operation could not be deExpressionined.");
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
	 * @return Returns true if the group has the desired type, else otherwise
	 */
	public boolean determineValueOfGroupTypeOperation(EvoGroupTypeExpression operation, HyGroup oldGroup){
		Date date = new Date();

		for(EvoVariableExpression variable : operation.getVariables()){
			HyGroup group = null;
			if(variable.getType() == EvoVariableType.EVO_NOT_SPECIFIED || variable.getType() == EvoVariableType.EVO_POST){
				EvoGroupVariable groupVariable = (EvoGroupVariable)variable.getVariable();
				group = groupVariable.getGroup();
			}else if(variable.getType() == EvoVariableType.EVO_PRE){
				group = oldGroup;
			}

			if(group != null){
				if(getGroupType(group, date).getType() != operation.getType())
					return false;
			}else{ 
				System.err.println("Error: group in EvoGroupType operation could not be deExpressionined.");
				return false;
			}

		}

		return true;
	}	

	/**
	 * Returns the set variable, saved in the hashmap or calls a function to compute the corresponding set
	 * @param Expression
	 * @return
	 */
	private IntIterableRangeSet getSet(HyExpression Expression, Date date){
		if(Expression instanceof EvoSetVariable){
			EvoSetVariable setExpression = (EvoSetVariable)Expression;
			return setVariables.get(setExpression.getName());
		}else{ // compute the set if it is not defined as a set variable
			return solveSetExpression(Expression, date);
		}
	}

	/**
	 * Returns the variables defined in the given abstract expression and saved in the hashmap
	 * @param expression
	 * @return a list of all variables defined as by the given expression
	 */
	private List<Variable> getVariables(HyExpression expression, Date date, boolean bounded, Variable replacedByVariable, EvoVariable variableToBeReplaced){
		List<Variable> result = new ArrayList<>();

		if(expression instanceof EvoFeatureVariable){
			EvoFeatureVariable featureVariableExpression = (EvoFeatureVariable)expression;

			if(((EvoFeatureVariable)expression).equals(variableToBeReplaced)) {
				result.add(replacedByVariable);
				return result;
			}else {
				result.add(featureVariables.get(featureVariableExpression.getFeature().getId()));
				return result;				
			}


		}else if(expression instanceof EvoVariableExpression){
			EvoVariableExpression variableExpression = (EvoVariableExpression)expression;
			EvoVariable variable = variableExpression.getVariable();
			if(variable instanceof EvoFeatureVariable) {
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)variableExpression.getVariable();
				HyFeature feature = featureVariable.getFeature();

				/*
				 * In case that the reference to the HyFeature was not set check if a relationship to 
				 * another variable exist and resolve it
				 */
				if(feature == null) {	
					if(((EvoFeatureVariable)variableExpression.getVariable()).equals(variableToBeReplaced)) {
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

											for(HyFeature childFeature : HyEvolutionUtil.getValidTemporalElements(composition.getFeatures(), date)) {		
												// add the feature to the solver
												if(!featureVariables.containsKey(childFeature.getId())) {												
													String parentName = HyEvolutionUtil.getValidTemporalElement(parent.getNames(), date).getName();
													String childName = HyEvolutionUtil.getValidTemporalElement(childFeature.getNames(), date).getName();
													featureVariables.put(childFeature.getId(), model.intVar(parentName+'_'+childName, featureVariables.size()));
												}
												result.add(featureVariables.get(childFeature.getId()));
											}
										}
									}
								}
							}
						}

						return result;
					}

				}else {
					if(((EvoVariableExpression)expression).getVariable().equals(variableToBeReplaced)) {
						result.add(replacedByVariable);
						return result;
					}else {
						result.add(featureVariables.get(feature.getId()));
						return result;				
					}
				}

			}

		}else if(expression instanceof EvoGroupVariable){
			EvoGroupVariable groupVariableExpression = (EvoGroupVariable)expression;
			result.add( groupVariables.get(groupVariableExpression.getGroup()));
			return result;
		}

		return null;
	}



	/**
	 * Sometimes a set is not immediately visible and needs to be calculated: e.g. the intersection of two sets. 
	 * This method derivates the solution of arbitrary (set) formulas and returns the resulting set
	 * 
	 * @param expression the expression to be solved
	 * @param date the date when set expressions are solved
	 * @return The derivated set
	 */
	private IntIterableRangeSet solveSetExpression(HyExpression expression, Date date){

		if(expression instanceof EvoVariableExpression){
			EvoVariableExpression variableExpression = (EvoVariableExpression)expression;
			EvoVariable variable = variableExpression.getVariable();

			if(variable instanceof EvoConfigurationVariable){
				IntIterableRangeSet result = new IntIterableRangeSet();

				HyConfiguration configuration;
				String filename = ((EvoConfigurationVariable) variable).getConfiguration();
				if(filename == null && linkedModel instanceof HyConfiguration) {
					configuration = (HyConfiguration)linkedModel;
				}else {
					if(configurationModelProvider == null)
						return new IntIterableRangeSet();

					URI relativeURI = EvoEclipseUtil.platformURIForRelativeFile(this.featureModel, filename);
					configuration = (HyConfiguration)configurationModelProvider.getResource(relativeURI);
				}
				if(configuration == null) { 
					return new IntIterableRangeSet();
				}


				for(HyConfigurationElement element : configuration.getElements()){
					if(element instanceof HyFeatureSelected){
						HyFeatureSelected feature = (HyFeatureSelected)element;

						IntVar var = featureVariables.get(feature.getSelectedFeature().getId());

						// feature variable was not added to the list, add it now
						if(var == null) {
							featureVariables.put(feature.getSelectedFeature().getId(), model.intVar(featureVariables.size()));

							var = featureVariables.get(feature.getSelectedFeature().getId());
						}

						result.add(var.getValue());
					}
				}

				return result;
			}
		}else if(expression instanceof EvoSetExpression){
			EvoSetExpression setExpression = (EvoSetExpression)expression;

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(HyExpression variable : setExpression.getVariables()){
				EvoVariableExpression variableExpression = (EvoVariableExpression)variable;

				if(variableExpression.getVariable() instanceof EvoFeatureVariable){
					result.add(this.featureVariables.get(((EvoFeatureVariable)variableExpression.getVariable()).getFeature().getId()).getValue());
				}
			}

			return result;
		}else if(expression instanceof EvoSetIntersectionExpression){
			EvoSetIntersectionExpression intersectionExpression = (EvoSetIntersectionExpression)expression;

			IntIterableRangeSet set1 = getSet(intersectionExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(intersectionExpression.getOperand2(), date);

			return IntIterableSetUtils.intersection(set1, set2);
		}else if(expression instanceof EvoSetUnionExpression){
			EvoSetUnionExpression unionExpression = (EvoSetUnionExpression)expression;

			IntIterableRangeSet set1 = getSet(unionExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(unionExpression.getOperand2(), date);

			return IntIterableSetUtils.union(set1, set2);
		}else if(expression instanceof EvoSetDifferenceExpression){
			EvoSetDifferenceExpression differenceExpression = (EvoSetDifferenceExpression)expression;

			IntIterableRangeSet set1 = getSet(differenceExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(differenceExpression.getOperand2(), date);

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(int i : set1){
				if(!set2.contains(i))
					result.add(i);
			}	

			return result;
		}else if(expression instanceof EvoSetSymmetricDifferenceExpression){
			EvoSetSymmetricDifferenceExpression differenceExpression = (EvoSetSymmetricDifferenceExpression)expression;

			IntIterableRangeSet set1 = getSet(differenceExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(differenceExpression.getOperand2(), date);

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
		}else if(expression instanceof EvoParentOfExpression){
			EvoParentOfExpression parentOfExpression = (EvoParentOfExpression)expression;
			EvoFeatureVariable variable = (EvoFeatureVariable)parentOfExpression.getVariable();

			IntIterableRangeSet set = new IntIterableRangeSet();
			List<HyFeature> children = new ArrayList<>();
			for(HyFeatureChild featureChild : HyEvolutionUtil.getValidTemporalElements(variable.getFeature().getParentOf(), date)){
				for(HyGroupComposition groupComposition : HyEvolutionUtil.getValidTemporalElements(featureChild.getChildGroup().getParentOf(), date)){
					for(HyFeature feature : groupComposition.getFeatures())
						if(HyEvolutionUtil.isValid(feature, date)){
							children.add(feature);

							if(featureVariables.containsKey(feature.getId())){
								set.add(featureVariables.get(feature.getId()).getValue());
							}else{
								IntVar intVar = model.intVar(featureVariables.size());
								featureVariables.put(feature.getId(), intVar);

								set.add(intVar.getValue());
							}

						}					
				}
			}

			return set;
		}else if(expression instanceof EvoChildrenOfExpression){
			EvoChildrenOfExpression childrenOfExpression = (EvoChildrenOfExpression)expression;
			EvoFeatureVariable variable = (EvoFeatureVariable)childrenOfExpression.getVariable();

			HyGroupComposition groupComposition = HyEvolutionUtil.getValidTemporalElement(variable.getFeature().getGroupMembership(), date);
			HyFeatureChild featureChild = HyEvolutionUtil.getValidTemporalElement(groupComposition.getCompositionOf().getChildOf(), date);
			HyFeature feature = featureChild.getParent();

			IntIterableRangeSet set = new IntIterableRangeSet();
			if(featureVariables.containsKey(feature.getId())){
				set.add(featureVariables.get(feature.getId()).getValue());
			}else{
				IntVar intVar = model.intVar(featureVariables.size());
				featureVariables.put(feature.getId(), intVar);
				set.add(intVar.getValue());
			}			

			return set;
		}

		return null;
	}

	/**
	 * Solves all cardinality based Expressions and adds corresponding clauses to the solver. 
	 * @param Expression
	 * @param relationExpression options are equal and unequal
	 * @param date
	 * @param equal boolean flag to indicate if cardinality has to be equal to a certain value or unequal to it
	 */
	private void solveSetCardinality(HyExpression Expression, HyBinaryExpression relationExpression, Date date, Boolean equal){

		if(relationExpression.getOperand1() instanceof EvoSetCardinalityExpression){
			EvoSetCardinalityExpression leftCardinalityExpression = (EvoSetCardinalityExpression)Expression;
			IntIterableRangeSet leftSet = getSet(leftCardinalityExpression.getOperand(), date);

			if(relationExpression.getOperand2() instanceof EvoSetCardinalityExpression){
				EvoSetCardinalityExpression rightCardinalityExpression = (EvoSetCardinalityExpression)Expression;
				IntIterableRangeSet rightSet = getSet(rightCardinalityExpression.getOperand(), date);	

				BoolVar result = model.boolVar(leftSet.size() == rightSet.size());

				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}else if(relationExpression.getOperand2() instanceof EvoSizeExpression){
				BoolVar result = model.boolVar(leftSet.size() == ((EvoSizeExpression)relationExpression.getOperand2()).getSize());

				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}
		}else if(relationExpression.getOperand2() instanceof EvoSetCardinalityExpression){
			EvoSetCardinalityExpression rightCardinalityExpression = (EvoSetCardinalityExpression)Expression;
			IntIterableRangeSet rightSet = getSet(rightCardinalityExpression.getOperand(), date);

			if(relationExpression.getOperand1() instanceof EvoSetCardinalityExpression){
				EvoSetCardinalityExpression leftCardinalityExpression = (EvoSetCardinalityExpression)Expression;
				IntIterableRangeSet leftSet = getSet(leftCardinalityExpression.getOperand(), date);	

				BoolVar result = model.boolVar(leftSet.size() == rightSet.size());

				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}else if(relationExpression.getOperand1() instanceof EvoSizeExpression){
				BoolVar result = model.boolVar(rightSet.size() == ((EvoSizeExpression)relationExpression.getOperand2()).getSize());

				if(equal)
					model.addClauseTrue(result);
				else
					model.addClauseFalse(result);
			}
		}	
	}

	/**
	 * Walks through the formula and translates it into clauses that are added to the solver.
	 * @param expression
	 * @param parentExpression
	 * @param date
	 * @return part expression that can be connected by clauses
	 */
	private ILogical solveExpression(HyExpression expression, HyExpression parentExpression, Date date, Variable replacedByVariable, EvoVariable boundedVariable){
		if(expression instanceof HyAndExpression){
			HyAndExpression andExpression = (HyAndExpression)expression;

			BoolVar v1 = (BoolVar)solveExpression(andExpression.getOperand1(), andExpression, date, replacedByVariable, boundedVariable);
			BoolVar v2 = (BoolVar)solveExpression(andExpression.getOperand2(), andExpression, date, replacedByVariable, boundedVariable);

			if(!(andExpression.getOperand1() instanceof HyNotExpression))
				model.addClauseTrue(v1);
			if(!(andExpression.getOperand2() instanceof HyNotExpression))
				model.addClauseTrue(v2);			

			BoolVar result = model.boolVar();
			model.addClauseTrue(result);

			return result;
		}else if(expression instanceof HyOrExpression){
			HyOrExpression orExpression = (HyOrExpression)expression;

			BoolVar v1 = (BoolVar)solveExpression(orExpression.getOperand1(), orExpression, date, replacedByVariable, boundedVariable);
			BoolVar v2 = (BoolVar)solveExpression(orExpression.getOperand2(), orExpression, date, replacedByVariable, boundedVariable);

			BoolVar result = model.boolVar();
			model.addClausesBoolOrEqVar(v1, v2, result);
			model.addClauseTrue(result);

			return result;
		}else if(expression instanceof EvoXOrExpression){
			EvoXOrExpression xorExpression = (EvoXOrExpression)expression;
			return LogOp.xor(solveExpression(xorExpression.getOperand1(), xorExpression, date, replacedByVariable, boundedVariable), 
					solveExpression(xorExpression.getOperand2(), xorExpression, date, replacedByVariable, boundedVariable));
		}else if(expression instanceof HyNotExpression){
			HyNotExpression notExpression = (HyNotExpression)expression;
			BoolVar var1 = model.boolVar();

			ILogical result = solveExpression(notExpression.getOperand(), notExpression, date, replacedByVariable, boundedVariable);
			if(!(result instanceof BoolVar))
				LogOp.reified(var1, result);
			else
				var1 = (BoolVar)result;

			if(!model.addClauseFalse(var1)){
				System.err.println("Error: not clause could not be added to the model");
			}

			return var1;
		}else if(expression instanceof HyEqualExpression){
			HyEqualExpression equalExpression = (HyEqualExpression)expression;
			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(equalExpression.getOperand1() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(equalExpression.getOperand1(), equalExpression, date, true);
			}
			if(equalExpression.getOperand2() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(equalExpression.getOperand2(), equalExpression, date, true);
			}
			if(!(equalExpression.getOperand1() instanceof EvoSetCardinalityExpression || equalExpression.getOperand2() instanceof EvoSetCardinalityExpression)){
				LogOp.reified(var1, solveExpression(equalExpression.getOperand1(), equalExpression, date, replacedByVariable, boundedVariable));
				LogOp.reified(var2, solveExpression(equalExpression.getOperand2(), equalExpression, date, replacedByVariable, boundedVariable));

				if(!model.addClausesBoolEq(var1, var2)){
					System.err.println("Error: equal clause could not be added to the model");
				}				
			}


		}else if(expression instanceof HyNotEqualExpression){
			HyNotEqualExpression unequalExpression = (HyNotEqualExpression)expression;

			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(unequalExpression.getOperand1() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(unequalExpression.getOperand1(), unequalExpression, date, false);
			}
			if(unequalExpression.getOperand2() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(unequalExpression.getOperand2(), unequalExpression, date, false);
			}
			if(!(unequalExpression.getOperand1() instanceof EvoSetCardinalityExpression || unequalExpression.getOperand2() instanceof EvoSetCardinalityExpression)){
				LogOp.reified(var1, solveExpression(unequalExpression.getOperand1(), unequalExpression, date, replacedByVariable, boundedVariable));
				LogOp.reified(var2, solveExpression(unequalExpression.getOperand2(), unequalExpression, date, replacedByVariable, boundedVariable));

				if(!model.addClausesBoolNot(var1, var2)){
					System.err.println("Error: unequal clause could not be added to the model");
				}
			}


		}else if(expression instanceof HyImpliesExpression){
			HyImpliesExpression implicationExpression = (HyImpliesExpression)expression;

			BoolVar result = model.boolVar();
			LogOp.reified(result, LogOp.implies(solveExpression(implicationExpression.getOperand1(), implicationExpression, date, replacedByVariable, boundedVariable), 
					solveExpression(implicationExpression.getOperand2(), implicationExpression, date, replacedByVariable, boundedVariable)));
			return result;
		}else if(expression instanceof EvoBiconditionalExpression){
			EvoBiconditionalExpression biconditionalExpression = (EvoBiconditionalExpression)expression;

			return LogOp.ifOnlyIf(solveExpression(biconditionalExpression.getOperand1(), biconditionalExpression, date, replacedByVariable, boundedVariable), 
					solveExpression(biconditionalExpression.getOperand2(), biconditionalExpression, date, replacedByVariable, boundedVariable));
		}else if(expression instanceof EvoFeatureTypeExpression){
			EvoFeatureTypeExpression featureTypeExpression = (EvoFeatureTypeExpression)expression;

			BoolVar result = model.boolVar("ft_"+(date), determineValueOfFeatureTypeOperation(featureTypeExpression, date, replacedByVariable, boundedVariable));

			if(parentExpression == null)
				model.addClauseTrue(result);

			return result;
		}else if(expression instanceof EvoGroupTypeExpression){	
			EvoGroupTypeExpression groupTypeExpression = (EvoGroupTypeExpression)expression;

			BoolVar result =  model.boolVar("gt_"+(date), determineValueOfGroupTypeOperation(groupTypeExpression, null));

			if(parentExpression == null)
				model.addClauseTrue(result);

			return result;
		}else if(expression instanceof EvoElementOfExpression){
			EvoElementOfExpression setElementOfExpression = (EvoElementOfExpression)expression;

			// mapping part of all mappings
			if(setElementOfExpression.getOperand2() instanceof EvoVariableExpression &&	((EvoVariableExpression)setElementOfExpression.getOperand2()).getVariable() instanceof EvoMappingVariable) {

				EvoMappingVariable mappingVariable = (EvoMappingVariable)((EvoVariableExpression)setElementOfExpression.getOperand2()).getVariable();

				String filename = mappingVariable.getMapping();
				HyMappingModel mappingModel;
				if(filename == null && linkedModel instanceof HyMappingModel) {
					mappingModel = (HyMappingModel)linkedModel;
				}else {
					URI relativeURI = EvoEclipseUtil.platformURIForRelativeFile(this.featureModel, mappingVariable.getMapping());
					mappingModel = (HyMappingModel)mappingModelProvider.getResource(relativeURI);										
				}

				
				BoolVar[] vars = model.boolVarArray(mappingModel.getMappings().size());
				boolean contains = false;
				for(int i=0; i<vars.length; i++) {				
					HyMapping mapping = mappingModel.getMappings().get(i);

					boolean containsExpression =  EvoGuidanceMappingRepairOperator.expressionIsContainedInExpression(mapping.getExpression(), setElementOfExpression.getOperand1());
					
					if(containsExpression)
						contains = true;
					
					vars[i] = model.boolVar(containsExpression);
				}

				BoolVar result = model.boolVar(contains);
				model.addClauseTrue(result);
				model.addClausesBoolOrArrayEqVar(vars, result);
				return result;
			}else{
				IntIterableRangeSet set = getSet(setElementOfExpression.getOperand2(), date);
				IntVar var = (IntVar)getVariables(setElementOfExpression.getOperand1(), date, false, replacedByVariable, boundedVariable).get(0);
				boolean value = IntIterableSetUtils.includedIn(var, set);

				BoolVar variable = model.boolVar(value);

				if(parentExpression == null)
					model.addClauseTrue(variable);

				return variable;	
			}
		}else if(expression instanceof EvoSetInclusionExpression){
			EvoSetInclusionExpression inclusionExpression = (EvoSetInclusionExpression)expression;

			IntIterableRangeSet set1 = getSet(inclusionExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(inclusionExpression.getOperand2(), date);

			BoolVar variable = model.boolVar(IntIterableSetUtils.includedIn(set1, set2));
			model.addClauseTrue(variable);
			return variable;		
		}else if(expression instanceof EvoSetNotElementOfExpression){
			EvoSetNotElementOfExpression elementOfExpression = (EvoSetNotElementOfExpression)expression;

			IntVar element = (IntVar)getVariables(elementOfExpression.getOperand1(), date, false, replacedByVariable, boundedVariable).get(0);
			IntIterableRangeSet set = getSet(elementOfExpression.getOperand2(), date);

			return model.boolVar(IntIterableSetUtils.notIncludedIn(element, set));
		}else if(expression instanceof EvoAbstractQuantifierExpression) {
			EvoAbstractQuantifierExpression quantifierExpression = (EvoAbstractQuantifierExpression)expression;

			BoolVar result = model.boolVar();

			List<BoolVar> operationResults = new ArrayList<>();
			for(EvoVariableExpression variableExpression : quantifierExpression.getBoundedVariables()){
				List<Variable> resolvedVariables = getVariables(variableExpression, date, false, replacedByVariable, boundedVariable);

				for(Variable resolvedVariable: resolvedVariables) {
					operationResults.add((BoolVar)solveExpression(quantifierExpression.getOperand(), quantifierExpression, date, resolvedVariable, variableExpression.getVariable()));
				}				
			}

			BoolVar[] operationResultsArray = new BoolVar[operationResults.size()];
			operationResultsArray = operationResults.toArray(operationResultsArray);

			if(expression instanceof EvoForAllExpression)
				model.addClausesBoolAndArrayEqVar(operationResultsArray, result);
			else
				model.addClausesBoolOrArrayEqVar(operationResultsArray, result);

			model.addClauseTrue(result);
			return result;			
		}else if(expression instanceof EvoVariableExpression) {

		}
		return null;
	}

	/**
	 * Checks if one of the anomalies as defined by the guidance table.
	 * @param linkedModel Represents the resource that should be checked for anomalies. Valid resources are "*.hymappingmodel" and "*.hyconfiguration"
	 * @param guidanceTable The table containing all anomalies for evaluation
	 * @param date The timestamp of the model when the model is checked. This is needed to determine the correct values like name and types for features.
	 * @see GuidanceTable
	 * 
	 * @return Returns a list with all found anomalies. In case there wheren't any anomalies found the list will be empty.
	 */
	public List<EvoAnomaly> solve(EObject linkedModel, EvoGuidanceTable guidanceTable, Date date){
		long start = System.nanoTime();

		model = new Model("");

		this.linkedModel = linkedModel;

		featureVariables.clear();
		groupVariables.clear();
		setVariables.clear();

		// get all variables defined in each triggering operation and add them to the solver
		collectVariables(guidanceTable);

		List<EvoAnomaly> anomalies = new ArrayList<>();

		for(EvoAnomaly anomaly : guidanceTable.getAnomalies()){
			// only check mapping anomalies for mapping models and configuration anomalies for configuration models
			if((anomaly instanceof EvoMappingAnomaly && linkedModel instanceof HyMappingModel) ||
			(anomaly instanceof EvoConfigurationAnomaly && linkedModel instanceof HyConfiguration)){
				model = new Model("");
				solveExpression(anomaly.getCondition().getTerm(), null, date, null, null);

				Solver solver = model.getSolver();
				solver.setSearch(Search.defaultSearch(model));

				// a condition for an anomaly was true so inform the user with the help of the guidance element
				if(solver.solve()){
					anomalies.add(anomaly);
				}					
			}
		}
		
		System.out.print(""+(System.nanoTime() - start)+',');


		return anomalies;
	}
}
