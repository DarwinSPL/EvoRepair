package de.evorepair.analysis.toolbar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.darwinspl.feature.graphical.base.model.DwFeatureModelWrapped;
import de.evorepair.analysis.operator.EvoGuidanceConfigurationRepairOperator;
import de.evorepair.analysis.operator.EvoGuidanceMappingRepairOperator;
import de.evorepair.analysis.operator.EvoGuidanceRepairOperator;
import de.evorepair.analysis.provider.EvoResourceFactory;
import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.analysis.solver.EvoSolver;
import de.evorepair.analysis.solver.eclipse.EvoEclipseUtil;
import de.evorepair.analysis.viewer.viewer.EvoConfigurationRepairSuggestionViewer;
import de.evorepair.evolution.operation.EvoOperation;
import de.evorepair.evolution.operation.EvoOperationContainer;
import de.evorepair.evolution.variable.EvoFeatureVariable;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceCatalogFactory;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceContainer;
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable;
import eu.hyvar.feature.HyFeature;
import eu.hyvar.feature.HyFeatureModel;
import eu.hyvar.feature.configuration.HyConfiguration;

public class EvoConfiguratuionEvaluationToolbarButtonHandler extends EvoToolbarButtonHandler {

	public EvoConfiguratuionEvaluationToolbarButtonHandler() {
		super();
	}


	protected HyFeature findFeatureWithName(HyFeatureModel model, String name) {
		for(HyFeature f : model.getFeatures()) {
			if(f.getNames().get(0).getName().equals(name)) {
				return f;
			}
		}

		return null;
	}

	protected EvoOperation getOperation(List<EvoOperation> operations, String name) {
		for(EvoOperation o : operations) {
			if(o.getName().equals(name))
				return o;
		}

		return null;

	}

	Map<URI, EObject> operations = new HashMap<>();
	Map<URI, EObject> guidances = new HashMap<>();

	protected void loadAllOperationFiles(IResource[] resources) throws CoreException {
		XtextResourceSet resourceSet = getResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);		

		for(IResource resource : resources) {
			if(resource instanceof IContainer) {
				if(!((IContainer)resource).getName().equals(EvoConfigurationRepairSuggestionViewer.SUGGESTIONS_FOLDER))
					loadAllOperationFiles(((IContainer)resource).members());
			}else if(resource instanceof IFile) {
				IFile file = (IFile)resource;

				if(file.getFileExtension().equals("evooperation")) {
					EObject object = EcoreIOUtil.loadModel(file, resourceSet);

					this.operations.put(object.eResource().getURI(), object);
				}
			}
		}
	}

	protected void loadAllGuidanceFiles(IResource[] resources) throws CoreException {
		XtextResourceSet resourceSet = getResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);		

		for(IResource resource : resources) {
			if(resource instanceof IContainer) {
				if(!((IContainer)resource).getName().equals(EvoConfigurationRepairSuggestionViewer.SUGGESTIONS_FOLDER))
					loadAllGuidanceFiles(((IContainer)resource).members());
			}else if(resource instanceof IFile) {
				IFile file = (IFile)resource;

				if(file.getFileExtension().equals("evoguidance")) {
					EObject object = EcoreIOUtil.loadModel(file, resourceSet);

					this.guidances.put(object.eResource().getURI(), object);
				}
			}
		}
	}	
	
	ArrayList<ArrayList<Integer>>  calculateRandomNumbers(EvoResourceProvider resourceProvider) {
		Random randomGenerator = new Random();
		ArrayList<ArrayList<Integer>> randomNumbers = new ArrayList<ArrayList<Integer>>();
		/*
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(2,1,0,4,3,5)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(3,0,4,5,1,2)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(5,4,1,3,2,0)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(0,2,4,3,1,5)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(0,4,5,1,2,3)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(0,4,2,5,3,1)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(5,1,2,0,4,3)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(5,3,0,2,4,1)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(3,0,2,4,5,1)));
		randomNumbers.add(new ArrayList<Integer>(Arrays.asList(0,3,1,4,5,2)));
*/

		for(int i=0; i<resourceProvider.getResources().size(); i++) {
			ArrayList<Integer> numbers = new ArrayList<>();
			for(int j=0; j<6; j++) {
				numbers.add(j);
			}

			ArrayList<Integer> r = new ArrayList<>();
			while(!numbers.isEmpty())
				r.add(numbers.remove(randomGenerator.nextInt(numbers.size())));

			randomNumbers.add(r);

			//System.out.print(i+" :");
			for(Integer number : r) {
					System.out.print(number+" ");
			}
			System.out.print("\n");
		}	
		
		
		return randomNumbers;
	}
	
	protected EvoResourceProvider getResourceProvider() {
		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();
		IProject project = ((IFileEditorInput)input).getFile().getProject();
		
		EvoResourceProvider resourceProvider = EvoResourceFactory.CONFIGURATION.getInstance();
		resourceProvider.clear();
		resourceProvider.loadAllResources(project.getFolder("converted"));
		
		return resourceProvider;
	}
	
	protected EvoResourceFactory getResourceFactory() {
		return EvoResourceFactory.CONFIGURATION;
	}

	/**
	 * Searches in all guidance tables in the same folder as the feature model for defined anomalies 
	 * and shows suggestions in case multiple solutions for an anomaly are found
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {  
		XtextResourceSet resourceSet = getResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);		

		DwFeatureModelWrapped featureModelWrapped = getFeatureModelFromActiveEditor();
		HyFeatureModel featureModel = featureModelWrapped.getModel();

		List<EvoOperation> loperations = new ArrayList<EvoOperation>();

		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();
		IProject project = ((IFileEditorInput)input).getFile().getProject();

		try {
			loadAllOperationFiles(project.members());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		for(Map.Entry<URI, EObject> resource : operations.entrySet()) {
			EvoOperationContainer operation = (EvoOperationContainer)resource.getValue();

			loperations.add(operation.getOperations().get(0));
		}
		
		


		HyFeature baseblocks = findFeatureWithName(featureModel, "baseblocks");
		HyFeature devider_block = findFeatureWithName(featureModel, "devider block");
		HyFeature divider_block = findFeatureWithName(featureModel, "divider block");
		HyFeature gc_textblock = findFeatureWithName(featureModel, "gc_textblock");
		HyFeature textblock_impl = findFeatureWithName(featureModel, "textblock_impl");
		HyFeature textblock = findFeatureWithName(featureModel, "textblock");
		HyFeature schnustomizer = findFeatureWithName(featureModel, "schnustomizer");
		HyFeature ace = findFeatureWithName(featureModel, "ace");
		HyFeature schnapache = findFeatureWithName(featureModel, "schnapache");
		HyFeature nginx = findFeatureWithName(featureModel, "nginx");


		// load resources
		EvoResourceProvider resourceProvider = getResourceProvider();


		// calculate random numbers
		ArrayList<ArrayList<Integer>> randomNumbers = calculateRandomNumbers(resourceProvider);


		for(int i=0; i<resourceProvider.getResources().values().size(); i++) {
			EvoResourceProvider configurationProvider2 = getResourceFactory().getInstance().clone();


			for(int j=0; j<6; j++) {	
				Map<URI, EObject> resources = new HashMap<URI, EObject>();

				if(j == 0) {								
					URI uri = (URI)resourceProvider.getResources().keySet().toArray()[i];
					resources.put(uri, resourceProvider.getResources().get(uri));
				}else {
					if(project.getFolder(".solutions").getFolder("iteration_"+i+"_"+(j-1)).exists()) {
						configurationProvider2.clear();
						configurationProvider2.loadAllResources(project.getFolder(".solutions").getFolder("iteration_"+i+"_"+(j-1)));	

						resources.clear();
						resources.putAll(configurationProvider2.getResources());
					}else{
						resources.clear();

						URI uri = (URI)resourceProvider.getResources().keySet().toArray()[i];
						resources.put(uri, resourceProvider.getResources().get(uri));					
					}
				}

				int rnumber = randomNumbers.get(i).get(j);
				for(Map.Entry<URI, EObject> resource : resources.entrySet()) {
					EvoOperation operation = null;


					if(rnumber == 0) {
						operation = getOperation(loperations, "DeleteFeature");

						((EvoFeatureVariable)operation.getVariables().get(0)).setFeature(baseblocks);					
					}else if(rnumber == 1) {
						operation = getOperation(loperations, "ReplaceFeatureWithExistingFeature");

						((EvoFeatureVariable)operation.getVariables().get(0)).setFeature(devider_block);	
						((EvoFeatureVariable)operation.getVariables().get(1)).setFeature(divider_block);
					}else if(rnumber == 2) {
						operation = getOperation(loperations, "MergeFeature");

						((EvoFeatureVariable)operation.getVariables().get(0)).setFeature(textblock);	
						((EvoFeatureVariable)operation.getVariables().get(1)).setFeature(gc_textblock);	
					}else if(rnumber == 3) {
						operation = getOperation(loperations, "MergeFeature");

						((EvoFeatureVariable)operation.getVariables().get(0)).setFeature(textblock);	
						((EvoFeatureVariable)operation.getVariables().get(1)).setFeature(textblock_impl);					
					}else if(rnumber == 4) {
						operation = getOperation(loperations, "ExtractFeature");

						((EvoFeatureVariable)operation.getVariables().get(0)).setFeature(schnustomizer);	
						((EvoFeatureVariable)operation.getVariables().get(1)).setFeature(ace);	
					}else if(rnumber == 5) {
						operation = getOperation(loperations, "ReplaceFeatureWithNewFeature");

						((EvoFeatureVariable)operation.getVariables().get(0)).setFeature(schnapache);	
						((EvoFeatureVariable)operation.getVariables().get(1)).setFeature(nginx);						
					}

					long start = System.nanoTime();
					checkForAnomalies(i, j, resource.getValue(), operation);
					System.out.println(System.nanoTime() - start);
				}
			}
		}

		EvoResourceProvider configurationProvider2 = EvoResourceFactory.CONFIGURATION.getInstance().clone();
		configurationProvider2.loadAllResources(project.getFolder(".solutions"));
		
		int index = 0;
		System.out.println("=========================================");
		for(EObject configuration : configurationProvider2.getResources().values()) {


			EvoOperation operation = getOperation(loperations, "Check");

			index += checkForCorrectness((HyConfiguration)configuration, operation);
			//System.out.println(index);
		}	
		System.out.println("==========================================================================================================");
		System.out.println("Count: "+index);

		return null;
	}

	private void checkForAnomalies(int i, int j, EObject model, EvoOperation evolutionOperation) {
		DwFeatureModelWrapped featureModelWrapped = getFeatureModelFromActiveEditor();
		HyFeatureModel featureModel = featureModelWrapped.getModel();

		Shell shell = EvoEclipseUtil.getActiveEditor().getSite().getShell();
		// display an error in case that the user calls the solver without an active editor within eclipse
		if(featureModel == null){
			MessageDialog.openError(shell, "No active feature model editor", "You must open an active editor with a feature model in order to call "
					+ "the solver");
			return;
		}

		IEditorPart activeEditorPart = EvoEclipseUtil.getActiveEditor();
		IEditorInput input = activeEditorPart.getEditorInput();	

		IProject project = ((IFileEditorInput)input).getFile().getProject();
		try {
			loadAllGuidanceFiles(project.members());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		for(Map.Entry<URI, EObject> resource : guidances.entrySet()) {
			EvoGuidanceContainer guidanceModel =  (EvoGuidanceContainer)resource.getValue();

 	 	



			solver = new EvoSolver(featureModel);

			for(EvoGuidanceTable table : guidanceModel.getTables()) {
				for(EvoOperation operation : table.getTriggeringOperations()) {
					if(evolutionOperation.getName().equals("Check"))
						return;

					if(operation.getName().equals(evolutionOperation.getName())) {
						for(int k=0; k<operation.getVariables().size(); k++) {								
							if(operation.getVariables().get(k) instanceof EvoFeatureVariable && 
									evolutionOperation.getVariables().get(k) instanceof EvoFeatureVariable){
								HyFeature f = ((EvoFeatureVariable)evolutionOperation.getVariables().get(k)).getFeature();
								((EvoFeatureVariable)operation.getVariables().get(k)).setFeature(f);											   
							}
						}

						List<EvoAnomaly> anomalies = solver.solve(model, table, featureModelWrapped.getSelectedDate());

						operation.setDate(evolutionOperation.getDate());


						// create a hidden folder to store all the solutions
						IFolder solutionFolder = createSolutionsFolder();

						if(anomalies.isEmpty()){
							EvoAnomaly anomaly = EvoGuidanceCatalogFactory.eINSTANCE.createEvoAnomaly();
							anomaly.setId("NoAnomaly");
							copy(i, j, anomaly, model, solutionFolder, featureModelWrapped.getSelectedDate());
						}else {
							for(EvoAnomaly anomaly : anomalies) {
								EvoGuidanceRepairOperator operator = null;
								
								if(model instanceof HyConfiguration) {
									operator = new EvoGuidanceConfigurationRepairOperator();
								}else {
									operator = new EvoGuidanceMappingRepairOperator();
								}
								
								performRepairAndSaveModel(anomaly, model, solutionFolder.getFolder("iteration_"+i+"_"+j), operator, null, featureModelWrapped.getSelectedDate());
							}
						}						
					}
				}
			}							
		}		
	}


	private int checkForCorrectness(HyConfiguration model, EvoOperation evolutionOperation) {
		DwFeatureModelWrapped featureModelWrapped = getFeatureModelFromActiveEditor();
		HyFeatureModel featureModel = featureModelWrapped.getModel();

		int index = 0;
		for(Map.Entry<URI, EObject> resource : guidances.entrySet()) {
			EvoGuidanceContainer guidanceModel =  (EvoGuidanceContainer)resource.getValue();


			solver = new EvoSolver(featureModel);

			for(EvoGuidanceTable table : guidanceModel.getTables()) {
				if(table.getTriggeringOperations().get(0).getName().equals("Check")) {
					if(solver.solve(model, table, featureModelWrapped.getSelectedDate()).isEmpty()) {
					}else {
						boolean exist = false;
						for(int i=0; i<52; i++) {
							if(model.eResource().getURI().toString().contains("iteration_"+i+"_5")) {
								exist = true;
							}
						}
						
						if(exist) {
							index++;
						}
					}
				}
			}
		}
		
		return index;
	}


	private void copy(int i, int j, EvoAnomaly anomaly, EObject selectedModel, IFolder solutionFolder, Date date) {
		XtextResourceSet resourceSet = getResourceSet();

		solutionFolder = solutionFolder.getFolder("iteration_"+i+"_"+j);
		if(!solutionFolder.exists()) {
			try {
				solutionFolder.create(true, true, null);
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
		}

		IFolder selectedModelFolder = createSolutionsFolderForResource(solutionFolder, anomaly, selectedModel.eResource());

		int index = 0;
		IFile modifiedModelFile = getSolutionFile(selectedModelFolder, index, selectedModel);


		EObject modelCopy = EcoreUtil.copy(selectedModel);

		Resource solutionResource = EcoreIOUtil.createResource(modifiedModelFile, resourceSet, true);								
		solutionResource.getContents().add(modelCopy);

		try {
			solutionResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		index++;
	}
}
