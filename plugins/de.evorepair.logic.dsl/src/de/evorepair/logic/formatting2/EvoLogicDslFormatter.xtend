/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.logic.formatting2

import com.google.inject.Inject
import de.evorepair.logic.evoLogicDsl.GrammarEntry
import de.evorepair.logic.evologic.EvoFormula
import de.evorepair.logic.services.EvoLogicDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class EvoLogicDslFormatter extends AbstractFormatter2 {
	
	@Inject extension EvoLogicDslGrammarAccess

	def dispatch void format(GrammarEntry grammarEntry, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		grammarEntry.getFormula.format;
	}

	def dispatch void format(EvoFormula evoFormula, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		evoFormula.getTerm.format;
	}
	
	// TODO: implement for EvoXOr, EvoOr, EvoAnd, EvoEqual, EvoUnequal, EvoImplication, EvoBiconditional, EvoSetInclusion, EvoSetIntersection, EvoSetUnion, EvoSetDifference, EvoSetSymmetricDifference, EvoSetCartesianProduct, EvoSetCardinality, EvoSetElementOf, EvoForAll, EvoExists, EvoNot, EvoSatisfiable, EvoFeatureType, EvoGroupType, EvoSetTerm, EvoParentOf, EvoSiblingsOf, EvoChildrenOf
}
