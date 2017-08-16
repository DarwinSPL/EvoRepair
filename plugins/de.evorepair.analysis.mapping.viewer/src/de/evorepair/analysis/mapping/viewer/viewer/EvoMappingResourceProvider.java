package de.evorepair.analysis.mapping.viewer.viewer;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

@SuppressWarnings("restriction")
public class EvoMappingResourceProvider implements IEditedResourceProvider{
	

	XtextResource realResource;
	
	public XtextResource getRealResource() {
		return realResource;
	}

	public void setRealResource(XtextResource realResource) {
		this.realResource = realResource;
	}

	@Override
	public XtextResource createResource() {
		return realResource;
	}

}
