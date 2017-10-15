package de.evorepair.xtext.util.dedelta;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class DeCoreSupport extends AbstractGenericResourceSupport{
 
    @Override
    protected Module createGuiceModule() {
        return new DeCoreRuntimeModule();
    }
}
