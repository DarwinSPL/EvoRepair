/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EvoExpressionDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/evorepair/feature/expression/parser/antlr/internal/InternalEvoExpressionDsl.tokens");
	}
}