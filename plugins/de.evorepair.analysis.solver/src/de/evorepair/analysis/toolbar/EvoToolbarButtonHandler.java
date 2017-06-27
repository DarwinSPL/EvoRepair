package de.evorepair.analysis.toolbar;



import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.evolution.evooperation.EvoOperation;
import de.evorepair.evolution.evooperation.EvoOperationContainer;
import de.evorepair.evolution.evovariable.EvoFeatureRelation;
import de.evorepair.evolution.evovariable.EvoFeatureVariable;
import de.evorepair.evolution.operation.evoOperationDsl.GrammarEntry;
import eu.hyvar.feature.HyFeatureModel;

public class EvoToolbarButtonHandler extends AbstractHandler {
	EvoSolver solver = new EvoSolver();
	
	protected IEditorPart getActiveEditor(){
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	}
	
	private HyFeatureModel fakeModel(){
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource operationsResource = resSet.getResource(URI.createURI("platform:/resource/de.evorepair.test.error.definition/FeatureModel.evooperation"), true);
	    
	    Resource featureModelResource = resSet.getResource(URI.createURI("platform:/resource/de.evorepair.test.error.definition/FeatureModel.hyfeature"), true);
	    try {
	    	operationsResource.load(Collections.EMPTY_MAP);
	    	featureModelResource.load(Collections.EMPTY_MAP);
			GrammarEntry model = (GrammarEntry) operationsResource.getContents().get(0);
			
			HyFeatureModel featureModel = (HyFeatureModel) featureModelResource.getContents().get(0);
			
			EvoOperationContainer container = (EvoOperationContainer)model.getContainer();
			EvoOperation deleteFeatureWithCodeOperation = container.getOperations().get(0);
			
			EvoFeatureVariable featureVariable = (EvoFeatureVariable)deleteFeatureWithCodeOperation.getVariables().get(2);
			featureVariable.setFeature(featureModel.getFeatures().get(2));
			
			EvoFeatureVariable parentVariable = (EvoFeatureVariable)deleteFeatureWithCodeOperation.getVariables().get(3);
			parentVariable.setFeature(featureModel.getFeatures().get(0));
			
			return featureModel;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	private void loadOperationFile(){
		
		IEditorPart part = getActiveEditor();
		
		if(part instanceof XtextEditor){
		
			
			
			/*
			//Injector injector = new EvoOperationDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
			//new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			Injector injector = new EvoOperationDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			Resource resource = resourceSet.getResource(
			    URI.createURI("platform:/resource/de.evorepair.test.error.definition/FeatureModel.evooperation"), true);
			
			GrammarEntry model = (GrammarEntry) resource.getContents().get(0);
			EvoOperationContainer container = (EvoOperationContainer)model.getContainer();
			for(EvoOperation operation : container.getOperations()){
				for(EvoVariable variable : operation.getVariables()){
					if(variable instanceof EvoFeatureVariable){
						setFeatureVariable((EvoFeatureVariable)variable);
					}
				}
			}
			*/
			
		}
		
	
	}
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
       // solver.solve();
    	
    	HyFeatureModel model = fakeModel();
    	ResourceSet resSet = new ResourceSetImpl();
  	    Resource guidanceResource = resSet.getResource(URI.createURI("platform:/resource/de.evorepair.test.error.definition/FeatureModel.evoguidance"), true);
 	   
  	  
  	    de.evorepair.guidance.guidancedsl.GrammarEntry e = (de.evorepair.guidance.guidancedsl.GrammarEntry)guidanceResource.getContents().get(0);
    	solver.solve(e.getTable().getTables().get(0));
        
        return null;
    }
    
    @Override
    public boolean isEnabled() {
    	return true;
    }

    
}
