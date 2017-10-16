package de.evorepair.xtext.util.dedelta.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

public class DeCoreUiModule extends EmfUiModule {
 
    public DeCoreUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }
 
    @Override
    public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
        binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(DeCoreEditorOpener.class);
    }
}
