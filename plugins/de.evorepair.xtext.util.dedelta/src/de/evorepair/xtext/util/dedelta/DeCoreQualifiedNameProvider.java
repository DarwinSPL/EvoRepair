package de.evorepair.xtext.util.dedelta;

import org.deltaecore.core.decore.DEDelta;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;

import com.google.inject.Inject;

/**
 * This class is needed to return the name of HyNamedElements rather then the UUID. 
 * 
 * @author Gil Engel
 *
 */
public class DeCoreQualifiedNameProvider extends  DefaultDeclarativeQualifiedNameProvider {

	@Inject IQualifiedNameConverter converter;
	
	/**
	 * Returns the first name of a HyNamedElement rather than its UUID
	 */
	@Override
	protected org.eclipse.xtext.naming.QualifiedName qualifiedName(Object ele) {
		if(ele instanceof DEDelta) {
			DEDelta featureName = ((DEDelta)ele);

			return converter.toQualifiedName(featureName.getName());
		}
	
		return super.qualifiedName(ele);
	}
	
	

}