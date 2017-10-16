package de.evorepair.analysis.mapping.viewer.viewer;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Injector;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.evorepair.analysis.viewer.viewer.EvoConfigurationRepairSuggestionViewer;
import de.evorepair.eclipse.util.EvoEclipseUtil;
import de.evorepair.feature.mapping.dsl.ui.internal.DslActivator;
import eu.hyvar.feature.mapping.HyMappingModel;
import eu.hyvar.feature.mapping.util.HyMappingModelUtil;

/**
 * Viewer to show alternative repair solutions for mappings.
 * @author Gil Engel
 *
 */
@SuppressWarnings("restriction")
public class EvoMappingRepairSuggestionViewer extends EditorPart{
	/**
	 * Instance of the actual resource that will be overriden
	 */
	private HyMappingModel mappingModel;

	/**
	 * the currently selected mapping model
	 */
	protected HyMappingModel selectedMappingModel;

	XtextResource mappingResource;

	/**
	 * the widget that shows all possible suggestions
	 */
	List suggestionList;	

	/**
	 * Contains all possible solutions for an anomaly that can be found in the solution folder
	 */
	java.util.List<HyMappingModel> suggestions = new ArrayList<>();

	/**
	 * Button to apply the selected suggestion
	 */
	Button applyButton;

	Label suggestionDescriptionLabel;

	EmbeddedEditorModelAccess suggestionModel;
	EmbeddedEditorModelAccess defectMappingModel;

	EmbeddedEditor suggestionEditor;
	EmbeddedEditor defectMappingEditor;
	
	
	/**
	 * Specify the mapping model that should be displayed in one of the editors.
	 * @param mappingModel the original, unmodified mapping model
	 */
	public void setMappingModel(HyMappingModel mappingModel) {
		this.mappingModel = mappingModel;
		
		DslActivator activator = DslActivator.getInstance();
		Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_FEATURE_MAPPING_DWMAPPINGDSL);
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		XtextResource resource = (XtextResource)resourceSet.getResource(mappingModel.eResource().getURI(),  true);		
		
		defectMappingEditor.getDocument().setInput(resource);

		defectMappingModel.updateModel("", getFileContent(resource), "");
		defectMappingEditor.getViewer().setSelectedRange(0, 0);
	}

	@Override
	public void doSave(IProgressMonitor monitor) {}

	@Override
	public void doSaveAs() {}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/**
	 * Loads and reads a xtext resource and returns its content as string
	 * @param resource the xtext resource
	 * @return the content as string. In case there was an error the message "Error With Mapping File" will be returned.
	 */
	private String getFileContent(XtextResource resource) {
		ByteArrayOutputStream fileContent = new ByteArrayOutputStream();
		try {
			resource.save(fileContent,  new HashMap<Object, Object>());
			return fileContent.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "Error With Mapping File";
		}
	}

	/**
	 * Loads a description file and returns its content
	 * @param file the description file that should be loaded and read
	 * @return the content as string. If the file couldn't be read, it will return an empty string
	 */
	private String getDescriptionFileContent(IFile file) {
		try {

			StringBuilder sb = new StringBuilder();
			FileInputStream input = (FileInputStream)file.getContents();
			int character;
			while((character = input.read())!=-1) {

				// converts integer to character
				sb.append((char)character);
			}
			
			input.close();

			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}


	@Override
	public void createPartControl(Composite parent) {

		FillLayout fillLayout = new FillLayout();
		parent.setLayout(fillLayout);

		SashForm containerSashForm = new SashForm(parent, SWT.HORIZONTAL);   	        


		Composite splitComposite = new Composite(containerSashForm, SWT.NONE);
		splitComposite.setLayout(fillLayout); 

		createMappingPanel(containerSashForm, fillLayout);

		SashForm splitEditorComposite = new SashForm(splitComposite, SWT.VERTICAL);


		containerSashForm.setWeights(new int[] { 3, 1});
		containerSashForm.setSashWidth(4);


		createEditorPanel(splitEditorComposite, fillLayout);

		registerControlListeners();
	}	

	/**
	 * Creates the editor panel that shows the two different editors
	 * @param parent where the editor panel will be added
	 * @param fillLayout the layout that will be used to add the editors
	 */
	private void createEditorPanel(SashForm parent, FillLayout fillLayout) {
		Composite firstEditorComposite = new Composite(parent, SWT.NONE);
		firstEditorComposite.setLayout(fillLayout);

		Composite secondEditorComposite = new Composite(parent, SWT.NONE);
		secondEditorComposite.setLayout(fillLayout);

		parent.setWeights(new int[] { 2, 2});

		parent.setSashWidth(4);

		DslActivator activator = DslActivator.getInstance();
		Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_FEATURE_MAPPING_DWMAPPINGDSL);

		EvoMappingResourceProvider provider = injector.getInstance(EvoMappingResourceProvider.class);
		provider.setRealResource(mappingResource);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);


		// Configuring default font
		Font defaultFont = JFaceResources.getFont(JFaceResources.TEXT_FONT);

		defectMappingEditor = factory.newEditor(provider).readOnly().showLineNumbers().withParent(firstEditorComposite);
		defectMappingEditor.getViewer().getTextWidget().setFont(defaultFont);
		defectMappingModel = defectMappingEditor.createPartialEditor("", getFileContent(mappingResource), "", false);

		suggestionEditor = factory.newEditor(provider).readOnly().showLineNumbers().withParent(secondEditorComposite);	
		suggestionEditor.getViewer().getTextWidget().setFont(defaultFont);
		suggestionModel = suggestionEditor.createPartialEditor("", "", "", false);
		
		URI decriptionFileURI = EcoreIOUtil.createURIFromFile(EcoreIOUtil.getFile(selectedMappingModel.eResource()))
				.trimFileExtension().appendFileExtension("description");
		String description = getDescriptionFileContent(EcoreIOUtil.getFile(decriptionFileURI));
		suggestionDescriptionLabel.setText(description);	

	}

	/**
	 * Creates the right panel that displays a list with all possible solutions and a button 
	 * to apply a particular suggestion
	 * 
	 * @param parent the composite widget where the panel will be added to
	 * @return the component that contains the suggestion list and additional buttons
	 */
	private Composite createMappingPanel(Composite parent, FillLayout fillLayout) {
		SashForm splitEditorComposite = new SashForm(parent, SWT.VERTICAL);
		suggestionList = new List(splitEditorComposite, SWT.BORDER | SWT.V_SCROLL);
		suggestionList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		int index = 0;
		for(HyMappingModel mapping : suggestions) {
			suggestionList.add("Repair Suggestion "+index);

			if(mapping.getMappings().equals(selectedMappingModel.getMappings()))
				suggestionList.select(index);

			index++;
		}		
		
		suggestionList.setSelection(0);

		Composite descriptionPanel = new Composite(splitEditorComposite, SWT.NONE);
		descriptionPanel.setLayout(new GridLayout(1, true));

		suggestionDescriptionLabel = new Label(descriptionPanel, SWT.LEFT | SWT.WRAP | SWT.BORDER);
		suggestionDescriptionLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		suggestionDescriptionLabel.setText("Descriptions goes here");

		applyButton = new Button(descriptionPanel, SWT.PUSH);
		applyButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		applyButton.setText("Apply Suggestion");

		return splitEditorComposite;
	}


	@Override
	public void setFocus() {}

	/**
	 * Register different listeners to react on user input
	 */
	public void registerControlListeners() {

		suggestionList.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				int[] selections = suggestionList.getSelectionIndices();

				selectedMappingModel = suggestions.get(selections[0]);


				URI decriptionFileURI = EcoreIOUtil.createURIFromFile(EcoreIOUtil.getFile(selectedMappingModel.eResource()))
						.trimFileExtension().appendFileExtension("description");
				String description = getDescriptionFileContent(EcoreIOUtil.getFile(decriptionFileURI));
				suggestionDescriptionLabel.setText(description);

				DslActivator activator = DslActivator.getInstance();
				Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_FEATURE_MAPPING_DWMAPPINGDSL);
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				XtextResource resource = (XtextResource)resourceSet.getResource(selectedMappingModel.eResource().getURI(),  true);

				suggestionEditor.getDocument().setInput(resource);

				suggestionModel.updateModel("", getFileContent(resource), "");
				suggestionEditor.getViewer().setSelectedRange(0, 0);

			}

			public void widgetDefaultSelected(SelectionEvent event) {
				int[] selections = suggestionList.getSelectionIndices();

				selectedMappingModel = suggestions.get(selections[0]);
			}
		});

		applyButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				int[] selections = suggestionList.getSelectionIndices();

				applySuggestion(suggestions.get(selections[0]));
			}

			public void widgetDefaultSelected(SelectionEvent event) {
				int[] selections = suggestionList.getSelectionIndices();

				applySuggestion(suggestions.get(selections[0]));
			}
		});

		selectedMappingModel.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
			}
		});
	}

	/**
	 * Gets a list of all files within the specific solution folder for this anomaly
	 * @return a list of all configurations as alternative repair suggestions
	 */	
	private IResource[] getFilesFromSolutionFolder() {
		IFile resource = ((IFileEditorInput)getEditorInput()).getFile();
		StringBuilder builder = new StringBuilder();
		
		
		builder.append(EvoConfigurationRepairSuggestionViewer.SUGGESTIONS_FOLDER);
		builder.append("/.");
		builder.append(resource.getName().replace('.'+resource.getFileExtension(), ""));
		
		IFolder folder = (IFolder)resource.getParent();
		IResource[] files;

		try {
			files = folder.members();
			return files;
		} catch (CoreException e) {
			e.printStackTrace();

			return new IResource[0];
		}
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);

		selectedMappingModel = EcoreIOUtil.loadModel(((IFileEditorInput)input).getFile());
		mappingModel = selectedMappingModel;
		mappingResource = (XtextResource)selectedMappingModel.eResource();

		for(IResource file : getFilesFromSolutionFolder()) {
			if(file instanceof IFile) {
				if(file.getFileExtension().equals(HyMappingModelUtil.getMappingModelFileExtensionForConcreteSyntax())) {
					HyMappingModel suggestion = EcoreIOUtil.loadModel((IFile)file);
					suggestions.add(suggestion);
				}
			}
		}		
	}

	/**
	 * applies a solution and replace the original configuration file
	 * 
	 * @param mappingModel the mapping that will be applied
	 */
	private void applySuggestion(HyMappingModel mappingModel) {
		this.mappingModel.getMappings().clear();
		this.mappingModel.getMappings().addAll(mappingModel.getMappings());
		EcoreIOUtil.saveModel(this.mappingModel);

		IResource[] files = getFilesFromSolutionFolder();

		for(IResource r : files) {
			try {
				
				r.delete(true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}		
	}

	/**
	 * Deletes all alternative repair suggestions after the viewer was closed.
	 * 
	 * @see org.eclipse.ui.IWorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		IFile file = ((FileEditorInput)getEditorInput()).getFile();

		EvoEclipseUtil.removeSolutionFoldersRecursiveFromFile(file);

		super.dispose();
	}	
}
