package de.evorepair.feature.mapping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import  org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import eu.hyvar.feature.mapping.HyMapping;

public class DwMappingDslValueConverterService extends DefaultTransientValueService{

	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if(feature.getName().equals("id") && owner instanceof HyMapping) {
			return true;
		}
		
		return false;
	}
}
