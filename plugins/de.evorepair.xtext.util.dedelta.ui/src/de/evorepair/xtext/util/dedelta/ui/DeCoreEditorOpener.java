package de.evorepair.xtext.util.dedelta.ui;

import java.util.Collections;

import org.deltaecore.core.decore.presentation.DEcoreEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;


public class DeCoreEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
        DEcoreEditor featureEditor = (DEcoreEditor) openEditor.getAdapter(DEcoreEditor.class);
        if (featureEditor != null) {
            EObject eObject = featureEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            featureEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}