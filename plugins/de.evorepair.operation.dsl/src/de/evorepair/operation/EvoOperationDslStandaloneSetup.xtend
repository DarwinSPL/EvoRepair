/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.operation


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EvoOperationDslStandaloneSetup extends EvoOperationDslStandaloneSetupGenerated {

	def static void doSetup() {
		new EvoOperationDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}