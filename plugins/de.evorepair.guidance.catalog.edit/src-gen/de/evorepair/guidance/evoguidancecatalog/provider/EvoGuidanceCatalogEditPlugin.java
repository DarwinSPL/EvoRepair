/**
 */
package de.evorepair.guidance.evoguidancecatalog.provider;

import de.evorepair.evolution.evooperation.provider.EvoOperationEditPlugin;

import de.evorepair.evolution.evovariable.provider.EvoVariableEditPlugin;

import de.evorepair.logic.evologic.provider.EvoLogicEditPlugin;

import eu.hyvar.context.provider.ContextInformationEditPlugin;

import eu.hyvar.dataValues.provider.DataValuesEditPlugin;

import eu.hyvar.evolution.provider.EvolEditPlugin;

import eu.hyvar.feature.configuration.provider.ConfigurationEditPlugin;

import eu.hyvar.feature.expression.provider.ExpressionEditPlugin;

import eu.hyvar.feature.provider.FeatureEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the EvoGuidanceCatalog edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EvoGuidanceCatalogEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EvoGuidanceCatalogEditPlugin INSTANCE = new EvoGuidanceCatalogEditPlugin();

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
	public EvoGuidanceCatalogEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ConfigurationEditPlugin.INSTANCE,
		     ContextInformationEditPlugin.INSTANCE,
		     DataValuesEditPlugin.INSTANCE,
		     EvolEditPlugin.INSTANCE,
		     EvoLogicEditPlugin.INSTANCE,
		     EvoOperationEditPlugin.INSTANCE,
		     EvoVariableEditPlugin.INSTANCE,
		     ExpressionEditPlugin.INSTANCE,
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
	public static class Implementation extends EclipsePlugin {
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
