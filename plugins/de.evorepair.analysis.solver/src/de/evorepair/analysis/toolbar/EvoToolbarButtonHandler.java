package de.evorepair.analysis.toolbar;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.darwinspl.feature.graphical.base.editor.DwGraphicalFeatureModelViewer;
import de.evorepair.analysis.operator.EvoGuidanceActionOperator;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.evolution.evovariable.EvoFeatureRelation;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceElement;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.guidance.guidancedsl.GrammarEntry;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.util.HyConfigurationUtil;

public class EvoToolbarButtonHandler extends AbstractHandler {
	EvoSolver solver = new EvoSolver();
	
	protected IEditorPart getActiveEditor(){
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	}
	
	protected HyFeatureModel getFeatureModelFromActiveEditor(){
		IEditorPart activeEditorPart = getActiveEditor();
		
		if(activeEditorPart instanceof DwGraphicalFeatureModelViewer){
			return ((DwGraphicalFeatureModelViewer)activeEditorPart).getInternalFeatureModel();
		}else{
			return null;
		}
	}
	
	Resource featureModelResource;
	Resource configurationModelResource;
	
	private HyFeatureModel fakeModel(EvoGuidanceTable table){
		// in case the resource was modified, it has to be reloaded
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
				EvoConfigurationVariable configurationVariable = (EvoConfigurationVariable)operation.getVariables().get(0);
				configurationVariable.setConfiguration(configuration);
				
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)operation.getVariables().get(1);
				featureVariable.setFeature(featureModel.getFeatures().get(2));
				
				EvoFeatureVariable parentVariable = (EvoFeatureVariable)operation.getVariables().get(2);
				parentVariable.setFeature(featureModel.getFeatures().get(0));
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

    	HyFeatureModel featureModel = getFeatureModelFromActiveEditor();
    	
    	// display an error in case that the user calls the solver without an active editor within eclipse
    	if(featureModel == null){
    		MessageDialog.openError(getActiveEditor().getSite().getShell(), "No active feature model editor", "You must open an active editor with a feature model in order to call "
    				+ "the solver");
    		return null;
    	}
    	
    	// load accompanying models
    	HyConfiguration configurationModel = EcoreIOUtil.loadAccompanyingModel(featureModel.eResource(), HyConfigurationUtil.getConfigurationModelFileExtensionForXmi());
    	GrammarEntry guidanceModel = EcoreIOUtil.loadAccompanyingModel(featureModel.eResource(), "evoguidance");
   
    	// save references to the corresponding resources
    	featureModelResource = featureModel.eResource();    	
    	configurationModelResource = configurationModel.eResource();    	
 	   
  	    EvoGuidanceTable table = (EvoGuidanceTable)guidanceModel.getTable().getTables().get(0);

  	    // fake the evolution operators
  	    fakeModel(table);
  	    
    	List<EvoAnomaly> anomalies = solver.solve(guidanceModel.getTable().getTables().get(0));
    	for(EvoAnomaly anomaly : anomalies){
			for(EvoGuidanceElement guidance : anomaly.getGuidance()){
				if(guidance.getAction() != null){
					if(showRepairSuggestions()){
						EvoGuidanceActionOperator operator = new EvoGuidanceActionOperator(configurationModelResource);
						operator.perform(configurationModel, guidance.getAction().getTerm());
					}
				}
			}
    	}
        
        return null;
    }
    
    private boolean showRepairSuggestions(){
    	MessageDialog dialog = new MessageDialog(getActiveEditor().getEditorSite().getShell(), "Anomaly Detected: Please Choose An Action", null,
    		    "The SPL contains an anomaly and is possibly defect. "
    		    + "There is at least one suggestion to resolve the anomaly automatically. "
    		    + "You can continue (ignoring the anomaly) or show it (and fix it automatically), "
    		    + "what do you want to do?", MessageDialog.WARNING, new String[] { "Show Repair Suggestion(s)",
    		    "Ignore Anomaly", }, 0);
    		int result = dialog.open();

    		return result == 0;
    }
    
    @Override
    public boolean isEnabled() {
    	return true;
    }

    
}
