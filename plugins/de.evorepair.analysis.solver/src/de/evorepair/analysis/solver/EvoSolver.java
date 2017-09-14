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

import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.analysis.solver.eclipse.EvoEclipseUtil;
import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.evolution.evovariable.EvoFeatureRelation;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoFeatureVariableType;
import de.evorepair.evolution.evovariable.EvoGroupVariable;
import de.evorepair.evolution.evovariable.EvoMappingVariable;
import de.evorepair.evolution.evovariable.EvoSetVariable;
import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.evolution.evovariable.EvoVariableType;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.logic.evologic.EvoAllConfigurationsExpression;
import de.evorepair.logic.evologic.EvoAllMappingsExpression;
import de.evorepair.logic.evologic.EvoBiconditionalExpression;
import de.evorepair.logic.evologic.EvoChildrenOfExpression;
import de.evorepair.logic.evologic.EvoElementOfExpression;
import de.evorepair.logic.evologic.EvoFeatureTypeExpression;
import de.evorepair.logic.evologic.EvoForAllExpression;
import de.evorepair.logic.evologic.EvoGroupTypeExpression;
import de.evorepair.logic.evologic.EvoParentOfExpression;
import de.evorepair.logic.evologic.EvoSetCardinalityExpression;
import de.evorepair.logic.evologic.EvoSetDifferenceExpression;
import de.evorepair.logic.evologic.EvoSetExpression;
import de.evorepair.logic.evologic.EvoSetInclusionExpression;
import de.evorepair.logic.evologic.EvoSetIntersectionExpression;
import de.evorepair.logic.evologic.EvoSetNotElementOfExpression;
import de.evorepair.logic.evologic.EvoSetSymmetricDifferenceExpression;
import de.evorepair.logic.evologic.EvoSetUnionExpression;
import de.evorepair.logic.evologic.EvoSizeExpression;
import de.evorepair.logic.evologic.EvoVariableExpression;
import de.evorepair.logic.evologic.EvoXOrExpression;
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

	public EvoSolver(HyFeatureModel featureModel, EvoResourceProvider configurationModelProvider, EvoResourceProvider mappingModelProvider) {
		super();
		this.featureModel = featureModel;
		this.configurationModelProvider = configurationModelProvider;
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
	public boolean determineValueOfFeatureTypeOperation(EvoFeatureTypeExpression operation, HyFeature oldFeature, Variable replacedByVariable, EvoVariable variableToBeReplaced){
		Date date = new Date();

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
			}else if(variable.getType() == EvoVariableType.EVO_PRE){
				feature = oldFeature;
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
	 * @return
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
	 * Returns the variables defined in the given abstract Expression and saved in the hashmap
	 * @param Expression
	 * @return
	 */
	private List<Variable> getVariable(HyExpression Expression, Date date, boolean bounded, Variable replacedByVariable, EvoVariable variableToBeReplaced){
		List<Variable> result = new ArrayList<>();
		
		if(Expression instanceof EvoFeatureVariable){
			EvoFeatureVariable featureVariableExpression = (EvoFeatureVariable)Expression;
			
			if(((EvoFeatureVariable)Expression).equals(variableToBeReplaced)) {
				result.add(replacedByVariable);
				return result;
			}else {
				result.add(featureVariables.get(featureVariableExpression.getFeature().getId()));
				return result;				
			}
				

		}else if(Expression instanceof EvoVariableExpression){
			EvoVariableExpression variableExpression = (EvoVariableExpression)Expression;
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
				// throw an error because the variable doesn't have a relation reference and cannot be established	
				} else {
					// TODO error handling
				}
				
			}else {
				if(((EvoVariableExpression)Expression).getVariable().equals(variableToBeReplaced)) {
					result.add(replacedByVariable);
					return result;
				}else {
					result.add(featureVariables.get(feature.getId()));
					return result;				
				}
			}
			
			
			
		}else if(Expression instanceof EvoGroupVariable){
			EvoGroupVariable groupVariableExpression = (EvoGroupVariable)Expression;
			result.add( groupVariables.get(groupVariableExpression.getGroup()));
			return result;
		}

		return null;
	}
	


	/**
	 * Sometimes a set is not immediately visible and needs to be calculated: e.g. the intersection of two sets. 
	 * This method derivates the solution of arbitrary (set) formulas and returns the resulting set
	 * 
	 * @param Expression
	 * @param date
	 * @return The derivated set
	 */
	private IntIterableRangeSet solveSetExpression(HyExpression Expression, Date date){

		if(Expression instanceof EvoVariableExpression){
			EvoVariableExpression variableExpression = (EvoVariableExpression)Expression;
			EvoVariable variable = variableExpression.getVariable();
			
			if(variable instanceof EvoConfigurationVariable){
				IntIterableRangeSet result = new IntIterableRangeSet();
				
				HyConfiguration configuration;
				String filename = ((EvoConfigurationVariable) variable).getConfiguration();
				if(filename == null) {
					configuration = (HyConfiguration)linkedModel;
				}else {
					URI relativeURI = EvoEclipseUtil.platformURIForRelativeFile(this.featureModel, filename);
					configuration = (HyConfiguration)configurationModelProvider.getResource(relativeURI);
				}
				if(configuration == null) { 
					System.err.println("Configuration not specified");
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
		}else if(Expression instanceof EvoSetExpression){
			EvoSetExpression setExpression = (EvoSetExpression)Expression;

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(HyExpression variable : setExpression.getVariables()){
				EvoVariableExpression variableExpression = (EvoVariableExpression)variable;

				if(variableExpression.getVariable() instanceof EvoFeatureVariable){
					result.add(this.featureVariables.get(((EvoFeatureVariable)variableExpression.getVariable()).getFeature().getId()).getValue());
				}
			}

			return result;
		}else if(Expression instanceof EvoSetIntersectionExpression){
			EvoSetIntersectionExpression intersectionExpression = (EvoSetIntersectionExpression)Expression;

			IntIterableRangeSet set1 = getSet(intersectionExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(intersectionExpression.getOperand2(), date);

			return IntIterableSetUtils.intersection(set1, set2);
		}else if(Expression instanceof EvoSetUnionExpression){
			EvoSetUnionExpression unionExpression = (EvoSetUnionExpression)Expression;

			IntIterableRangeSet set1 = getSet(unionExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(unionExpression.getOperand2(), date);

			return IntIterableSetUtils.union(set1, set2);
		}else if(Expression instanceof EvoSetDifferenceExpression){
			EvoSetDifferenceExpression differenceExpression = (EvoSetDifferenceExpression)Expression;

			IntIterableRangeSet set1 = getSet(differenceExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(differenceExpression.getOperand2(), date);

			IntIterableRangeSet result = new IntIterableRangeSet();
			for(int i : set1){
				if(!set2.contains(i))
					result.add(i);
			}	

			return result;
		}else if(Expression instanceof EvoSetSymmetricDifferenceExpression){
			EvoSetSymmetricDifferenceExpression differenceExpression = (EvoSetSymmetricDifferenceExpression)Expression;

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
		}else if(Expression instanceof EvoParentOfExpression){
			EvoParentOfExpression parentOfExpression = (EvoParentOfExpression)Expression;
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
		}else if(Expression instanceof EvoChildrenOfExpression){
			EvoChildrenOfExpression childrenOfExpression = (EvoChildrenOfExpression)Expression;
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
	 * Checks if a mapping is part of all to the feature model related mappings or not. Be aware, that no type check is done within this function.
	 * @param expression
	 * @return true if the mapping specified in expression is related to the feature model, false otherwise
	 */
	private boolean mappingIsPartOfAllMappings(EvoElementOfExpression expression) {
		EvoMappingVariable mappingVariable = ((EvoMappingVariable)((EvoVariableExpression)expression.getOperand1()).getVariable());
		
		URI uri = EvoEclipseUtil.platformURIForRelativeFile(featureModel, mappingVariable.getMapping());
		
		try {
			featureModel.eResource().getResourceSet().getResource(uri, true);
			return true;
		}catch(Exception e) {
			return false;
		}			
	}
	
	/**
	 * Checks if a configuration is part of all to the feature model related configurations or not. Be aware, that no type check is done within this function.
	 * @param expression
	 * @return true if the mapping specified in expression is related to the feature model, false otherwise
	 */
	private boolean configurationIsPartOfAllConfigurations(EvoElementOfExpression expression) {
		EvoConfigurationVariable mappingVariable = ((EvoConfigurationVariable)((EvoVariableExpression)expression.getOperand1()).getVariable());
	
		URI uri = EvoEclipseUtil.platformURIForRelativeFile(featureModel, mappingVariable.getConfiguration());
		
		try {
			featureModel.eResource().getResourceSet().getResource(uri, true);
			return true;
		}catch(Exception e) {
			return false;
		}		
	}
	
	/**
	 * walks through the formula and translates it into clauses that are added to the solver.
	 * @param Expression
	 * @param parentExpression
	 * @param date
	 * @return
	 */
	private ILogical solveExpression(HyExpression Expression, HyExpression parentExpression, Date date, Variable replacedByVariable, EvoVariable variableToBeReplaced){
		if(Expression instanceof HyAndExpression){
			HyAndExpression andExpression = (HyAndExpression)Expression;

			BoolVar result = model.boolVar();
			
			BoolVar v1 = (BoolVar)solveExpression(andExpression.getOperand1(), andExpression, date, replacedByVariable, variableToBeReplaced);
			BoolVar v2 = (BoolVar)solveExpression(andExpression.getOperand2(), andExpression, date, replacedByVariable, variableToBeReplaced);
			
			model.addClauseTrue(v1);
			model.addClauseTrue(v2);
			
			return result;
		}else if(Expression instanceof HyOrExpression){
			HyOrExpression orExpression = (HyOrExpression)Expression;
			
			BoolVar v1 = (BoolVar)solveExpression(orExpression.getOperand1(), orExpression, date, replacedByVariable, variableToBeReplaced);
			BoolVar v2 = (BoolVar)solveExpression(orExpression.getOperand2(), orExpression, date, replacedByVariable, variableToBeReplaced);
			
			BoolVar result = model.boolVar();
			model.addClausesBoolOrEqVar(v1, v2, result);
			model.addClauseTrue(result);
			
			return result;
		}else if(Expression instanceof EvoXOrExpression){
			EvoXOrExpression xorExpression = (EvoXOrExpression)Expression;
			return LogOp.xor(solveExpression(xorExpression.getOperand1(), xorExpression, date, replacedByVariable, variableToBeReplaced), 
							 solveExpression(xorExpression.getOperand2(), xorExpression, date, replacedByVariable, variableToBeReplaced));
		}else if(Expression instanceof HyNotExpression){
			HyNotExpression notExpression = (HyNotExpression)Expression;
			BoolVar var1 = model.boolVar();
			LogOp.reified(var1, solveExpression(notExpression.getOperand(), notExpression, date, replacedByVariable, variableToBeReplaced));

			if(!model.addClauseFalse(var1)){
				System.err.println("Error: not clause could not be added to the model");
			}
		}else if(Expression instanceof HyEqualExpression){
			HyEqualExpression equalExpression = (HyEqualExpression)Expression;
			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(equalExpression.getOperand1() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(equalExpression.getOperand1(), equalExpression, date, true);
			}
			if(equalExpression.getOperand2() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(equalExpression.getOperand2(), equalExpression, date, true);
			}
			if(!(equalExpression.getOperand1() instanceof EvoSetCardinalityExpression || equalExpression.getOperand2() instanceof EvoSetCardinalityExpression)){
				LogOp.reified(var1, solveExpression(equalExpression.getOperand1(), equalExpression, date, replacedByVariable, variableToBeReplaced));
				LogOp.reified(var2, solveExpression(equalExpression.getOperand2(), equalExpression, date, replacedByVariable, variableToBeReplaced));

				if(!model.addClausesBoolEq(var1, var2)){
					System.err.println("Error: equal clause could not be added to the model");
				}				
			}


		}else if(Expression instanceof HyNotEqualExpression){
			HyNotEqualExpression unequalExpression = (HyNotEqualExpression)Expression;

			BoolVar var1 = model.boolVar();
			BoolVar var2 = model.boolVar();

			if(unequalExpression.getOperand1() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(unequalExpression.getOperand1(), unequalExpression, date, false);
			}
			if(unequalExpression.getOperand2() instanceof EvoSetCardinalityExpression){
				solveSetCardinality(unequalExpression.getOperand2(), unequalExpression, date, false);
			}
			if(!(unequalExpression.getOperand1() instanceof EvoSetCardinalityExpression || unequalExpression.getOperand2() instanceof EvoSetCardinalityExpression)){
				LogOp.reified(var1, solveExpression(unequalExpression.getOperand1(), unequalExpression, date, replacedByVariable, variableToBeReplaced));
				LogOp.reified(var2, solveExpression(unequalExpression.getOperand2(), unequalExpression, date, replacedByVariable, variableToBeReplaced));

				if(!model.addClausesBoolNot(var1, var2)){
					System.err.println("Error: unequal clause could not be added to the model");
				}
			}


		}else if(Expression instanceof HyImpliesExpression){
			HyImpliesExpression implicationExpression = (HyImpliesExpression)Expression;

			return LogOp.implies(solveExpression(implicationExpression.getOperand1(), implicationExpression, date, replacedByVariable, variableToBeReplaced), 
								 solveExpression(implicationExpression.getOperand2(), implicationExpression, date, replacedByVariable, variableToBeReplaced));
		}else if(Expression instanceof EvoBiconditionalExpression){
			EvoBiconditionalExpression biconditionalExpression = (EvoBiconditionalExpression)Expression;

			return LogOp.ifOnlyIf(solveExpression(biconditionalExpression.getOperand1(), biconditionalExpression, date, replacedByVariable, variableToBeReplaced), 
								  solveExpression(biconditionalExpression.getOperand2(), biconditionalExpression, date, replacedByVariable, variableToBeReplaced));
		}else if(Expression instanceof EvoFeatureTypeExpression){
			EvoFeatureTypeExpression featureTypeExpression = (EvoFeatureTypeExpression)Expression;

			BoolVar result = model.boolVar("ft_"+(new Date()), determineValueOfFeatureTypeOperation(featureTypeExpression, null, replacedByVariable, variableToBeReplaced));

			if(parentExpression == null)
				model.addClauseTrue(result);
			
			return result;
		}else if(Expression instanceof EvoGroupTypeExpression){	
			EvoGroupTypeExpression groupTypeExpression = (EvoGroupTypeExpression)Expression;

			BoolVar result =  model.boolVar("gt_"+(new Date()), determineValueOfGroupTypeOperation(groupTypeExpression, null));
			
			if(parentExpression == null)
				model.addClauseTrue(result);
			
			return result;
		}else if(Expression instanceof EvoElementOfExpression){
			EvoElementOfExpression setElementOfExpression = (EvoElementOfExpression)Expression;

			// mapping part of all mappings
			if(setElementOfExpression.getOperand1() instanceof EvoVariableExpression && setElementOfExpression.getOperand2() instanceof EvoAllMappingsExpression &&
					((EvoVariableExpression)setElementOfExpression.getOperand1()).getVariable() instanceof EvoMappingVariable) {
				
				boolean isPartOfAllMappings = mappingIsPartOfAllMappings(setElementOfExpression);
		
				BoolVar result = model.boolVar(isPartOfAllMappings);
				model.addClauseTrue(result);
			}else if(setElementOfExpression.getOperand1() instanceof EvoVariableExpression && setElementOfExpression.getOperand2() instanceof EvoAllConfigurationsExpression &&
					((EvoVariableExpression)setElementOfExpression.getOperand1()).getVariable() instanceof EvoConfigurationVariable) {	
				
				boolean isPartOfAllConfigurations = configurationIsPartOfAllConfigurations(setElementOfExpression);
				
				BoolVar result = model.boolVar(isPartOfAllConfigurations);
				model.addClauseTrue(result);
			} else {
				IntIterableRangeSet set = getSet(setElementOfExpression.getOperand2(), date);
				IntVar var = (IntVar)getVariable(setElementOfExpression.getOperand1(), date, false, replacedByVariable, variableToBeReplaced).get(0);
				boolean value = IntIterableSetUtils.includedIn(var, set);
	
				BoolVar variable = model.boolVar(value);
				
				if(parentExpression == null)
					model.addClauseTrue(variable);
				
				if(parentExpression instanceof HyNotExpression)
					model.addClauseFalse(variable);

				return variable;	
			}
		}else if(Expression instanceof EvoSetInclusionExpression){
			EvoSetInclusionExpression inclusionExpression = (EvoSetInclusionExpression)Expression;

			IntIterableRangeSet set1 = getSet(inclusionExpression.getOperand1(), date);
			IntIterableRangeSet set2 = getSet(inclusionExpression.getOperand2(), date);

			BoolVar variable = model.boolVar(IntIterableSetUtils.includedIn(set1, set2));
			model.addClauseTrue(variable);
			return variable;		
		}else if(Expression instanceof EvoSetNotElementOfExpression){
			EvoSetNotElementOfExpression elementOfExpression = (EvoSetNotElementOfExpression)Expression;

			IntVar element = (IntVar)getVariable(elementOfExpression.getOperand1(), date, false, replacedByVariable, variableToBeReplaced).get(0);
			IntIterableRangeSet set = getSet(elementOfExpression.getOperand2(), date);

			return model.boolVar(IntIterableSetUtils.notIncludedIn(element, set));
		}else if(Expression instanceof EvoForAllExpression){
			EvoForAllExpression forAllExpression = (EvoForAllExpression)Expression;
			
			BoolVar result = model.boolVar();
			
			List<BoolVar> operationResults = new ArrayList<>();
			for(EvoVariableExpression variableExpression : forAllExpression.getBoundedVariables()){
				List<Variable> resolvedVariables = getVariable(variableExpression, date, false, replacedByVariable, variableToBeReplaced);
				
				for(Variable resolvedVariable: resolvedVariables) {
					operationResults.add((BoolVar)solveExpression(forAllExpression.getOperand(), forAllExpression, date, resolvedVariable, variableExpression.getVariable()));
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
	 * Checks for all in the given guidance table defined anomalies if one occurs
	 * @param guidanceTable
	 */
	public List<EvoAnomaly> solve(EObject linkedModel, EvoGuidanceTable guidanceTable){
		model = new Model("");
		
		this.linkedModel = linkedModel;
		
		featureVariables.clear();
		groupVariables.clear();
		setVariables.clear();

		// get all variables defined in each triggering operation and add them to the solver
		collectVariables(guidanceTable);

		List<EvoAnomaly> anomalies = new ArrayList<>();
		
		for(EvoAnomaly anomaly : guidanceTable.getAnomalies()){
				solveExpression(anomaly.getCondition().getTerm(), null, new Date(), null, null);
	
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
