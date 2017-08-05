package de.evorepair.analysis.toolbar;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.darwinspl.feature.graphical.base.editor.DwGraphicalFeatureModelViewer;
import de.evorepair.analysis.operator.EvoGuidanceMappingActionOperator;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.analysis.solver.eclipse.EclipseUtil;
import de.evorepair.analysis.viewer.viewer.EvoRepairSuggestionViewer;
import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evovariable.EvoConfigurationVariable;
import de.evorepair.feature.expression.dsl.ui.internal.DslActivator;
import de.evorepair.feature.expression.evo_expression_dsl.GrammarEntry;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.util.HyConfigurationUtil;
import eu.hyvar.feature.expression.HyAndExpression;
import eu.hyvar.feature.expression.HyExpressionFactory;
import eu.hyvar.feature.expression.HyFeatureReferenceExpression;
import eu.hyvar.feature.expression.HyNestedExpression;
import eu.hyvar.feature.expression.HyOrExpression;

public class EvoToolbarButtonHandler extends AbstractHandler {
	EvoSolver solver = new EvoSolver();
	
    @Inject
    private XtextResourceSet resourceSet;
	
	public EvoToolbarButtonHandler() {
		super();
	}


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
				/*
				
				EvoFeatureVariable featureVariable = (EvoFeatureVariable)operation.getVariables().get(1);
				featureVariable.setFeature(featureModel.getFeatures().get(2));
				
				EvoFeatureVariable parentVariable = (EvoFeatureVariable)operation.getVariables().get(2);
				parentVariable.setFeature(featureModel.getFeatures().get(0));
				*/
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
    	
		Injector injector = DslActivator.getInstance().getInjector(DslActivator.DE_EVOREPAIR_FEATURE_EXPRESSION_EVOEXPRESSIONDSL);
	    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	    
	    URI uri = featureModel.eResource().getURI().trimFileExtension().appendFileExtension("evoexpression");
	    Resource xtextResource = resourceSet.getResource(uri, true);
	    
	    URI uri2 = featureModel.eResource().getURI().trimFileExtension().appendSegment("_Replacement").appendFileExtension("evoexpression");
	    Resource xtextResource2 = resourceSet.getResource(uri2, true);
    	
	    GrammarEntry entry = (GrammarEntry)xtextResource.getContents().get(0);
	    
	    HyAndExpression and1 = HyExpressionFactory.eINSTANCE.createHyAndExpression();
	    HyOrExpression or = HyExpressionFactory.eINSTANCE.createHyOrExpression();
	    HyAndExpression and2 = HyExpressionFactory.eINSTANCE.createHyAndExpression();
	    HyNestedExpression nested = HyExpressionFactory.eINSTANCE.createHyNestedExpression();
	    
	    HyFeatureReferenceExpression f1 = HyExpressionFactory.eINSTANCE.createHyFeatureReferenceExpression();
	    f1.setFeature(featureModel.getFeatures().get(0));
	    
	    HyFeatureReferenceExpression f2 = HyExpressionFactory.eINSTANCE.createHyFeatureReferenceExpression();
	    f2.setFeature(featureModel.getFeatures().get(1));
	    
	    HyFeatureReferenceExpression f3 = HyExpressionFactory.eINSTANCE.createHyFeatureReferenceExpression();
	    f3.setFeature(featureModel.getFeatures().get(2));
	    
	    HyFeatureReferenceExpression f4 = HyExpressionFactory.eINSTANCE.createHyFeatureReferenceExpression();
	    f4.setFeature(featureModel.getFeatures().get(3));
	    
	    //and1.setOperand1(f1);
	    //and1.setOperand2(or);
	    
	    //or.setOperand1(f2);
	    //or.setOperand2(nested);
	    
	    //nested.setOperand(and2);
	    and2.setOperand1(f3);
	    and2.setOperand2(f4);
	    
	    //entry.setExpression(and1);
	    
	    EvoGuidanceMappingActionOperator operator = new EvoGuidanceMappingActionOperator();
	    boolean result = operator.perform(entry.getExpression(), ((GrammarEntry)xtextResource2.getContents().get(0)).getExpression());
	    
	    MessageDialog dialog = new MessageDialog(EclipseUtil.getActiveEditor().getEditorSite().getShell(), "Result", null,
    		    result ? ":)" : ":(", MessageDialog.WARNING, new String[] { "Yaaay",
    	    		    "Biiiidu", }, 0);
    	dialog.open();
	    
    	return null;
    	/*
    	
    	
    	// display an error in case that the user calls the solver without an active editor within eclipse
    	if(featureModel == null){
    		MessageDialog.openError(EclipseUtil.getActiveEditor().getSite().getShell(), "No active feature model editor", "You must open an active editor with a feature model in order to call "
    				+ "the solver");
    		return null;
    	}
    	
    	HyMapping mappingModel = EcoreIOUtil.loadAccompanyingModel(featureModel.eResource(), HyMappingModelUtil.getMappingModelFileExtensionForXmi());
    	
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
        				EvoGuidanceConfigurationActionOperator operator = new EvoGuidanceConfigurationActionOperator(configurationModelResource);
        				
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
        		EvoGuidanceConfigurationActionOperator operator = new EvoGuidanceConfigurationActionOperator(configurationModelResource);

				HyConfiguration modifiedConfiguration = operator.perform(configurationModel, anomaly.getGuidance().get(0).getAction().getTerm());
				
				EcoreIOUtil.saveModel(modifiedConfiguration);		
			
        	}
		}
        
        return null;
        */
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
