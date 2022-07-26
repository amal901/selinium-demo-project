package com.e2etests.automation.step_definition;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_object.AuthenticationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;
	static Logger logger = Logger.getLogger(AuthenticationStepDefinition.class);
	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}
	
	/*Login*/
	@Given("Je me connecte a l application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		PropertyConfigurator.configure("src/main/java/lof4j.properties");
		authenticationPage.goToURL();
		logger.info("Je me connecte a l application OrangeHRM");
	}

	@When("Je saisis le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
		logger.info("Je saisie le username");

	}

	@When("Je saisis le mot le passe {string}")
	public void jeSaisieLeMotLePasse(String password) {
		authenticationPage.fillPassword(password);

	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickOnbtnLogin();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String msg) {
		String message = AuthenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));
	}
	
	/*Logout*/
	@When("Je clique sur l icone logout")
	public void jeCliqueSurLIconeLogout() {
		authenticationPage.clickOniconLogout();
	}
	@When("Je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout() {
		WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(3));
		AuthenticationPage.btnLogout = wait.until(ExpectedConditions.visibilityOf(AuthenticationPage.btnLogout));
		authenticationPage.clickOnbtnLogout();
	}



}
