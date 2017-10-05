package de.evorepair.analysis.solver.dialogs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import de.evorepair.analysis.provider.EvoResourceFactory;
import de.evorepair.analysis.provider.EvoResourceProvider;

public class EvoResourceSelectionDialog extends TitleAreaDialog  {

	protected List<Table> resourceTables = new ArrayList<Table>();

	protected List<EObject> selectedModels = new ArrayList<EObject>();

	public EvoResourceSelectionDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Select Configurations To Search For Anomalies");
		setMessage("Multiple configurations found. Please specify which of them you want to search for anomalies. If you deselect all, none will be searched for.", IMessageProvider.INFORMATION);
		setHelpAvailable(false);
	}
	
	protected void createTableContent(Table table, EvoResourceProvider resourceProvider) {
		SortedSet<URI> models = new TreeSet<>(new Comparator<URI>() {

	        public int compare(URI o1, URI o2) {
	            return o1.toString().compareTo(o2.toString());
	        }
	    });
		
		models.addAll(resourceProvider.getResources().keySet());
		for (URI uri : models){
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(uri.trimFileExtension().lastSegment());
		}		
	}
	
	protected Table createTableWithinTab(TabFolder parent, String text, EvoResourceProvider resourceProvider) {
		TabItem tabItem = new TabItem(parent, SWT.NULL);
		tabItem.setText(text);
		
		Composite container = new Composite(parent, SWT.NO_SCROLL);
		GridLayout  gridLayout = new GridLayout (1, false);
		container.setLayout(gridLayout);

		Composite buttonContainer = new Composite(container, SWT.NO_SCROLL);
		buttonContainer.setLayout(new RowLayout());
		
		Table table = new Table(container, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));		
	
		Button selectAllButton = new Button(buttonContainer, SWT.PUSH);
		selectAllButton.setText("Select All");
		selectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedModels.clear();
				for (Map.Entry<URI, EObject> entry : resourceProvider.getResources().entrySet()){
					selectedModels.add(entry.getValue());
				}

				for(TableItem item : table.getItems()) {
					item.setChecked(true);
				}
			}
		});

		Button deselectAllButton = new Button(buttonContainer, SWT.PUSH);
		deselectAllButton.setText("Deselect All");
		deselectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedModels.clear();
				for(TableItem item : table.getItems()) {
					item.setChecked(false);
				}
			}
		});		
		

		createTableContent(table, resourceProvider);

		
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
			Table table = createTableWithinTab(tabFolder, resource.getLabel(), resource.getInstance());
			resourceTables.add(table);
			
			registerTableSelectionListener(table, resource.getInstance());

			tabFolder.setSize(400, 200);	
		}

		return container;
	}

	
	protected void registerTableSelectionListener(Table table, EvoResourceProvider resourceProvider) {

		Listener resourceSelectionListener = new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(event.detail == SWT.CHECK) {
					for (Map.Entry<URI, EObject> entry : resourceProvider.getResources().entrySet()){
						if(entry.getKey().trimFileExtension().lastSegment().equals(((TableItem)event.item).getText())) {
							selectedModels.add(entry.getValue());
						}
					}
				}else {
					for (Map.Entry<URI, EObject> entry : resourceProvider.getResources().entrySet()){
						if(entry.getKey().trimFileExtension().lastSegment().equals(((TableItem)event.item).getText())) {
							selectedModels.remove(entry.getValue());
						}	
					}
				}
			}
		};		
		
		table.addListener(SWT.Selection, resourceSelectionListener);
	}

	@Override
	protected Point getInitialSize() {
		return new Point(550, 500);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	public List<EObject> getSelectedModels() {
		return selectedModels;
	}
}
