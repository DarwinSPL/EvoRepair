package de.evorepair.analysis.viewer.viewer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.darwinspl.feature.graphical.configurator.editor.DwFeatureModelConfiguratorEditor;

public class EvoRepairSuggestionViewer extends DwFeatureModelConfiguratorEditor{

	@Override
	protected Composite createConfigurationPanel(Composite parent) {
		Composite configurationPanel = new Composite(parent, SWT.NONE);
		configurationPanel.setLayout(new GridLayout(1, false));

		

		return configurationPanel;
	}
	
	@Override
	protected void registerListeners() {
		
	}
}
