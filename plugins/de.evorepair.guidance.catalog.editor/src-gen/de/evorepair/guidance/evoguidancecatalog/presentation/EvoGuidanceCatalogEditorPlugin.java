/**
 */
package de.evorepair.guidance.evoguidancecatalog.presentation;

import de.evorepair.evolution.evooperation.provider.EvoOperationEditPlugin;

import de.evorepair.evolution.evovariable.provider.EvoVariableEditPlugin;

import de.evorepair.logic.evofirstorderlogic.provider.EvoFirstOrderEditPlugin;

import eu.hyvar.dataValues.provider.DataValuesEditPlugin;

import eu.hyvar.evolution.provider.EvolEditPlugin;

import eu.hyvar.feature.provider.FeatureEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

/**
 * This is the central singleton for the EvoGuidanceCatalog editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EvoGuidanceCatalogEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EvoGuidanceCatalogEditorPlugin INSTANCE = new EvoGuidanceCatalogEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvoGuidanceCatalogEditorPlugin() {
		super
			(new ResourceLocator [] {
				DataValuesEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE,
				EvoFirstOrderEditPlugin.INSTANCE,
				EvolEditPlugin.INSTANCE,
				EvoOperationEditPlugin.INSTANCE,
				EvoVariableEditPlugin.INSTANCE,
				FeatureEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
