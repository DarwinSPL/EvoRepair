package de.evorepair.analysis.operator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.eclipse.util.EvoEclipseUtil;
import de.evorepair.evolution.variable.EvoConfigurationVariable;
import de.evorepair.evolution.variable.EvoFeatureVariable;
import de.evorepair.evolution.variable.EvoVariable;
import de.evorepair.logic.EvoSetDifferenceExpression;
import de.evorepair.logic.EvoSetExpression;
import de.evorepair.logic.EvoSetIntersectionExpression;
import de.evorepair.logic.EvoSetSymmetricDifferenceExpression;
import de.evorepair.logic.EvoSetUnionExpression;
import de.evorepair.logic.EvoVariableExpression;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.HyConfigurationElement;
import eu.hyvar.feature.configuration.HyConfigurationFactory;
import eu.hyvar.feature.configuration.HyFeatureSelected;
import eu.hyvar.feature.expression.HyExpression;

/**
 * Applies an action defined by a action operator and alters a configuration. The resource will be overridden
 * @author Gil Engel
 *
 */
public class EvoGuidanceConfigurationRepairOperator extends EvoGuidanceRepairOperator{

	/**
	 * Recursives solves a Expression and creates the resulting list of features
	 * @param expression to be solved
	 * @return List with features
	 */
	private HashMap<String, HyFeature> solveSetExpression(HyExpression expression){
		if(expression instanceof EvoVariableExpression){			
			EvoVariableExpression variableExpression = (EvoVariableExpression)expression;
			EvoVariable variable = variableExpression.getVariable();

			if(variableExpression.getVariable() instanceof EvoConfigurationVariable){

				HashMap<String, HyFeature> result = new HashMap<>();	
				
				HyConfiguration configuration;
				String filename = ((EvoConfigurationVariable) variable).getConfiguration();
				if(filename == null) {
					configuration = (HyConfiguration)linkedModel;
				}else {
					URI relativeURI = EvoEclipseUtil.platformURIForRelativeFile(this.model, filename);
					configuration = (HyConfiguration)resourceProvider.getResource(relativeURI);
				}
				if(configuration == null) { 
					System.err.println("Configuration not specified");
					return new HashMap<String, HyFeature>();
				}
				
				for(HyConfigurationElement element : configuration.getElements()){
					if(element instanceof HyFeatureSelected){
						HyFeatureSelected feature = (HyFeatureSelected)element;
						result.put(feature.getSelectedFeature().getId(), feature.getSelectedFeature());
					}
				}

				return result;
			}else if(variable instanceof EvoFeatureVariable){
				HashMap<String, HyFeature> result = new HashMap<>();
				
				HyFeature feature = ((EvoFeatureVariable)variable).getFeature();
				result.put(feature.getId(), feature);

				return result;
			}

		}else if(expression instanceof EvoSetExpression){
			EvoSetExpression setExpression = (EvoSetExpression)expression;

			HashMap<String, HyFeature> result = new HashMap<>();
			for(HyExpression variable : setExpression.getVariables()){
				EvoVariableExpression variableExpression = (EvoVariableExpression)variable;

				if(variableExpression.getVariable() instanceof EvoFeatureVariable){
					HyFeature feature = ((EvoFeatureVariable)variableExpression.getVariable()).getFeature();
					result.put(feature.getId(), feature);

				}
			}

			return result;
		}else if(expression instanceof EvoSetIntersectionExpression){
			EvoSetIntersectionExpression intersectionExpression = (EvoSetIntersectionExpression)expression;

			HashMap<String, HyFeature> set1 = solveSetExpression(intersectionExpression.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetExpression(intersectionExpression.getOperand2());

			HashMap<String, HyFeature> result = new HashMap<>();
			
			for(String key : set1.keySet()){
				if(set2.containsKey(key)){
					result.put(key, set1.get(key));
				}				
			}

			return result;
		}else if(expression instanceof EvoSetUnionExpression){
			EvoSetUnionExpression unionExpression = (EvoSetUnionExpression)expression;

			HashMap<String, HyFeature> set1 = solveSetExpression(unionExpression.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetExpression(unionExpression.getOperand2());

			HashMap<String, HyFeature> result = new HashMap<>();

			for(HyFeature feature : set1.values()){
				result.put(feature.getId(), feature);
			}

			for(HyFeature feature : set2.values()){
				result.put(feature.getId(), feature);
			}
			
			return result;
		}else if(expression instanceof EvoSetDifferenceExpression){
			EvoSetDifferenceExpression differenceExpression = (EvoSetDifferenceExpression)expression;

			HashMap<String, HyFeature> set1 = solveSetExpression(differenceExpression.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetExpression(differenceExpression.getOperand2());

			HashMap<String, HyFeature> result = new HashMap<>();
			for(String key : set1.keySet()){
				if(!set2.containsKey(key))
					result.put(key, set1.get(key));
			}

			return result;
		}else if(expression instanceof EvoSetSymmetricDifferenceExpression){
			EvoSetIntersectionExpression symmetricExpression = (EvoSetIntersectionExpression)expression;

			HashMap<String, HyFeature> set1 = solveSetExpression(symmetricExpression.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetExpression(symmetricExpression.getOperand2());

			HashMap<String, HyFeature> result = new HashMap<>();
			for(String key : set1.keySet()){
				if(!set2.containsKey(key))
					result.put(key, set1.get(key));
			}

			for(String key : set2.keySet()){
				if(!set1.containsKey(key))
					result.put(key, set2.get(key));
			}

			return result;
		}

		// return an empty list to avoid errors
		return new HashMap<String, HyFeature>();
	}

	/**
	 * Modifies the actual resource by removing features according to the repair operation
	 * @param configuration to be modified. Be aware that the file will be overridden
	 * @param features List of all features that will kept
	 */
	private HyConfiguration modifyConfiguration(HyConfiguration configuration, HashMap<String, HyFeature> features){
		List<HyConfigurationElement> elementsToRemove = new ArrayList<>();

		for(HyConfigurationElement element : configuration.getElements()) {
			if(element instanceof HyFeatureSelected){
				HyFeatureSelected featureSelected = (HyFeatureSelected)element;

				if(!features.containsKey(featureSelected.getSelectedFeature().getId()))
					elementsToRemove.add(element);
			}
		}
		
		for(HyFeature feature : features.values()){
			
			boolean isSelected = false;
			for(HyConfigurationElement element : configuration.getElements()) {
				if(element instanceof HyFeatureSelected){
					HyFeatureSelected featureSelected = (HyFeatureSelected)element;

					if(featureSelected.getSelectedFeature().equals(feature))
						isSelected = true;
				}
			}	
			
			if(!isSelected){
				HyFeatureSelected newSelectedFeature = HyConfigurationFactory.eINSTANCE.createHyFeatureSelected();
				newSelectedFeature.setSelectedFeature(feature);
				
				configuration.getElements().add(newSelectedFeature);
			}
		}


		// remove all features within the obsolete list
		configuration.getElements().removeAll(elementsToRemove);

		return configuration;
	}

	@Override
	public EObject perform(EObject model, EObject linkedModel, HyExpression expression, EvoResourceProvider resourceProvider) {
		this.model = model;
		this.linkedModel = linkedModel;
		
		this.resourceProvider = resourceProvider;		
		
		return modifyConfiguration((HyConfiguration)model, solveSetExpression(expression));
	}
}
