/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.guidance


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EvoGuidanceDslStandaloneSetup extends EvoGuidanceDslStandaloneSetupGenerated {

	def static void doSetup() {
		new EvoGuidanceDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
