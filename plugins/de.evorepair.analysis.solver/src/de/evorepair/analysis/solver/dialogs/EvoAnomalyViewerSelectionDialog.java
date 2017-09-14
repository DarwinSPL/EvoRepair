package de.evorepair.analysis.solver.dialogs;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import de.evorepair.analysis.provider.EvoResourceProvider;
import de.evorepair.guidance.evo_guidance_dsl.EvoConfigurationAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly;
import de.evorepair.guidance.evoguidancecatalog.EvoAnomalyType;

public class EvoAnomalyViewerSelectionDialog extends EvoResourceSelectionDialog  {
	
	Map<EObject, List<EvoAnomaly>> anomalies;

	
	public EvoAnomalyViewerSelectionDialog(Shell parentShell, EvoResourceProvider resourceProvider, Map<EObject, List<EvoAnomaly>> anomalies) {
		super(parentShell, resourceProvider);
		
		this.resourceProvider = resourceProvider;
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
	
	protected void createTable() {
		resourceTable.setHeaderVisible(true);
        String[] titles = { "Resource", "Resource Type", "ID", "Type", "Guidance Elements" };
        for (String title : titles) {
            TableColumn column = new TableColumn(resourceTable, SWT.NULL);
            column.setText(title);
          }

        resourceTable.setLayoutData(new GridData(GridData.FILL_BOTH));
        for (Map.Entry<EObject, List<EvoAnomaly>> anomalyResource : anomalies.entrySet()){
        	for(EvoAnomaly anomaly : anomalyResource.getValue()) {
                TableItem item = new TableItem(resourceTable, SWT.NONE);
                item.setText(anomalyResource.getKey().eResource().getURI().lastSegment());
                item.setText(1, anomaly instanceof EvoConfigurationAnomaly ? "Configuration" : "Mapping");
                item.setText(2, anomaly.getId());
              	item.setText(3, anomaly.getType() == EvoAnomalyType.DEFECT ? "Defect" : "Behaviour Change");
              	item.setText(4, String.valueOf(anomaly.getGuidance().size()));
        	}
        	
           // item.setText(0, anomalie.getKey());
        }
        
        for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
        	resourceTable.getColumn(loopIndex).pack();
          }

		resourceTable.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(event.detail == SWT.CHECK) {
					for (Map.Entry<URI, EObject> entry : resourceProvider.getResources().entrySet()){
						if(entry.getKey().trimFileExtension().lastSegment().equals(((TableItem)event.item).getText(0))) {
							selectedModels.add(entry.getValue());
						}
					}
				}else {
					for (Map.Entry<URI, EObject> entry : resourceProvider.getResources().entrySet()){
						if(entry.getKey().trimFileExtension().lastSegment().equals(((TableItem)event.item).getText(0))) {
							selectedModels.remove(entry.getValue());
						}	
					}
				}
			}
		});		
	}	
}
