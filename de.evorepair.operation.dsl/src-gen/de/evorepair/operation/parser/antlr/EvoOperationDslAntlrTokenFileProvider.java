/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.operation.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EvoOperationDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/evorepair/operation/parser/antlr/internal/InternalEvoOperationDsl.tokens");
	}
}