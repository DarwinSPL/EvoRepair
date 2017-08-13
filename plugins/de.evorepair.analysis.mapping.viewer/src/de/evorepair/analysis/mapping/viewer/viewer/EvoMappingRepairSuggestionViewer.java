package de.evorepair.analysis.mapping.viewer.viewer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Injector;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.evorepair.analysis.viewer.viewer.EvoRepairSuggestionViewer;
import de.evorepair.feature.mapping.dsl.ui.internal.DslActivator;
import eu.hyvar.feature.mapping.HyMappingModel;

@SuppressWarnings("restriction")
public class EvoMappingRepairSuggestionViewer extends EditorPart{
	/**
	 * Instance of the actual resource that will be overriden
	 */
	private HyMappingModel mappingModel;
	
	protected HyMappingModel selectedMappingModel;

	XtextResource mappingResource;

	IFile mappingFile;

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
	
	EmbeddedEditorModelAccess model2;
	
	EmbeddedEditor editor2;

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	private String getFileContent(IFile file) {
		String text = "";
		try {
			FileInputStream stream = (FileInputStream)file.getContents();
			
			BufferedReader br = new BufferedReader( new InputStreamReader(stream));

			{
				StringBuilder sb = new StringBuilder();
				String line;
				while(( line = br.readLine()) != null ) {
					sb.append( line );
				}
				return sb.toString();
			}
		} catch (IOException | CoreException e) {
			e.printStackTrace();
		}
		
		return text;
	}
	
	private void writeContentToFile(String content, IFile file) {
		
		InputStream input = new StringInputStream(content);
		try {
			file.setContents(input, IResource.FORCE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@SuppressWarnings("restriction")
	@Override
	public void createPartControl(Composite parent) {

		FillLayout fillLayout = new FillLayout();
		fillLayout.marginHeight= 5;
		fillLayout.marginWidth = 5;
		parent.setLayout(fillLayout);

		SashForm containerSashForm = new SashForm(parent, SWT.HORIZONTAL);   	        


		Composite splitComposite = new Composite(containerSashForm, SWT.NONE);
		splitComposite.setLayout(fillLayout); 

		createMappingPanel(containerSashForm);

		SashForm splitEditorComposite = new SashForm(splitComposite, SWT.VERTICAL);


		containerSashForm.setWeights(new int[] { 3, 1});
		containerSashForm.setSashWidth(4);



		Composite firstEditorComposite = new Composite(splitEditorComposite, SWT.NONE);
		firstEditorComposite.setLayout(fillLayout);

		Composite secondEditorComposite = new Composite(splitEditorComposite, SWT.NONE);
		secondEditorComposite.setLayout(fillLayout);

		splitEditorComposite.setWeights(new int[] { 2, 2});

		splitEditorComposite.setSashWidth(4);


		DslActivator activator = DslActivator.getInstance();
		Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_FEATURE_MAPPING_DWMAPPINGDSL);

		EvoMappingResourceProvider provider = injector.getInstance(EvoMappingResourceProvider.class);
		provider.setRealResource(mappingResource);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);

		EmbeddedEditor editor = factory.newEditor(provider).readOnly().withParent(firstEditorComposite);

		


		
		EmbeddedEditorModelAccess model = editor.createPartialEditor("", getFileContent(mappingFile), "", false);

		editor2 = factory.newEditor(provider).readOnly().withParent(secondEditorComposite);	
		model2 = editor2.createPartialEditor("", "", "", false);
		
		registerControlListeners();
	}	


	private Composite createMappingPanel(Composite parent) {
		Composite configurationPanel = new Composite(parent, SWT.NONE);
		configurationPanel.setLayout(new GridLayout(1, false));

		suggestionList = new List(configurationPanel, SWT.BORDER | SWT.V_SCROLL);
		suggestionList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		
		int index = 0;
		for(HyMappingModel mapping : suggestions) {
			suggestionList.add("Repair Suggestion "+index);

			if(mapping.getMappings().equals(selectedMappingModel.getMappings()))
				suggestionList.select(index);

			index++;
		}

		applyButton = new Button(configurationPanel, SWT.PUSH);
		applyButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		applyButton.setText("Apply Suggestion");

		return configurationPanel;
	}


	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Register different listeners to react on user input
	 */
	public void registerControlListeners() {

		suggestionList.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				int[] selections = suggestionList.getSelectionIndices();

				selectedMappingModel = suggestions.get(selections[0]);
				
				DslActivator activator = DslActivator.getInstance();
				Injector injector = activator.getInjector(DslActivator.DE_EVOREPAIR_FEATURE_MAPPING_DWMAPPINGDSL);
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				XtextResource resource = (XtextResource)resourceSet.getResource(selectedMappingModel.eResource().getURI(),  true);
				
				editor2.getDocument().setInput(resource);
				
				model2.updateModel("", getFileContent(EcoreIOUtil.getFile(resource)), "");
				
				
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


	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);

		IResource resource = ((IFileEditorInput)input).getFile();

		mappingFile = (IFile)resource;
		
		selectedMappingModel = EcoreIOUtil.loadModel(((IFileEditorInput)input).getFile());
		mappingModel = selectedMappingModel;
		mappingResource = (XtextResource)selectedMappingModel.eResource();

		


		IFolder folder = resource.getProject().getFolder(EvoRepairSuggestionViewer.SUGGESTIONS_FOLDER);
		IResource[] files;
		try {
			files = folder.members();

			for(int i=0; i<files.length; i++) {
				if(files[i] instanceof IFile) {
					HyMappingModel suggestion = EcoreIOUtil.loadModel((IFile)files[i]);
					suggestions.add(suggestion);
				}
			}		
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * applies a solution and replace the original configuration file
	 * 
	 * @param configuration
	 */
	private void applySuggestion(HyMappingModel mapping) {
		writeContentToFile(model2.getEditablePart(), mappingFile);
	}
}
