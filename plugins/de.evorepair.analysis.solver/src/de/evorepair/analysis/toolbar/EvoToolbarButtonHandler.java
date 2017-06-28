package de.evorepair.analysis.toolbar;



import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.evorepair.analysis.operator.EvoGuidanceActionOperator;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.evolution.evovariable.EvoFeatureRelation;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.evovariable.EvoGroupVariable;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceElement;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.configuration.HyConfiguration;

public class EvoToolbarButtonHandler extends AbstractHandler {
	EvoSolver solver = new EvoSolver();
	
	protected IEditorPart getActiveEditor(){
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	}
	
	Resource featureModelResource;
	Resource configurationModelResource;
	
	private HyFeatureModel fakeModel(EvoGuidanceTable table){
		if(featureModelResource.isModified()){
			featureModelResource.unload();
			
			try {
				featureModelResource.load(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(EvoOperation operation : table.getTriggeringOperations()){
			if(operation.getName().equals("DeleteFeatureWithCode")){
				HyFeatureModel featureModel = (HyFeatureModel) featureModelResource.getContents().get(0);

				HyConfiguration configuration = (HyConfiguration) configurationModelResource.getContents().get(0);
				EvoConfigurationVariable configurationVariable = (EvoConfigurationVariable)operation.getVariables().get(1);
				configurationVariable.setConfiguration(configuration);
				
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)operation.getVariables().get(2);
				featureVariable.setFeature(featureModel.getFeatures().get(2));
				
				EvoFeatureVariable parentVariable = (EvoFeatureVariable)operation.getVariables().get(3);
				parentVariable.setFeature(featureModel.getFeatures().get(0));
				
				EvoGroupVariable groupVariable = (EvoGroupVariable)operation.getVariables().get(4);
				groupVariable.setGroup(featureModel.getGroups().get(0));
			}
		}

	    
	    return null;	   
	}
	
	private void setFeatureVariable(EvoFeatureVariable variable){
		if(variable.getFeature() == null){
			
			// if a relation was defined, resolve it
			if(variable.getRelation() != null){
				EvoFeatureRelation relation = variable.getRelation();
				
				switch(relation.getFeatureType()){
				case EVO_SIBLING:
					
					break;
				case EVO_CHILD:
					break;
				case EVO_PARENT:
					break;
				}
			}
		}		
	}

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
       // solver.solve();
    	
    	
    	ResourceSet resSet = new ResourceSetImpl();
    	
    	featureModelResource = resSet.getResource(URI.createURI("platform:/resource/de.evorepair.test.error.definition/FeatureModel.hyfeature"), true);
    	
    	configurationModelResource = resSet.getResource(URI.createURI("platform:/resource/de.evorepair.test.error.definition/FeatureModel.hyconfigurationmodel"), true);
    	
  	    Resource guidanceResource = resSet.getResource(URI.createURI("platform:/resource/de.evorepair.test.error.definition/FeatureModel.evoguidance"), true);
 	   
  	    de.evorepair.guidance.guidancedsl.GrammarEntry e = (de.evorepair.guidance.guidancedsl.GrammarEntry)guidanceResource.getContents().get(0);
  	    EvoGuidanceTable table = (EvoGuidanceTable)e.getTable().getTables().get(0);

  	    fakeModel(table);
  	    
    	List<EvoAnomaly> anomalies = solver.solve(e.getTable().getTables().get(0));
    	for(EvoAnomaly anomaly : anomalies){
			for(EvoGuidanceElement guidance : anomaly.getGuidance()){
				if(guidance.getAction() != null){
					EvoGuidanceActionOperator operator = new EvoGuidanceActionOperator(configurationModelResource);
					operator.perform(guidance.getAction().getTerm());
				}
			}
    	}
        
        return null;
    }
    
    @Override
    public boolean isEnabled() {
    	return true;
    }

    
}
