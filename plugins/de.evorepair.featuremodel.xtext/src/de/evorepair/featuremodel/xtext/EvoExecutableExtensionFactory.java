package de.evorepair.featuremodel.xtext;


import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;


public class EvoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
 
    @Override
    protected Bundle getBundle() {
        return Activator.getDefault().getBundle();
    }
 
    @Override
    protected Injector getInjector() {
        return Activator.getDefault().getInjector();
    }
}
