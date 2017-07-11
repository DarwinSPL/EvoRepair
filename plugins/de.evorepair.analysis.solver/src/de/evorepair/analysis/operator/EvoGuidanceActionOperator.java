package de.evorepair.analysis.operator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoVariable;
import de.evorepair.logic.evofirstorderlogic.EvoAbstractTerm;
import de.evorepair.logic.evofirstorderlogic.EvoSetDifference;
import de.evorepair.logic.evofirstorderlogic.EvoSetIntersection;
import de.evorepair.logic.evofirstorderlogic.EvoSetSymmetricDifference;
import de.evorepair.logic.evofirstorderlogic.EvoSetTerm;
import de.evorepair.logic.evofirstorderlogic.EvoSetUnion;
import de.evorepair.logic.evofirstorderlogic.EvoVariableTerm;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.HyConfigurationElement;
import eu.hyvar.feature.configuration.HyConfigurationFactory;
import eu.hyvar.feature.configuration.HyFeatureSelected;

/**
 * Applies an action defined by a action operator and alters a configuration. The resource will be overridden
 * @author Gil Engel
 *
 */
public class EvoGuidanceActionOperator {
	Resource configurationResource;

	public EvoGuidanceActionOperator(Resource configurationResource){
		this.configurationResource = configurationResource;
	}

	/**
	 * Recursives solves a term and creates the resulting list of features
	 * @param term to be solved
	 * @return List with features
	 */
	private List<HyFeature> solveSetTerm(EvoAbstractTerm term){
		if(term instanceof EvoVariableTerm){			
			EvoVariableTerm variableTerm = (EvoVariableTerm)term;
			EvoVariable variable = variableTerm.getVariable();

			if(variableTerm.getVariable() instanceof EvoConfigurationVariable){

				List<HyFeature> result = new ArrayList<>();	
				for(HyConfigurationElement element : ((EvoConfigurationVariable) variable).getConfiguration().getElements()){
					if(element instanceof HyFeatureSelected){
						HyFeatureSelected feature = (HyFeatureSelected)element;
						result.add(feature.getSelectedFeature());
					}
				}

				return result;
			}else if(variable instanceof EvoFeatureVariable){
				List<HyFeature> result = new ArrayList<>();	
				result.add(((EvoFeatureVariable)variable).getFeature());

				return result;
			}

		}else if(term instanceof EvoSetTerm){
			EvoSetTerm setTerm = (EvoSetTerm)term;

			List<HyFeature> result = new ArrayList<>();
			for(EvoAbstractTerm variable : setTerm.getVariables()){
				EvoVariableTerm variableTerm = (EvoVariableTerm)variable;

				if(variableTerm.getVariable() instanceof EvoFeatureVariable){
					result.add(((EvoFeatureVariable)variableTerm.getVariable()).getFeature());
				}
			}

			return result;
		}else if(term instanceof EvoSetIntersection){
			EvoSetIntersection intersectionTerm = (EvoSetIntersection)term;

			List<HyFeature> set1 = solveSetTerm(intersectionTerm.getLeftElement());
			List<HyFeature> set2 = solveSetTerm(intersectionTerm.getRightElement());

			List<HyFeature> result = new ArrayList<>();
			for(HyFeature feature1 : set1){
				for(HyFeature feature2 : set2){
					if(feature1.equals(feature2))
						result.add(feature2);
				}
			}

			return result;
		}else if(term instanceof EvoSetUnion){
			EvoSetIntersection intersectionTerm = (EvoSetIntersection)term;

			List<HyFeature> set1 = solveSetTerm(intersectionTerm.getLeftElement());
			List<HyFeature> set2 = solveSetTerm(intersectionTerm.getRightElement());

			List<HyFeature> result = new ArrayList<>();
			for(HyFeature feature1 : set1){
				result.add(feature1);
			}

			for(HyFeature feature2 : set2){
				if(!result.contains(feature2))
					result.add(feature2);
			}

			return result;
		}else if(term instanceof EvoSetDifference){
			EvoSetDifference differenceTerm = (EvoSetDifference)term;

			List<HyFeature> set1 = solveSetTerm(differenceTerm.getLeftElement());
			List<HyFeature> set2 = solveSetTerm(differenceTerm.getRightElement());

			List<HyFeature> result = new ArrayList<>();
			for(HyFeature feature1 : set1){
				if(!set2.contains(feature1))
					result.add(feature1);
			}

			return result;
		}else if(term instanceof EvoSetSymmetricDifference){
			EvoSetIntersection intersectionTerm = (EvoSetIntersection)term;

			List<HyFeature> set1 = solveSetTerm(intersectionTerm.getLeftElement());
			List<HyFeature> set2 = solveSetTerm(intersectionTerm.getRightElement());

			List<HyFeature> result = new ArrayList<>();
			for(HyFeature feature1 : set1){
				if(!set2.contains(feature1))
					result.add(feature1);
			}

			for(HyFeature feature2 : set2){
				if(!set1.contains(feature2))
					result.add(feature2);
			}

			return result;
		}

		// return an empty list to avoid errors
		return new ArrayList<HyFeature>();
	}

	/**
	 * Modifies the actual resource by removing features according to the repair operation
	 * @param configuration to be modified. Be aware that the file will be overridden
	 * @param features List of all features that will kept
	 */
	private void modifyConfiguration(HyConfiguration configuration, List<HyFeature> features){
		List<HyConfigurationElement> elementsToRemove = new ArrayList<>();

		for(HyConfigurationElement element : configuration.getElements()) {
			if(element instanceof HyFeatureSelected){
				HyFeatureSelected featureSelected = (HyFeatureSelected)element;

				if(!features.contains(featureSelected.getSelectedFeature()))
					elementsToRemove.add(element);
			}
		}
		
		for(HyFeature feature : features){
			
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

		// save the modified configuration
		EcoreIOUtil.saveModel(configuration);
	}

	public void perform(HyConfiguration configuration, EvoAbstractTerm term){
		modifyConfiguration(configuration, solveSetTerm(term));
	}
}
