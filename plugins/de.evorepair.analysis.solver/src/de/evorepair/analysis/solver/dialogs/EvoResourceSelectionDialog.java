package de.evorepair.analysis.solver.dialogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

import de.evorepair.analysis.provider.EvoResourceProvider;

public class EvoResourceSelectionDialog extends TitleAreaDialog  {

	protected EvoResourceProvider configurationResourceProvider;
	protected EvoResourceProvider mappingResourceProvider;

	protected Table configurationResourceTable;
	protected Table mappingResourceTable;

	protected List<EObject> selectedModels = new ArrayList<EObject>();

	public EvoResourceSelectionDialog(Shell parentShell, EvoResourceProvider configurationResourceProvider, EvoResourceProvider mappingResourceProvider) {
		super(parentShell);

		this.configurationResourceProvider = configurationResourceProvider;
		this.mappingResourceProvider = mappingResourceProvider;
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
		

		
		for (Map.Entry<URI, EObject> entry : resourceProvider.getResources().entrySet()){
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(entry.getKey().trimFileExtension().lastSegment());
		}
		
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
		String[] labels = {"Configurations", "Mappings"};
		for (int i=0; i<labels.length; i++) {
			if(i==0) {
				configurationResourceTable = createTableWithinTab(tabFolder, labels[i], configurationResourceProvider);
			}else {
				mappingResourceTable = createTableWithinTab(tabFolder, labels[i], mappingResourceProvider);
			}
			
		}
		tabFolder.setSize(400, 200);		


		registerTableSelectionListener(configurationResourceTable, configurationResourceProvider);
		registerTableSelectionListener(mappingResourceTable, mappingResourceProvider);

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
