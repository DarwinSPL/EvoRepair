package de.evorepair.analysis.solver.dialogs;

import java.text.Collator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomalyType;
import de.evorepair.guidance.evoguidancecatalog.EvoConfigurationAnomaly;

public class EvoAnomalyViewerSelectionDialog extends EvoResourceSelectionDialog  {

	Map<EObject, List<EvoAnomaly>> anomalies;


	public EvoAnomalyViewerSelectionDialog(Shell parentShell, Map<EObject, List<EvoAnomaly>> anomalies) {
		super(parentShell);

		this.anomalies = anomalies;		
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Select Defect Resources To Show Repair Suggestions");
		setMessage("For the following resources anomalies where detected. You can specify if you want to view the solutions for all resources or only a part of them.", IMessageProvider.WARNING);
		setHelpAvailable(false);
	}

	
	
	protected void createTableContent(Table table, EvoResourceProvider resourceProvider) {
		table.setHeaderVisible(true);
		String[] titles = { "Resource", "Resource Type", "ID", "Type", "Guidance Elements" };
		
		boolean sort = false;
		for (String title : titles) {
			TableColumn column = new TableColumn(table, SWT.NULL);
			column.setText(title);
		
			if(!sort) {
				table.setSortColumn(column);
				table.setSortDirection(SWT.UP); 
				
			    Listener sortListener = new Listener() {  
			        public void handleEvent(Event e) {  
			            TableItem[] items = table.getItems();  
			            Collator collator = Collator.getInstance(Locale.getDefault());  
			            TableColumn column = (TableColumn)e.widget;  
			           
			            for (int i = 1; i < items.length; i++) {  
			                String value1 = items[i].getText(0);  
			                for (int j = 0; j < i; j++){  
			                    String value2 = items[j].getText(0);  
			                    if (collator.compare(value1, value2) < 0) {  
			                        String[] values = {items[i].getText(0), items[i].getText(1)};  
			                        items[i].dispose();  
			                        TableItem item = new TableItem(table, SWT.NONE, j);  
			                        item.setText(values);  
			                        items = table.getItems();  
			                        break;  
			                    }  
			                }  
			            }  
			            table.setSortColumn(column);  
			        }  
			    };  	
			    
			    column.addListener(SWT.Selection, sortListener); 
			}
		}


		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		for (Map.Entry<EObject, List<EvoAnomaly>> anomalyResource : anomalies.entrySet()){
			for(EvoAnomaly anomaly : anomalyResource.getValue()) {
				TableItem item = new TableItem(table, SWT.NONE);
				item.setText(anomalyResource.getKey().eResource().getURI().trimFileExtension().lastSegment());
				item.setText(0, anomalyResource.getKey().eResource().getURI().trimFileExtension().lastSegment());
				item.setText(1, anomaly instanceof EvoConfigurationAnomaly ? "Configuration" : "Mapping");
				item.setText(2, anomaly.getId());
				item.setText(3, anomaly.getType() == EvoAnomalyType.DEFECT ? "Defect" : "Behaviour Change");
				item.setText(4, String.valueOf(anomaly.getGuidance().size()));
			}
		}
		


		for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
			table.getColumn(loopIndex).pack();
		}
		
	     
	}
}
