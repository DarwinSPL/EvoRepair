package de.evorepair.analysis.solver.eclipse;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.evorepair.feature.expression.dsl.ui.internal.DslActivator;
import eu.hyvar.feature.HyFeatureModel;

public class test {

	@Inject
	private XtextResourceSetProvider resourceSetProvider;
	public void foo(HyFeatureModel featureModel) {

		
/*
	    // .ext ist the extension of the model file
	    String inputURI = "file:///C:\\Users\\blast\\Eclipe_Oxygen_Runtime_Workspace2\\other/FeatureModel.evoexpression";
	  //  String outputURI = "file:///" + absuloteTargetFolderPath + "/MyFile.xmi";
	    URI uri = URI.createURI(inputURI);
	    
	    //sourceSet resourceSet = featureModel.eResource().getResourceSet();
	    resourceSet.getResources().add(featureModel.eResource());
	    
	    
	    EcoreUtil.resolveAll(xtextResource);
	    
	    Resource xmiResource = resourceSet.createResource(URI.createURI("test.xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}

}
