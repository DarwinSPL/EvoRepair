package de.evorepair.xtext.util.hyfeature;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class HyFeatureSupport extends AbstractGenericResourceSupport{
 
    @Override
    protected Module createGuiceModule() {
        return new HyFeatureRuntimeModule();
    }
}
