package de.evorepair.featuremodel.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

public class EvoHyFeatureModelQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	 
	protected QualifiedName qualifiedName(Object ele){
		return null;
	}

	protected IQualifiedNameConverter getConverter() {
		return super.getConverter();
	}

}
