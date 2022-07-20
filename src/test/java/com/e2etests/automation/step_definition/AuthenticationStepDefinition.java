package com.e2etests.automation.step_definition;

import org.junit.Assert;

import com.e2etests.automation.page_object.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;
	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte a l application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		authenticationPage.goToURL();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);

	}

	@When("Je saisie le mot le passe {string}")
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
		Assert.assertTrue(message.contains("msg"));
	}
	

}
