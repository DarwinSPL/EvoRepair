package de.evorepair.featuremodel.xtext;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

import eu.hyvar.feature.presentation.HyFeatureEditor;

public class HyFeatureEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	HyFeatureEditor featureEditor = (HyFeatureEditor) openEditor.getAdapter(HyFeatureEditor.class);
        if (featureEditor != null) {
            EObject eObject = featureEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            featureEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
}
