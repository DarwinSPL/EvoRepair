/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.mapping.repair.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EvoMappingRepairDslStandaloneSetup extends EvoMappingRepairDslStandaloneSetupGenerated {

	def static void doSetup() {
		new EvoMappingRepairDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}