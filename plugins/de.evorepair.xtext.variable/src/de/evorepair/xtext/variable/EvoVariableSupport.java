package de.evorepair.xtext.variable;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class EvoVariableSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new EvoVariableRuntimeModule();
    }
 
}
