/**
 * generated by Xtext 2.11.0
 */
package de.evorepair.evolution.variable.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.evorepair.evolution.variable.EvoVariableDslRuntimeModule;
import de.evorepair.evolution.variable.EvoVariableDslStandaloneSetup;
import de.evorepair.evolution.variable.ide.EvoVariableDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EvoVariableDslIdeSetup extends EvoVariableDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    EvoVariableDslRuntimeModule _evoVariableDslRuntimeModule = new EvoVariableDslRuntimeModule();
    EvoVariableDslIdeModule _evoVariableDslIdeModule = new EvoVariableDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_evoVariableDslRuntimeModule, _evoVariableDslIdeModule));
  }
}
