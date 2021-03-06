/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.guidance.scoping

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class EvoGuidanceDslScopeProvider extends AbstractEvoGuidanceDslScopeProvider {
/*
	override getScope(EObject context, EReference reference) {
    if (context instanceof EvoVariableExpression) {
        // Collect a list of candidates by going through the model
        // EcoreUtil2 provides useful functionality to do that
        // For example searching for all elements within the root Object's tree
        var trigger = context as EObject;
        while(!(trigger instanceof EvoGuidanceTable)){
        	trigger = trigger.eContainer;
        }
        
        for(operation : (trigger as EvoGuidanceTable).triggeringOperations){
        	val rootElement = EcoreUtil2.getRootContainer(operation)
        	val candidates = EcoreUtil2.getAllContentsOfType(rootElement, EvoVariableExpression)    

        	val scope = Scopes.scopeFor(operation.variables)
        	return new FilteringScope(scope, [getEObjectOrProxy == context])
        }
      
        


        // Create IEObjectDescriptions and puts them into an IScope instance
        //return Scopes.scopeFor(candidates)
        
    }		
		
		super.getScope(context, reference)
	}
	*/
}
