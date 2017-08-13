/*
 * generated by Xtext 2.12.0
 */
package de.evorepair.feature.expression.ui.wizard;

import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import org.eclipse.xtext.ui.wizard.IExtendedProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class EvoExpressionDslNewProjectWizard extends XtextNewProjectWizard {

	private EvoExpressionDslWizardNewProjectCreationPage mainPage;

	@Inject
	public EvoExpressionDslNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New EvoExpressionDsl Project");
	}

	protected EvoExpressionDslWizardNewProjectCreationPage getMainPage() {
		return mainPage;
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	@Override
	public void addPages() {
		mainPage = createMainPage("basicNewProjectPage");
		mainPage.setTitle("EvoExpressionDsl Project");
		mainPage.setDescription("Create a new EvoExpressionDsl project.");
		addPage(mainPage);
	}

	protected EvoExpressionDslWizardNewProjectCreationPage createMainPage(String pageName) {
		return new EvoExpressionDslWizardNewProjectCreationPage(pageName);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IExtendedProjectInfo getProjectInfo() {
		EvoExpressionDslProjectInfo projectInfo = new EvoExpressionDslProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		if (!mainPage.useDefaults()) {
			projectInfo.setLocationPath(mainPage.getLocationPath());
		}
		return projectInfo;
	}

}
