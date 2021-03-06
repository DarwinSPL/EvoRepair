package de.evorepair.analysis.viewer.viewer;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.FileEditorInput;

import de.christophseidl.util.ecore.EcoreIOUtil;
import de.darwinspl.feature.graphical.configurator.viewer.DwFeatureModelConfiguratorViewer;
import de.evorepair.eclipse.util.EvoEclipseUtil;
import eu.hyvar.feature.configuration.HyConfiguration;
import eu.hyvar.feature.configuration.util.HyConfigurationUtil;

/**
 * Viewer to show alternative repair solutions for configurations.
 * @author Gil Engel
 *
 */
public class EvoConfigurationRepairSuggestionViewer extends DwFeatureModelConfiguratorViewer{
	/**
	 * Specifies the solution folder where alternative repair solutions are saved
	 */
	public static final String SUGGESTIONS_FOLDER = ".solutions";

	/**
	 * Instance of the actual resource that will be overriden
	 */
	private HyConfiguration configuration;

	/**
	 * Contains all possible solutions for an anomaly that can be found in the solution folder
	 */
	java.util.List<HyConfiguration> suggestions = new ArrayList<>();

	/**
	 * the widget that shows all possible suggestions
	 */
	List suggestionList;

	Label suggestionDescriptionLabel;

	/**
	 * Button to apply the selected suggestion
	 */
	Button applyButton;

	/**
	 * Returns the original, unmodified configuration
	 */
	public HyConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * Sets the original configuration
	 * @param configuration the configuration to be set
	 */
	public void setConfiguration(HyConfiguration configuration) {
		this.configuration = configuration;
	}

	/**
	 * Creates an editor that displays additional widgets on the right side of the editor
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite sash = new Composite(parent, SWT.NONE);
		sash.setLayout(new FillLayout());
		sash.setLayoutData(new GridData(GridData.FILL_BOTH));
		final SashForm sashForm = new SashForm(sash, SWT.HORIZONTAL);

		// Left sash
		super.createEditor(sashForm);

		// Right sash
		createConfigurationPanel(sashForm);
		sashForm.setWeights(new int[] { 4, 1});

		parent.setLayout(new GridLayout(1, false));
		super.createSliderControl(parent);

		registerControlListeners();
	}	

	/**
	 * Creates the right panel that displays a list with all possible solutions and a button 
	 * to apply a particular suggestion
	 * 
	 * @param parent the composite widget where the panel will be added to
	 * @return the component that contains the suggestion list and additional buttons
	 */
	private Composite createConfigurationPanel(Composite parent) {
		SashForm splitEditorComposite = new SashForm(parent, SWT.VERTICAL);

		suggestionList = new List(splitEditorComposite, SWT.BORDER | SWT.V_SCROLL);
		suggestionList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		int index = 0;
		for(HyConfiguration configuration : suggestions) {
			suggestionList.add("Repair Suggestion "+index);

			if(configuration.getId().equals(selectedConfiguration.getId()))
				suggestionList.select(index);

			index++;
		}
		
		Composite descriptionPanel = new Composite(splitEditorComposite, SWT.NONE);
		descriptionPanel.setLayout(new GridLayout(1, true));

		suggestionDescriptionLabel = new Label(descriptionPanel, SWT.LEFT | SWT.WRAP | SWT.BORDER);
		suggestionDescriptionLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		suggestionDescriptionLabel.setText("Descriptions goes here");		
		
		URI decriptionFileURI = EcoreIOUtil.createURIFromFile(EcoreIOUtil.getFile(selectedConfiguration.eResource()))
				.trimFileExtension().appendFileExtension("description");
		String description = getDescriptionFileContent(EcoreIOUtil.getFile(decriptionFileURI));
		suggestionDescriptionLabel.setText(description);		

		applyButton = new Button(descriptionPanel, SWT.PUSH);
		applyButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		applyButton.setText("Apply Suggestion");

		refreshView();

		return splitEditorComposite;
	}

	/**
	 * Gets a list of all files within the specific solution folder for this anomaly
	 * @return a list of all configurations as alternative repair suggestions
	 */
	private IResource[] getFilesFromSolutionFolder() {
		IFile resource = ((IFileEditorInput)getEditorInput()).getFile();

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


	/**
	 * Sets the input of the editor. Also adds all possible solutions to the suggestions list
	 */
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);

		for(IResource file : getFilesFromSolutionFolder()) {
			if(file instanceof IFile) {
				if(file.getFileExtension().equals(HyConfigurationUtil.getConfigurationModelFileExtensionForXmi())) {
					HyConfiguration suggestion = EcoreIOUtil.loadModel((IFile)file);
					suggestions.add(suggestion);
				}
			}
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
				sb.append((char)character);
			}

			input.close();

			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}	

	/**
	 * Register different listeners to react on user input
	 */
	@Override
	public void registerControlListeners() {
		super.registerControlListeners();

		suggestionList.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int[] selections = suggestionList.getSelectionIndices();
				selectedConfiguration = suggestions.get(selections[0]);

				URI decriptionFileURI = EcoreIOUtil.createURIFromFile(EcoreIOUtil.getFile(selectedConfiguration.eResource()))
						.trimFileExtension().appendFileExtension("description");
				String description = getDescriptionFileContent(EcoreIOUtil.getFile(decriptionFileURI));
				
				System.out.println(decriptionFileURI);
				suggestionDescriptionLabel.setText(description);
				suggestionDescriptionLabel.update();

				
				refreshView();
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

		selectedConfiguration.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
			}
		});

	}




	/**
	 * Sets the editor tab name and prevent overwriting it
	 */
	@Override
	protected void setEditorTabText(String text){
		this.setPartName("Suggestions Viewer");
	}

	/**
	 * applies a solution and replace the original configuration file
	 * 
	 * @param configuration
	 */
	private void applySuggestion(HyConfiguration configuration) {
		this.configuration.getElements().clear();

		this.configuration.getElements().addAll(configuration.getElements());

		EcoreIOUtil.saveModel(this.configuration);
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
