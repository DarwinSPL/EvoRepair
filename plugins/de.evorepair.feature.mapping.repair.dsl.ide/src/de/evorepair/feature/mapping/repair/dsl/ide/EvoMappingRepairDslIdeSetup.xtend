/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.mapping.repair.dsl.ide

import com.google.inject.Guice
import de.evorepair.feature.mapping.repair.dsl.EvoMappingRepairDslRuntimeModule
import de.evorepair.feature.mapping.repair.dsl.EvoMappingRepairDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EvoMappingRepairDslIdeSetup extends EvoMappingRepairDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EvoMappingRepairDslRuntimeModule, new EvoMappingRepairDslIdeModule))
	}
	
}