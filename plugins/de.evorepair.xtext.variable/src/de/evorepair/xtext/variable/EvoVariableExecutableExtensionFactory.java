package de.evorepair.xtext.variable;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class EvoVariableExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
 
    @Override
    protected Bundle getBundle() {
        return Activator.getDefault().getBundle();
    }
 
    @Override
    protected Injector getInjector() {
        return Activator.getDefault().getVariableInjector();
    }
 
}