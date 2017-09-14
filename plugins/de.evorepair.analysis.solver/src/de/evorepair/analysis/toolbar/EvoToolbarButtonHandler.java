package de.evorepair.analysis.toolbar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
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
import de.evorepair.analysis.mapping.viewer.viewer.EvoMappingRepairSuggestionViewer;
import de.evorepair.analysis.operator.EvoGuidanceConfigurationActionOperator;
import de.evorepair.analysis.operator.EvoGuidanceMappingActionOperator;
import de.evorepair.analysis.operator.EvoGuidanceRepairOperator;
import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.analysis.solver.dialogs.EvoAnomalyViewerSelectionDialog;
import de.evorepair.analysis.solver.dialogs.EvoResourceSelectionDialog;
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
		String path = EvoConfigurationRepairSuggestionViewer.SUGGESTIONS_FOLDER;

		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();

		IEditorInput input = activeEditorPart.getEditorInput();

		IResource resource = ((IFileEditorInput)input).getFile();
		try {
			IFolder folder = resource.getProject().getFolder(path);

			if(!folder.exists()) {
				folder.create(true, false, null);
			}

			StringBuilder builder = new StringBuilder();
			builder.append(path);
			builder.append("/.");
			builder.append(resource.getName().replace('.'+resource.getFileExtension(), ""));
			IFolder specificSolutionFolder = resource.getProject().getFolder(builder.toString());

			if(!specificSolutionFolder.exists()){
				specificSolutionFolder.create(true, false, null);
			}

			return specificSolutionFolder;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}	

	private IFolder createSolutionsFolderForResource(IFolder parentFolder, Resource resource) {
		IFolder folder = parentFolder.getFolder("."+resource.getURI().trimFileExtension().lastSegment());

		try {
			if(!folder.exists()) {				
				folder.create(true, false, null);	
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}

		return folder;
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
					EvoMappingRepairSuggestionViewer viewer = (EvoMappingRepairSuggestionViewer)EvoEclipseUtil.getActivePage().openEditor(new FileEditorInput(featureModelFile), descriptors[i].getId());
					viewer.setMappingModel(mappingModel);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}			 
		}		
	}

	private IFile getSolutionFile(IFolder folder, int index, EObject model) {
		StringBuilder builder = new StringBuilder();
		builder.append("solution_");
		builder.append(index);
		builder.append('_');

		if(model instanceof HyConfiguration) {
			builder.append("configuration");
			builder.append('.');
			builder.append(HyConfigurationUtil.getConfigurationModelFileExtensionForXmi());
		}else if(model instanceof HyMappingModel) {
			builder.append("mapping");
			builder.append('.');
			builder.append(HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax());
		}else {
			System.err.println("Could not create a solution file. Reason is an unsupported model file");
			return null;
		}

		return folder.getFile(builder.toString());
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

		EvoResourceProvider resourceProvider = new EvoResourceProvider();

		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();
		resourceProvider.loadAllResources(((IFileEditorInput)input).getFile().getProject(), fileExtension);	

		return resourceProvider;
	}

	private XtextResourceSet getResourceSet() {
		DslActivator activator = DslActivator.getInstance();
		Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_GUIDANCE_EVOGUIDANCEDSL);
		return injector.getInstance(XtextResourceSet.class);		
	}
	
	private de.evorepair.guidance.evo_guidance_dsl.GrammarEntry loadGuidanceModel(HyFeatureModel featureModel, XtextResourceSet resourceSet){
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(featureModel.eResource().getURI().trimFileExtension().appendFileExtension("evoguidance"), true);
		return (de.evorepair.guidance.evo_guidance_dsl.GrammarEntry) resource.getContents().get(0);
	}
	
	/**
	 * Searches in all guidance tables in the same folder as the feature model for defined anomalies 
	 * and shows suggestions in case multiple solutions for an anomaly are found
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {    	
		HyFeatureModel featureModel = getFeatureModelFromActiveEditor();

		Shell shell = EvoEclipseUtil.getActiveEditor().getSite().getShell();
		// display an error in case that the user calls the solver without an active editor within eclipse
		if(featureModel == null){
			MessageDialog.openError(shell, "No active feature model editor", "You must open an active editor with a feature model in order to call "
					+ "the solver");
			return null;
		}


		XtextResourceSet resourceSet = getResourceSet();
		de.evorepair.guidance.evo_guidance_dsl.GrammarEntry guidanceModel = loadGuidanceModel(featureModel, resourceSet);

		// save reference to the corresponding resource
		featureModelResource = featureModel.eResource();    	 	

		// create the instances of the resource provider for mappings and configurations
		EvoResourceProvider configurationProvider = initializeResourceProvider(HyConfigurationUtil.getConfigurationModelFileExtensionForXmi());
		EvoResourceProvider mappingProvider = initializeResourceProvider(HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax());
		EvoResourceProvider combinedProvider = new EvoResourceProvider();
		
		Map<EObject, List<EvoAnomaly>> anomalies = new HashMap<>();
		if(configurationProvider.getResources().size() > 1) {
			EvoResourceSelectionDialog dialog = new EvoResourceSelectionDialog(shell, configurationProvider, mappingProvider);
			if(dialog.open() == Dialog.CANCEL || dialog.getSelectedModels().isEmpty()) {
				return null;
				
			}else {
				configurationProvider.getResources().clear();
				mappingProvider.getResources().clear();
				Map<URI, EObject> selectedResource = new HashMap<>();
				for(EObject model : dialog.getSelectedModels()) {
					selectedResource.put(model.eResource().getURI(), model);
					
					if(model instanceof HyConfiguration)
						configurationProvider.getResources().put(model.eResource().getURI(), model);
					else
						mappingProvider.getResources().put(model.eResource().getURI(), model);
					// instantiate the solver
					solver = new EvoSolver(featureModel, configurationProvider, mappingProvider);

					for(EvoGuidanceTable table : guidanceModel.getTable().getTables()) {
						anomalies.put(model, solver.solve(model, table));
					}
				}

				combinedProvider.setResources(selectedResource);
			}
		}		


		EvoAnomalyViewerSelectionDialog anomalySelectionDialog = new EvoAnomalyViewerSelectionDialog(shell, configurationProvider, mappingProvider, anomalies);
		if(anomalySelectionDialog.open() == Dialog.CANCEL || anomalySelectionDialog.getSelectedModels().isEmpty()) {
			return null;
		}else {
			// create a hidden folder to store all the solutions
			IFolder solutionFolder = createSolutionsFolder();

			// selected models for anomaly view
			for(EObject selectedModel : anomalySelectionDialog.getSelectedModels()) {
				for(EvoAnomaly anomaly : anomalies.get(selectedModel)){
					int guidanceCount = anomaly.getGuidance().size();

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


					if(guidanceCount > 1 || (guidanceCount == 1 && anomaly.getGuidance().get(0).getType() == EvoGuidanceType.INTERACTIVE_DEFAULT)) {
						IFolder selectedModelFolder = createSolutionsFolderForResource(solutionFolder, selectedModel.eResource());
						
						// needed for the name of the solution configurations
						int index = 0;
						for(EvoGuidanceElement guidance : anomaly.getGuidance()){
							IFile modifiedModelFile = getSolutionFile(selectedModelFolder, index, selectedModel);

							// skip the repair process for this anomaly in case the model was not recognized
							if(modifiedModelFile == null)
								continue;


							EObject modelCopy = EcoreUtil.copy(selectedModel);

							Resource solutionResource = EcoreIOUtil.createResource(modifiedModelFile, resourceSet, true);								
							solutionResource.getContents().add(modelCopy);

							operator.perform(modelCopy, selectedModel, guidance.getAction().getTerm(), combinedProvider);							
							saveDescriptionFile(guidance.getDescription(), EcoreIOUtil.createURIFromFile(modifiedModelFile));

							try {
								solutionResource.save(null);
							} catch (IOException e) {
								e.printStackTrace();
							}

							index++;
						}    


						// show the solution viewer. We use the first suggest solution configuration as a dummy
						if(selectedModel instanceof HyConfiguration)
							openSolutionViewer((HyConfiguration)selectedModel, getSolutionFile(selectedModelFolder, 0, selectedModel));
						else
							openSolutionViewer((HyMappingModel)selectedModel, getSolutionFile(selectedModelFolder, 0, selectedModel));

						//}

						// if an automatic repair operation should be performed, overwrite the original configuration
					} else if (guidanceCount == 1 && anomaly.getGuidance().get(0).getType() == EvoGuidanceType.AUTOMATIC_DEFAULT) {
						for(IFile file : getAccompanyingFiles(featureModel, fileExtension)) {
							EObject model = EcoreIOUtil.loadModel(file);

							EObject modifiedModel = operator.perform(model, selectedModel, anomaly.getGuidance().get(0).getAction().getTerm(), resourceProvider);
							EcoreIOUtil.saveModel(modifiedModel);	
						}						
					}
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
