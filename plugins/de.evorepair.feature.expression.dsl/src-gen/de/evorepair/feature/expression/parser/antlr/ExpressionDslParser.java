/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression.parser.antlr;

import com.google.inject.Inject;
import de.evorepair.feature.expression.parser.antlr.internal.InternalExpressionDslParser;
import de.evorepair.feature.expression.services.ExpressionDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ExpressionDslParser extends AbstractAntlrParser {

	@Inject
	private ExpressionDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalExpressionDslParser createParser(XtextTokenStream stream) {
		return new InternalExpressionDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "GrammarEntry";
	}

	public ExpressionDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExpressionDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
