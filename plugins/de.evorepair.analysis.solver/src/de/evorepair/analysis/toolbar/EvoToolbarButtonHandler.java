package de.evorepair.analysis.toolbar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.darwinspl.feature.graphical.base.editor.DwGraphicalFeatureModelViewer;
import de.evorepair.analysis.operator.EvoGuidanceConfigurationActionOperator;
import de.evorepair.analysis.operator.EvoGuidanceMappingActionOperator;
import de.evorepair.analysis.operator.EvoGuidanceRepairOperator;
import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.analysis.solver.eclipse.EvoEclipseUtil;
import de.evorepair.analysis.viewer.viewer.EvoConfigurationRepairSuggestionViewer;
import de.evorepair.guidance.dsl.ui.internal.DslActivator;
import de.evorepair.guidance.evo_guidance_dsl.EvoConfigurationAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceElement;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceType;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.util.HyConfigurationUtil;
import eu.hyvar.feature.mapping.HyMappingModel;
import eu.hyvar.feature.mapping.util.HyMappingModelUtil;

public class EvoToolbarButtonHandler extends AbstractHandler {
	EvoSolver solver;

	public EvoToolbarButtonHandler() {
		super();
	}


	protected HyFeatureModel getFeatureModelFromActiveEditor(){
		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();

		if(activeEditorPart instanceof DwGraphicalFeatureModelViewer){
			return ((DwGraphicalFeatureModelViewer)activeEditorPart).getInternalFeatureModel();
		}else{
			return null;
		}
	}

	Resource featureModelResource;
	Resource configurationModelResource;
	Resource mappingModelResource;

	/**
	 * 
	 * @return
	 */
	private IFolder createSolutionsFolder() {
		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();

		IEditorInput input = activeEditorPart.getEditorInput();

		IResource resource = ((IFileEditorInput)input).getFile();
		try {
			IFolder folder = resource.getProject().getFolder(EvoConfigurationRepairSuggestionViewer.SUGGESTIONS_FOLDER);

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
			if(descriptors[i].getId().equals("de.evorepair.analysis.configuration.viewer.repair.suggestion.viewer")) {
				try {
					EvoConfigurationRepairSuggestionViewer viewer = (EvoConfigurationRepairSuggestionViewer)EvoEclipseUtil.getActivePage().openEditor(new FileEditorInput(featureModelFile), descriptors[i].getId());
					viewer.setConfiguration(configuration);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		}	
	}

	private void openSolutionViewer(HyMappingModel mappingModel, IFile featureModelFile) {
		IEditorDescriptor[] descriptors = PlatformUI.getWorkbench().
				getEditorRegistry().getEditors("model."+featureModelFile.getFileExtension());

		for(int i=0; i<descriptors.length; i++) {			
			if(descriptors[i].getId().equals("de.evorepair.analysis.mapping.viewer.repair.suggestion.viewer")) {
				try {
					EvoEclipseUtil.getActivePage().openEditor(new FileEditorInput(featureModelFile), descriptors[i].getId());
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}			 
		}		
	}

	private IFile getSolutionFile(IFolder folder, int index, EObject model) {
		return folder.getFile("solution"+index+"."+((model instanceof HyConfiguration) ? HyConfigurationUtil.getConfigurationModelFileExtensionForXmi() :
			HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax()));
	}

	private List<IFile> getAccompanyingFiles(HyFeatureModel featureModel, String extension){
		try {
			IFile file = WorkspaceSynchronizer.getFile(featureModel.eResource());

			IContainer parent = file.getParent();		
			IResource[] children = parent.members();

			List<IFile> result = new ArrayList<>();
			for(int i=0; i<children.length; i++) {
				if(children[i] instanceof IFile) {
					IFile ifile = (IFile)children[i];
					if(ifile.getFileExtension().equals(extension)) {
						result.add(ifile);
					}
				}
			}	

			return result;
		}catch(Exception e) {
			return new ArrayList<>();
		}
	}


	private void saveDescriptionFile(String content, URI uri) {
		if(content == null) content = "";

		uri = uri.trimFileExtension().appendFileExtension("description");
		byte[] bytes = content.getBytes();
		InputStream source = new ByteArrayInputStream(bytes);

		try {
			IFile file = EcoreIOUtil.getFile(uri);
			if(file.exists()) {
				file.delete(true, new IProgressMonitor() {
					
					@Override
					public void worked(int work) {
					}
					
					@Override
					public void subTask(String name) {
					}
					
					@Override
					public void setTaskName(String name) {
					}
					
					@Override
					public void setCanceled(boolean value) {
					}
					
					@Override
					public boolean isCanceled() {
						return false;
					}
					
					@Override
					public void internalWorked(double work) {
					}
					
					@Override
					public void done() {
						try {
							file.create(source, IResource.FORCE, null);
						} catch (CoreException e) {
							e.printStackTrace();
						}
						
					}
					
					@Override
					public void beginTask(String name, int totalWork) {
						
					}
				});
			}else
				EcoreIOUtil.getFile(uri).create(source, IResource.FORCE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}


	private EvoResourceProvider initializeResourceProvider(String fileExtension) {

		EvoResourceProvider mappingProvider = new EvoResourceProvider();

		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();
		mappingProvider.loadAllResources(((IFileEditorInput)input).getFile().getProject(), fileExtension);	

		return mappingProvider;
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
			MessageDialog.openError(EvoEclipseUtil.getActiveEditor().getSite().getShell(), "No active feature model editor", "You must open an active editor with a feature model in order to call "
					+ "the solver");
			return null;
		}


		DslActivator activator = DslActivator.getInstance();
		Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_GUIDANCE_EVOGUIDANCEDSL);
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(featureModel.eResource().getURI().trimFileExtension().appendFileExtension("evoguidance"), true);
		de.evorepair.guidance.evo_guidance_dsl.GrammarEntry guidanceModel = (de.evorepair.guidance.evo_guidance_dsl.GrammarEntry) resource.getContents().get(0);


		// save references to the corresponding resources
		featureModelResource = featureModel.eResource();    	 	

		// create the instances of the resource provider for mappings and configurations
		EvoResourceProvider configurationProvider = initializeResourceProvider(HyConfigurationUtil.getConfigurationModelFileExtensionForXmi());
		EvoResourceProvider mappingProvider = initializeResourceProvider(HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax());

		// instantiate the solver
		solver = new EvoSolver(featureModel, configurationProvider, mappingProvider);

		for(EvoGuidanceTable table : guidanceModel.getTable().getTables()) {

			// create a hidden folder to store all the solutions
			IFolder solutionFolder = createSolutionsFolder();

			// configuration anomalies
			List<EvoAnomaly> anomalies = solver.solve(table);
			for(EvoAnomaly anomaly : anomalies){

				EvoGuidanceRepairOperator operator;
				EvoResourceProvider resourceProvider;
				String fileExtension;
				if(anomaly instanceof EvoConfigurationAnomaly) {
					operator = new EvoGuidanceConfigurationActionOperator();
					fileExtension = HyConfigurationUtil.getConfigurationModelFileExtensionForXmi();
					resourceProvider = configurationProvider;
				}else {
					operator = new EvoGuidanceMappingActionOperator();
					fileExtension = HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax();
					resourceProvider = mappingProvider;
				}			

				int guidanceCount = anomaly.getGuidance().size();
				if(guidanceCount > 1 || (guidanceCount == 1 && anomaly.getGuidance().get(0).getType() == EvoGuidanceType.INTERACTIVE_DEFAULT)) {
					if(showRepairSuggestions()) {

						for(IFile file : getAccompanyingFiles(featureModel, fileExtension)) {
							EObject model = EcoreIOUtil.loadModel(file);

							
							// needed for the name of the solution configurations
							int index = 0;
							for(EvoGuidanceElement guidance : anomaly.getGuidance()){
								IFile modifiedModelFile = getSolutionFile(solutionFolder, index, model);

								// neue resource, gleiches resourceset, EcoreUtilcopy
								Resource resourceCopy = EcoreIOUtil.createResource(modifiedModelFile, resourceSet, true);
								resourceCopy.getContents().addAll(EcoreUtil.copyAll(model.eContents()));
								
								EObject modifiedModel = (EObject)operator.perform(resourceCopy.getContents().get(0), guidance.getAction().getTerm(), configurationProvider);							

								saveDescriptionFile(guidance.getDescription(), EcoreIOUtil.createURIFromFile(modifiedModelFile));
								try {
									resourceCopy.save(new HashMap<Object, Object>());
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

								index++;
							}    

							// show the solution viewer. We use the first suggest solution configuration as a dummy
							if(model instanceof HyConfiguration)
								openSolutionViewer((HyConfiguration)model, getSolutionFile(solutionFolder, 0, model));
							else
								openSolutionViewer((HyMappingModel)model, file);
						}

						// if an automatic repair operation should be performed, overwrite the original configuration
					} else if (guidanceCount == 1 && anomaly.getGuidance().get(0).getType() == EvoGuidanceType.AUTOMATIC_DEFAULT) {



						for(IFile file : getAccompanyingFiles(featureModel, fileExtension)) {
							EObject model = EcoreIOUtil.loadModel(file);

							EObject modifiedModel = operator.perform(model, anomaly.getGuidance().get(0).getAction().getTerm(), resourceProvider);
							EcoreIOUtil.saveModel(modifiedModel);	
						}
					}
				}
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
		MessageDialog dialog = new MessageDialog(EvoEclipseUtil.getActiveEditor().getEditorSite().getShell(), "Anomaly Detected: Please Choose An Action", null,
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
