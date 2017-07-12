/*
 * generated by Xtext 2.11.0
 */
package de.evorepair.operation.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import de.evorepair.operation.evoOperationDsl.GrammarEntry

@RunWith(XtextRunner)
@InjectWith(EvoOperationDslInjectorProvider)
class EvoOperationDslParsingTest {
	@Inject
	ParseHelper<GrammarEntry> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
