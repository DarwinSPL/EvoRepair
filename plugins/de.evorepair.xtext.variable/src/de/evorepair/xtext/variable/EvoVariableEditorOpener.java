package de.evorepair.xtext.variable;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

import de.evorepair.evolution.evooperation.presentation.EvoOperationEditor;
import de.evorepair.evolution.evovariable.presentation.EvoVariableEditor;


public class EvoVariableEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	EvoOperationEditor variableEditor = (EvoOperationEditor) openEditor.getAdapter(EvoOperationEditor.class);
        if (variableEditor != null) {
            EObject eObject = variableEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            variableEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}
