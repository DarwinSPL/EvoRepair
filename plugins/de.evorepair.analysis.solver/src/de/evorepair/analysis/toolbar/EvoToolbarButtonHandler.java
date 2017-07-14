package de.evorepair.analysis.toolbar;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.darwinspl.feature.graphical.base.editor.DwGraphicalFeatureModelViewer;
import de.evorepair.analysis.operator.EvoGuidanceActionOperator;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.analysis.solver.eclipse.EclipseUtil;
import de.evorepair.analysis.viewer.viewer.EvoRepairSuggestionViewer;
import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceElement;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceType;
import de.evorepair.guidance.guidancedsl.GrammarEntry;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.util.HyConfigurationUtil;

public class EvoToolbarButtonHandler extends AbstractHandler {
	EvoSolver solver = new EvoSolver();
	

	
	protected HyFeatureModel getFeatureModelFromActiveEditor(){
		IEditorPart activeEditorPart = EclipseUtil.getActiveEditor();
		
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


	/**
	 * 
	 * @return
	 */
	private IFolder createSolutionsFolder() {
		IEditorPart activeEditorPart = EclipseUtil.getActiveEditor();

		IEditorInput input = activeEditorPart.getEditorInput();

		IResource resource = ((IFileEditorInput)input).getFile();
		try {
			IFolder folder = resource.getProject().getFolder(EvoRepairSuggestionViewer.SUGGESTIONS_FOLDER);
			
			if(!folder.exists())
				folder.create(true, false, null);
			
			return folder;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}	
	
	/**
	 * Finds the registered viewer and shows it. The viewer gives the user the ability to select a
	 * suggested solution for a found anomaly
	 * 
	 * @param featureModelFile
	 */
	private void openSolutionViewer(HyConfiguration configuration, IFile featureModelFile) {
		IEditorDescriptor[] descriptors = PlatformUI.getWorkbench().
		        getEditorRegistry().getEditors("model."+featureModelFile.getFileExtension());
		
		for(int i=0; i<descriptors.length; i++) {
			if(descriptors[i].getId().equals("de.evorepair.analysis.viewer.repair.suggestion.viewer")) {
				try {
					EvoRepairSuggestionViewer viewer = (EvoRepairSuggestionViewer)EclipseUtil.getActivePage().openEditor(new FileEditorInput(featureModelFile), descriptors[i].getId());
					viewer.setConfiguration(configuration);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		}	
	}
	
	private IFile getSolutionFile(IFolder folder, int index) {
		return folder.getFile("solution"+index+"."+HyConfigurationUtil.getConfigurationModelFileExtensionForXmi());
	}

	/**
	 * Searches in all guidance tables in the same folder as the feature model for defined anomalies 
	 * and shows suggestions in case multiple solutions for an anomaly are found
	 */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

    	HyFeatureModel featureModel = getFeatureModelFromActiveEditor();
    	
    	// display an error in case that the user calls the solver without an active editor within eclipse
    	if(featureModel == null){
    		MessageDialog.openError(EclipseUtil.getActiveEditor().getSite().getShell(), "No active feature model editor", "You must open an active editor with a feature model in order to call "
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
  	    
		IFolder solutionFolder = createSolutionsFolder();
		if(solutionFolder == null) {
			System.err.println("Could not create solution folder :( Abort Mission.");
		}

		List<EvoAnomaly> anomalies = solver.solve(guidanceModel.getTable().getTables().get(0));
		for(EvoAnomaly anomaly : anomalies){
			
        	int guidanceCount = anomaly.getGuidance().size();
        	if(guidanceCount > 1 || (guidanceCount == 1 && anomaly.getGuidance().get(0).getType() == EvoGuidanceType.INTERACTIVE_DEFAULT)) {
        		if(showRepairSuggestions()) {
        			
        			// needed for the name of the solution configurations
        			int index = 0;
            		for(EvoGuidanceElement guidance : anomaly.getGuidance()){
        				EvoGuidanceActionOperator operator = new EvoGuidanceActionOperator(configurationModelResource);
        				
        				HyConfiguration copy = EcoreUtil.copy(configurationModel);
						HyConfiguration modifiedConfiguration = operator.perform(copy, guidance.getAction().getTerm());
						
						IFile modifiedConfigurationFile = getSolutionFile(solutionFolder, index);
						EcoreIOUtil.saveModelAs(modifiedConfiguration, modifiedConfigurationFile);
						index++;
        			}    

            		// show the solution viewer. We use the first suggest solution configuration as a dummy
            		openSolutionViewer(configurationModel, getSolutionFile(solutionFolder, 0));
        		}
        		
        		
        		
        	// if an automatic repair operation should be performed, overwrite the original configuration
        	} else if (guidanceCount == 1 && anomaly.getGuidance().get(0).getType() == EvoGuidanceType.AUTOMATIC_DEFAULT) {
        		EvoGuidanceActionOperator operator = new EvoGuidanceActionOperator(configurationModelResource);

				HyConfiguration modifiedConfiguration = operator.perform(configurationModel, anomaly.getGuidance().get(0).getAction().getTerm());
				
				EcoreIOUtil.saveModel(modifiedConfiguration);		
			
        	}
		}
        
        return null;
    }
    
    /**
     * Displays a message dialog to inform the user that an anomaly was found and gives the possibility to the user
     * to show different solutions to fix the anomaly
     * 
     * @return true if the user wants to see possible solution else otherwise
     */
    private boolean showRepairSuggestions(){
    	MessageDialog dialog = new MessageDialog(EclipseUtil.getActiveEditor().getEditorSite().getShell(), "Anomaly Detected: Please Choose An Action", null,
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
