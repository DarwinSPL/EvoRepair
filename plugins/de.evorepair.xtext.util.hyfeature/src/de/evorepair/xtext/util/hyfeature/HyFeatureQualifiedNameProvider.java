package de.evorepair.xtext.util.hyfeature;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;

import com.google.inject.Inject;

import eu.hyvar.evolution.HyName;
import eu.hyvar.evolution.HyNamedElement;

/**
 * This class is needed to return the name of HyNamedElements rather then the UUID. 
 * 
 * @author Gil Engel
 *
 */
public class HyFeatureQualifiedNameProvider extends  DefaultDeclarativeQualifiedNameProvider {

	@Inject IQualifiedNameConverter converter;
	
	HyName name;
	
	
	
	public HyName getName() {
		return name;
	}


	public void setName(HyName name) {
		this.name = name;
	}


	/**
	 * Returns the first name of a HyNamedElement rather than its UUID
	 */
	@Override
	protected org.eclipse.xtext.naming.QualifiedName qualifiedName(Object ele) {

			if(ele instanceof HyNamedElement) {
				StringBuilder builder = new StringBuilder();
				for(HyName name : ((HyNamedElement)ele).getNames())
				{
					builder.append(name.getName());
					builder.append(".");
				}
				
				HyName featureName = ((HyNamedElement)ele).getNames().get(0);
	
				return converter.toQualifiedName(featureName.getName());
			}
	
		return super.qualifiedName(ele);
	}		
}