package de.evorepair.xtext;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.service.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

public class EvoOperationUiModule extends EmfUiModule {
 
    public EvoOperationUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }
 
    @Override
    public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
        binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(EvoOperationEditorOpener.class);
    }
}