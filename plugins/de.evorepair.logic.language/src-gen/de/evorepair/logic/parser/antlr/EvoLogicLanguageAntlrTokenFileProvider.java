/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.logic.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EvoLogicLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/evorepair/logic/parser/antlr/internal/InternalEvoLogicLanguage.tokens");
	}
}
