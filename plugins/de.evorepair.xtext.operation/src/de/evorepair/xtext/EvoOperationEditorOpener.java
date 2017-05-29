package de.evorepair.xtext;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

import de.evorepair.evolution.evooperation.presentation.EvoOperationEditor;


public class EvoOperationEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	EvoOperationEditor operationEditor = (EvoOperationEditor) openEditor.getAdapter(EvoOperationEditor.class);
        if (operationEditor != null) {
            EObject eObject = operationEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            operationEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}
