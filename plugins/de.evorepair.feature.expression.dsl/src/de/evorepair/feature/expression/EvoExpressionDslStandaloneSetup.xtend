/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EvoExpressionDslStandaloneSetup extends EvoExpressionDslStandaloneSetupGenerated {

	def static void doSetup() {
		new EvoExpressionDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
