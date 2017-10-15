package de.evorepair.analysis.solver.dialogs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import de.evorepair.analysis.provider.EvoResourceFactory;
import de.evorepair.analysis.provider.EvoResourceProvider;

/**
 * Dialog that displays list for different resources.
 * To define a resource that should be added to the dialog add an enumeration to @see de.evorepair.analysis.provider.EvoResourceFactory for more information.
 *  
 * @author Gil Engel
 *
 */
public class EvoResourceDialog extends TitleAreaDialog  {
	
	private EvoResourceProvider resourceProvider;

	protected List<Table> resourceTables = new ArrayList<Table>();

	protected List<EObject> selectedModels = new ArrayList<EObject>();

	public EvoResourceDialog(Shell parentShell) {
		super(parentShell);
	}
	
	/**
	 * Use this to add an additional resource provider to the dialog to filter the displayed resources.
	 * @param parentShell
	 * @param resourceProvider contains all resources that should be displayed. All other resources, that aren't defined within the resource provider, will be avoided.
	 */
	public EvoResourceDialog(Shell parentShell, EvoResourceProvider resourceProvider) {
		super(parentShell);
		
		this.resourceProvider = resourceProvider;
	}
	

	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle(getTitle());
		setMessage(getDescription(), IMessageProvider.INFORMATION);
		setHelpAvailable(false);
	}
	
	/**
	 * Defines the title that will be displayed on the display
	 * @return the title of the dialog
	 */
	protected String getTitle(){
		return "Valid Resources";
	}

	/**
	 * Defines an additional description that will be displayed on top under the title
	 * @return the description for the dialog
	 */
	protected String getDescription() {
		return "In the following resources no anomalies could be found. Congratulations.";
	}
	
	/**
	 * Populates the table created by {@link #createTableWithinTab(TabFolder, EvoResourceFactory, EvoResourceProvider)} with available resources
	 * @param table the table where the elements are added
	 * @param factory resource factory to check if resources fit to the table
	 * @param resourceProvider
	 */
	protected void createTableContent(Table table, EvoResourceFactory factory, EvoResourceProvider resourceProvider) {
		SortedSet<URI> models = new TreeSet<>(new Comparator<URI>() {

	        public int compare(URI o1, URI o2) {
	            return o1.toString().compareTo(o2.toString());
	        }
	    });
		
		models.addAll(resourceProvider.getResources().keySet());
		for (URI uri : models){
			if(this.resourceProvider == null || (this.resourceProvider != null && this.resourceProvider.getResources().containsKey(uri))) {
				TableItem item = new TableItem(table, SWT.NONE);
				item.setText(uri.trimFileExtension().lastSegment());
			}
		}		
	}
	
	/**
	 * Creates a table to display a list of resources within
	 * @param parent the parent tab where the table will be added to
	 * @param factory resource factory to check if resources fit to the table
	 * @param resourceProvider
	 * @return
	 */
	protected Table createTableWithinTab(TabFolder parent, EvoResourceFactory factory, EvoResourceProvider resourceProvider) {
		TabItem tabItem = new TabItem(parent, SWT.NULL);
		tabItem.setText(factory.getLabel());
	
		Composite container = new Composite(parent, SWT.NO_SCROLL);
		GridLayout  gridLayout = new GridLayout (1, false);
		container.setLayout(gridLayout);

		Composite buttonContainer = new Composite(container, SWT.NO_SCROLL);
		buttonContainer.setLayout(new RowLayout());
		
		Table table = new Table(container, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));			

		createTableContent(table, factory, resourceProvider);

		
		tabItem.setControl(container);
		
		return table;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout  gridLayout = new GridLayout (1, false);
		container.setLayout(gridLayout);


		TabFolder tabFolder = new TabFolder(container, SWT.V_SCROLL | SWT.H_SCROLL);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		for(EvoResourceFactory resource : EvoResourceFactory.values()) {
			if(resource.isVisibleWithinDialog()) {
				EvoResourceProvider provider = resource.getInstance(true);
				provider.loadResources();
				
				
				Table table = createTableWithinTab(tabFolder, resource, provider);
				resourceTables.add(table);
				
				registerTableSelectionListener(table, resource.getInstance(false));
	
				tabFolder.setSize(400, 200);
			}
		}

		return container;
	}

	/**
	 * Registers a listener to respond to cell selection of a item
	 * @param table the table where the listener should be added
	 * @param resourceProvider
	 */
	protected void registerTableSelectionListener(Table table, EvoResourceProvider resourceProvider) {
	}

	@Override
	protected Point getInitialSize() {
		return new Point(550, 500);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	/**
	 * Getter to return all models that are selected from the user in the dialog
	 * @return list of selected models
	 */
	public List<EObject> getSelectedModels() {
		return selectedModels;
	}
}
