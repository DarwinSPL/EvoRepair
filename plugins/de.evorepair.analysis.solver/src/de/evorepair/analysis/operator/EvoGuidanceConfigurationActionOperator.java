package de.evorepair.analysis.operator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.analysis.solver.eclipse.EvoEclipseUtil;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.logic.evologic.EvoSetDifference;
import de.evorepair.logic.evologic.EvoSetIntersection;
import de.evorepair.logic.evologic.EvoSetSymmetricDifference;
import de.evorepair.logic.evologic.EvoSetTerm;
import de.evorepair.logic.evologic.EvoSetUnion;
import de.evorepair.logic.evologic.EvoVariableTerm;
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
public class EvoGuidanceConfigurationActionOperator extends EvoGuidanceRepairOperator{

	/**
	 * Recursives solves a term and creates the resulting list of features
	 * @param term to be solved
	 * @return List with features
	 */
	private HashMap<String, HyFeature> solveSetTerm(HyExpression term){
		if(term instanceof EvoVariableTerm){			
			EvoVariableTerm variableTerm = (EvoVariableTerm)term;
			EvoVariable variable = variableTerm.getVariable();

			if(variableTerm.getVariable() instanceof EvoConfigurationVariable){

				HashMap<String, HyFeature> result = new HashMap<>();	
				
				String filename = ((EvoConfigurationVariable) variable).getConfiguration();
				
				URI relativeURI = EvoEclipseUtil.platformURIForRelativeFile(model, filename);
				HyConfiguration configuration = (HyConfiguration)resourceProvider.getResource(relativeURI);
				if(configuration == null) { 
					System.err.println("Configuration at path "+relativeURI.devicePath()+" couldn't be found");
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

		}else if(term instanceof EvoSetTerm){
			EvoSetTerm setTerm = (EvoSetTerm)term;

			HashMap<String, HyFeature> result = new HashMap<>();
			for(HyExpression variable : setTerm.getVariables()){
				EvoVariableTerm variableTerm = (EvoVariableTerm)variable;

				if(variableTerm.getVariable() instanceof EvoFeatureVariable){
					HyFeature feature = ((EvoFeatureVariable)variableTerm.getVariable()).getFeature();
					result.put(feature.getId(), feature);

				}
			}

			return result;
		}else if(term instanceof EvoSetIntersection){
			EvoSetIntersection intersectionTerm = (EvoSetIntersection)term;

			HashMap<String, HyFeature> set1 = solveSetTerm(intersectionTerm.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetTerm(intersectionTerm.getOperand2());

			HashMap<String, HyFeature> result = new HashMap<>();
			
			for(String key : set1.keySet()){
				if(set2.containsKey(key)){
					result.put(key, set1.get(key));
				}				
			}

			return result;
		}else if(term instanceof EvoSetUnion){
			EvoSetUnion unionTerm = (EvoSetUnion)term;

			HashMap<String, HyFeature> set1 = solveSetTerm(unionTerm.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetTerm(unionTerm.getOperand2());

			HashMap<String, HyFeature> result = new HashMap<>();

			for(HyFeature feature : set1.values()){
				result.put(feature.getId(), feature);
			}

			for(HyFeature feature : set2.values()){
				result.put(feature.getId(), feature);
			}
			
			return result;
		}else if(term instanceof EvoSetDifference){
			EvoSetDifference differenceTerm = (EvoSetDifference)term;

			HashMap<String, HyFeature> set1 = solveSetTerm(differenceTerm.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetTerm(differenceTerm.getOperand2());

			HashMap<String, HyFeature> result = new HashMap<>();
			for(String key : set1.keySet()){
				if(!set2.containsKey(key))
					result.put(key, set1.get(key));
			}

			return result;
		}else if(term instanceof EvoSetSymmetricDifference){
			EvoSetIntersection symmetricTerm = (EvoSetIntersection)term;

			HashMap<String, HyFeature> set1 = solveSetTerm(symmetricTerm.getOperand1());
			HashMap<String, HyFeature> set2 = solveSetTerm(symmetricTerm.getOperand2());

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
	public EObject perform(EObject model, HyExpression expression, EvoResourceProvider resourceProvider) {
		this.model = model;
		this.modelCopy = EcoreUtil.copy(model);
		
		this.resourceProvider = resourceProvider;
		
		// do nothing in case the parameter has the wrong type
		if(!(model instanceof HyConfiguration))
			return model;
		
		return modifyConfiguration((HyConfiguration)modelCopy, solveSetTerm(expression));
	}
}
