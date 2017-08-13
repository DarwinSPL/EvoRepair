/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.guidance.ui.wizard


import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.resource.FileExtensionProvider

class EvoGuidanceDslNewProjectWizardInitialContents {
	@Inject
	FileExtensionProvider fileExtensionProvider

	def generateInitialContents(IFileSystemAccess2 fsa) {
		fsa.generateFile(
			"src/model/Model." + fileExtensionProvider.primaryFileExtension,
			'''
			/*
			 * This is an example model
			 */
			Hello Xtext!
			'''
			)
	}
}
