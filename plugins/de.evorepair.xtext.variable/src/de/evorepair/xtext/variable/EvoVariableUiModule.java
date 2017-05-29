package de.evorepair.xtext.variable;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

public class EvoVariableUiModule extends EmfUiModule {
 
    public EvoVariableUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }
 
    @Override
    public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
        binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(EvoVariableEditorOpener.class);
    }
}