/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.guidance.formatting2

import com.google.inject.Inject
import de.evorepair.guidance.evoguidancecatalog.EvoAnomaly
import de.evorepair.guidance.evoguidancecatalog.EvoGuidanceTable
import de.evorepair.guidance.guidancedsl.GrammarEntry
import de.evorepair.guidance.services.GuidanceDslGrammarAccess
import de.evorepair.logic.formatting2.EvoDslFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument

class GuidanceDslFormatter extends EvoDslFormatter {
	
	@Inject extension GuidanceDslGrammarAccess

	def dispatch void format(GrammarEntry grammarEntry, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		grammarEntry.getTable.format;
	}

	def dispatch void format(EvoGuidanceTable evoGuidanceTable, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (EvoAnomaly evoAnomaly : evoGuidanceTable.getAnomalies()) {
			evoAnomaly.format;
		}
	}
	
	// TODO: implement for EvoAnomaly, EvoGuidanceElement
}
