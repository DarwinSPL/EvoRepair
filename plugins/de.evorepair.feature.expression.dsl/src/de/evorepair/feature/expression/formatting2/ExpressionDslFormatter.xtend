/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression.formatting2

import com.google.inject.Inject
import de.evorepair.feature.expression.services.ExpressionDslGrammarAccess
import eu.hyvar.feature.expression.HyEquivalenceExpression
import eu.hyvar.feature.expression.HyNegationExpression
import org.eclipse.xtext.formatting2.IFormattableDocument
import de.evorepair.logic.formatting2.EvoLogicDslFormatter

class ExpressionDslFormatter extends EvoLogicDslFormatter {
	
	@Inject extension ExpressionDslGrammarAccess

	def dispatch void format(HyEquivalenceExpression hyEquivalenceExpression, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		hyEquivalenceExpression.getOperand1.format;
		hyEquivalenceExpression.getOperand2.format;
	}

	def dispatch void format(HyNegationExpression hyNegationExpression, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		hyNegationExpression.getOperand.format;
	}
	
	// TODO: implement for HyFeatureReferenceExpression, HyConditionalFeatureReferenceExpression, HyValueExpression, HyEnum, HyMinimumExpression, HyMaximumExpression, HyIfPossibleExpression, HyLessExpression, HyLessOrEqualExpression, HyGreaterExpression, HyGreaterOrEqualExpression, HySubtractionExpression, HyAdditionExpression, HyModuloExpression, HyMultiplicationExpression, HyDivisionExpression
}