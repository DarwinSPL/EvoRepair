package de.evorepair.xtext;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The shared instance
	private static Activator plugin;
	
	// The injector to inject an instance of a EvoOperations model
	private Injector injector;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}
	
	public Injector getOperationInjector(){
		return this.injector;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		injector = Guice.createInjector(
				Modules.override(
						Modules.override(new EvoOperationRuntimeModule())
						.with(new EvoOperationUiModule(plugin)))
						.with(new SharedStateModule()));
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
        plugin = null;
        injector = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
