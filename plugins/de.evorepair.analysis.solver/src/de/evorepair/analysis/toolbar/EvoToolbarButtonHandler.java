package de.evorepair.analysis.toolbar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
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
import org.eclipse.emf.common.util.EList;
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
import de.darwinspl.feature.graphical.base.model.DwFeatureModelWrapped;
import de.evorepair.analysis.mapping.viewer.viewer.EvoMappingRepairSuggestionViewer;
import de.evorepair.analysis.operator.EvoGuidanceConfigurationRepairOperator;
import de.evorepair.analysis.operator.EvoGuidanceMappingRepairOperator;
import de.evorepair.analysis.operator.EvoGuidanceRepairOperator;
import de.evorepair.analysis.provider.EvoResourceFactory;
import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.analysis.solver.dialogs.EvoAnomalyViewerSelectionDialog;
import de.evorepair.analysis.solver.dialogs.EvoResourceDialog;
import de.evorepair.analysis.solver.dialogs.EvoResourceSelectionDialog;
import de.evorepair.analysis.viewer.viewer.EvoConfigurationRepairSuggestionViewer;
import de.evorepair.eclipse.util.EvoEclipseUtil;
import de.evorepair.evolution.operation.EvoOperation;
import de.evorepair.evolution.variable.EvoFeatureVariable;
import de.evorepair.evolution.variable.EvoVariable;
import de.evorepair.guidance.dsl.ui.internal.DslActivator;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoConfigurationAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceContainer;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceElement;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceType;
import eu.hyvar.evolution.HyName;
import eu.hyvar.evolution.util.HyEvolutionUtil;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.util.HyConfigurationUtil;
import eu.hyvar.feature.mapping.HyMappingModel;
import eu.hyvar.feature.mapping.util.HyMappingModelUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Handler to cause a review of all resources to check for anomalies.
 * 
 * @author Gil Engel
 *
 */
public class EvoToolbarButtonHandler extends AbstractHandler {
	protected EvoSolver solver;

	public EvoToolbarButtonHandler() {
		super();
	}

	protected DwFeatureModelWrapped getFeatureModelFromActiveEditor(){
		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();

		if(activeEditorPart instanceof DwGraphicalFeatureModelViewer){
			return ((DwGraphicalFeatureModelViewer)activeEditorPart).getModelWrapped();
		}else{
			return null;
		}
	}

	/**
	 * Creates the hidden solution folder where all repair suggestions are saved.
	 * @return the folder where all suggestions are saved within
	 */
	protected IFolder createSolutionsFolder() {
		String path = EvoConfigurationRepairSuggestionViewer.SUGGESTIONS_FOLDER;

		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();

		IEditorInput input = activeEditorPart.getEditorInput();

		IResource resource = ((IFileEditorInput)input).getFile();
		try {
			IFolder folder = resource.getProject().getFolder(path);

			if(!folder.exists()) {
				folder.create(true, true, null);
			}

			return folder;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}		

	/**
	 * Creates a hidden sub folder for a specific anomaly for a model. This is needed in order to prevent overwriting if multiple anomalies occurs.
	 * @param parentFolder the parent folder where the folder should be created within. This is normally the folder created by {@link #createSolutionsFolder()}
	 * @param anomaly the anomaly is needed for its name. the created folder will have its name.
	 * @param resource the resource that contains the model which has the detected anomaly
	 * @return a folder where repair suggestions are about to be saved within
	 */
	protected IFolder createSolutionsFolderForResource(IFolder parentFolder, EvoAnomaly anomaly, Resource resource) {
		IFolder folder = parentFolder.getFolder("."+anomaly.getId());

		try {
			if(!folder.exists()) {				
				folder.create(true, true, null);	
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}

		IFolder folder2 = folder.getFolder("."+resource.getURI().trimFileExtension().lastSegment());
		try {
			if(!folder2.exists()) {				
				folder2.create(true, true, null);	
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}

		return folder2;
	}
	/**
	 * Finds the registered viewer and shows it. The viewer gives the user the ability to select a
	 * suggested solution for a found anomaly
	 * 
	 * @param featureModelFile
	 */
	private void openSolutionViewer(EObject model, IFile featureModelFile) {
		IEditorDescriptor[] descriptors = PlatformUI.getWorkbench().
				getEditorRegistry().getEditors("model."+featureModelFile.getFileExtension());

		for(int i=0; i<descriptors.length; i++) {
			try {
				if(model instanceof HyConfiguration && descriptors[i].getId().equals("de.evorepair.analysis.configuration.viewer.repair.suggestion.viewer")) {
					EvoConfigurationRepairSuggestionViewer viewer = (EvoConfigurationRepairSuggestionViewer)EvoEclipseUtil.getActivePage().openEditor(new FileEditorInput(featureModelFile), descriptors[i].getId());
					viewer.setConfiguration((HyConfiguration)model);
				}else if(model instanceof HyMappingModel && descriptors[i].getId().equals("de.evorepair.analysis.mapping.viewer.repair.suggestion.viewer")) {
					EvoMappingRepairSuggestionViewer viewer = (EvoMappingRepairSuggestionViewer)EvoEclipseUtil.getActivePage().openEditor(new FileEditorInput(featureModelFile), descriptors[i].getId());
					viewer.setMappingModel((HyMappingModel)model);		
				}
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @param concatenates all given informations to get the solution file.
	 * @param index specify which solution file should be returned in case there are multiple ones
	 * @param model the corresponding model {@see eu.hyvar.feature.mapping.HyMapping}, {@see eu.hyvar.feature.configuration.HyConfiguration}
	 * @return the solution file in case that the file exists. Otherwise the function will return null.
	 */
	protected IFile getSolutionFile(IFolder folder, int index, EObject model) {
		StringBuilder builder = new StringBuilder();
		builder.append(model.eResource().getURI().trimFileExtension().lastSegment());
		builder.append("_solution_");
		builder.append(index);

		if(model instanceof HyConfiguration) {
			builder.append('.');
			builder.append(HyConfigurationUtil.getConfigurationModelFileExtensionForXmi());
		}else if(model instanceof HyMappingModel) {
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

	/**
	 * Saves the description for a repair suggestion within the solution folder
	 * @param content to be saved
	 * @param uri the uri of the file that will be used to save the description
	 */
	protected void saveDescriptionFile(String content, URI uri) {
		if(content == null) content = "";

		uri = uri.trimFileExtension().appendFileExtension("description");
		byte[] bytes = content.getBytes();
		InputStream source = new ByteArrayInputStream(bytes);

		try {
			IFile file = EcoreIOUtil.getFile(uri);			
			if(file.exists()) {
				file.setContents(source, IResource.FORCE , null);
			}else
				EcoreIOUtil.getFile(uri).create(source, IResource.FORCE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	protected XtextResourceSet getResourceSet() {
		DslActivator activator = DslActivator.getInstance();
		Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_GUIDANCE_EVOGUIDANCEDSL);
		return injector.getInstance(XtextResourceSet.class);		
	}

	/**
	 * Searches in all guidance tables in the same folder as the feature model for defined anomalies 
	 * and shows suggestions in case multiple solutions for an anomaly are found
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {    	
		DwFeatureModelWrapped featureModelWrapped = getFeatureModelFromActiveEditor();
		HyFeatureModel featureModel = featureModelWrapped.getModel();

		Shell shell = EvoEclipseUtil.getActiveEditor().getSite().getShell();

		XtextResourceSet resourceSet = getResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		EvoResourceSelectionDialog dialog = new EvoResourceSelectionDialog(shell);
		if(dialog.open() == Dialog.CANCEL || dialog.getSelectedModels().isEmpty()) {
			return null;
		}

		Map<URI, EObject> resourcesWithoutAnomalies = new HashMap<>();
		for(Map.Entry<URI, EObject> resource : EvoResourceFactory.GUIDANCE.getInstance(true).getResources().entrySet()) {
			EvoGuidanceContainer guidanceModel =  (EvoGuidanceContainer)resource.getValue();

			// create the instances of the resource provider for mappings and configurations
			EvoResourceProvider configurationProvider = EvoResourceFactory.CONFIGURATION.getInstance(false).clone();
			configurationProvider.loadResources();
			EvoResourceProvider mappingProvider = EvoResourceFactory.MAPPING.getInstance(false).clone();
			mappingProvider.loadResources();

			Map<EObject, List<EvoAnomaly>> anomalies = new HashMap<>();

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
				solver = new EvoSolver(featureModel);

				for(EvoGuidanceTable table : guidanceModel.getTables()) {
					List<EvoAnomaly> foundAnomalies = solver.solve(model, table, featureModelWrapped.getSelectedDate());
					if(!foundAnomalies.isEmpty()) {
						anomalies.put(model, foundAnomalies);
					}else if(foundAnomalies.size() == 0){
						System.out.println(foundAnomalies.size());
						resourcesWithoutAnomalies.put(model.eResource().getURI(), model);
					}
				}
			}



			if(!anomalies.isEmpty()) {
				EvoAnomalyViewerSelectionDialog anomalySelectionDialog = new EvoAnomalyViewerSelectionDialog(shell, anomalies);
				if(anomalySelectionDialog.open() == Dialog.CANCEL || anomalySelectionDialog.getSelectedModels().isEmpty()) {
					return null;
				}else {
					// create a hidden folder to store all the solutions
					IFolder solutionFolder = createSolutionsFolder();					

					// selected models for anomaly view
					for(EObject selectedModel : anomalySelectionDialog.getSelectedModels()) {
						EObject key = null;
						for(EObject modelKey : anomalies.keySet()) {
							if(EcoreUtil.equals(modelKey, selectedModel)) key = modelKey;
						}

						for(EvoAnomaly anomaly : anomalies.get(key)){
							int guidanceCount = anomaly.getGuidance().size();

							EvoGuidanceRepairOperator operator;
							EvoResourceProvider resourceProvider;
							String fileExtension;
							if(anomaly instanceof EvoConfigurationAnomaly) {
								operator = new EvoGuidanceConfigurationRepairOperator();
								fileExtension = HyConfigurationUtil.getConfigurationModelFileExtensionForXmi();
								resourceProvider = configurationProvider;
							}else {
								operator = new EvoGuidanceMappingRepairOperator();
								fileExtension = HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax();
								resourceProvider = mappingProvider;
							}			


							if(anomaly.getGuidance().get(0).getType() == EvoGuidanceType.INTERACTIVE_DEFAULT) {
								createModelAndOpenViewer(anomaly, selectedModel, solutionFolder, operator, resourceProvider, featureModelWrapped.getSelectedDate());
							} else if (guidanceCount == 1 && anomaly.getGuidance().get(0).getType() == EvoGuidanceType.AUTOMATIC_DEFAULT) {
								MessageDialog automaticDialog = new MessageDialog(shell, "Automatic repair for anomaly.", null,
										"There is an anomaly in your resource that can be fixed automatically. What do you want to do?", MessageDialog.INFORMATION, new String[] {
												"Show repair operation", "Apply repair opteration" }, 0);
								
								// user wants to examine the repair suggestion, show it to him/her
								if(automaticDialog.open() == 0) {
									createModelAndOpenViewer(anomaly, selectedModel, solutionFolder, operator, resourceProvider, featureModelWrapped.getSelectedDate());
									
								// perform automatic repair operation
								}else {
									for(IFile file : getAccompanyingFiles(featureModel, fileExtension)) {
										EObject model = EcoreIOUtil.loadModel(file);

										EObject modifiedModel = operator.perform(model, selectedModel, anomaly.getGuidance().get(0).getAction().getTerm(), resourceProvider);
										EcoreIOUtil.saveModel(modifiedModel);	
									}		
								}
							}
						}
					}		
				}
			}

		}
		
		EvoResourceProvider provider = new EvoResourceProvider("");
		provider.setResources(resourcesWithoutAnomalies);
		if(!provider.getResources().isEmpty()) {
			EvoResourceDialog successDialog = new EvoResourceDialog(shell, provider);
			successDialog.open();
		}
		
		return null;
	}
	
	private void createModelAndOpenViewer(EvoAnomaly anomaly, EObject selectedModel, IFolder solutionFolder, EvoGuidanceRepairOperator operator, EvoResourceProvider resourceProvider, Date date) {
		IFolder selectedModelFolder = performRepairAndSaveModel(anomaly, selectedModel, solutionFolder, operator, resourceProvider, date);

		// show the solution viewer. We use the first suggest solution configuration as a dummy									
		openSolutionViewer(selectedModel, getSolutionFile(selectedModelFolder, 0, selectedModel));

		
	}

	/**
	 * Performs a repair operation and saves the file as a repair suggestion in the solution folder.
	 * @param anomaly the detected anomaly.
	 * @param selectedModel model where the anomaly was detected and that should be repaired.
	 * @param solutionFolder the folder where the solution will be saved within
	 * @param operator the operator that will perform the operation
	 * @param resourceProvider gives all necessary resources to perform the action
	 * @param date date when the operation will be performed at
	 * @return the folder where the solution will be saved within
	 */
	protected IFolder performRepairAndSaveModel(EvoAnomaly anomaly, EObject selectedModel, IFolder solutionFolder, EvoGuidanceRepairOperator operator, EvoResourceProvider resourceProvider, Date date) {
		XtextResourceSet resourceSet = getResourceSet();

		if(!solutionFolder.exists()) {
			try {
				solutionFolder.create(true, true, null);
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
		}

		IFolder selectedModelFolder = createSolutionsFolderForResource(solutionFolder, anomaly, selectedModel.eResource());

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


			operator.perform(modelCopy, selectedModel, guidance.getAction().getTerm(), resourceProvider);				

			String description = performTemplateProcessor(guidance.getDescription(), anomaly.getTable().getTriggeringOperations(), date);
			saveDescriptionFile(description, EcoreIOUtil.createURIFromFile(modifiedModelFile));

			try {
				solutionResource.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}

			index++;
		}		

		return selectedModelFolder;
	}

	/**
	 * Converts all variable within a description templates to feature names
	 * @param template the template that should be processed
	 * @param operations the operation to be performed
	 * @param date the date when the operation is performed
	 * @return the processed template with feature names as string. In case an error occured an empty string will be returned.
	 */
	protected String performTemplateProcessor(String template, EList<EvoOperation> operations, Date date) {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
		cfg.setDefaultEncoding("UTF-8");


		try {
			Template t = new Template("description", new StringReader(template), cfg);
			Writer out = new StringWriter();

			Map<String, Object> root = new HashMap<>();

			for(EvoOperation operation : operations) {
				for(EvoVariable variable : operation.getVariables()) {
					if(variable instanceof EvoFeatureVariable) {
						EList<HyName> names = ((EvoFeatureVariable)variable).getFeature().getNames();
						HyName name =  HyEvolutionUtil.getValidTemporalElement(names, date);
						name = (name == null) ? names.get(0) : name;

						root.put(variable.getName(), name.getName());
					}
				}
			}

			t.process(root, out);
			return out.toString();
		} catch (TemplateException | IOException e1) {
			e1.printStackTrace();
		}	

		return "";
	}	

	@Override
	public boolean isEnabled() {
		return (getFeatureModelFromActiveEditor() != null);
	}  
}
