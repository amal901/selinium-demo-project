package com.e2etests.automation.step_definition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.e2etests.automation.page_object.AuthentificationZaraPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentiicationZaraStepDefinition {
	
	private AuthentificationZaraPage authentificationZaraPage;
	
	public AuthentiicationZaraStepDefinition() {
		this.authentificationZaraPage = new AuthentificationZaraPage();
	}

	@Given("Je me connecte sur l application Zara {string}")
	public void jeMeConnecteSurLApplicationZara(String url) {
	authentificationZaraPage.goToURL(url);
	WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(3));
	AuthentificationZaraPage.btnSeConnecter = wait.until(ExpectedConditions.visibilityOf(AuthentificationZaraPage.btnSeConnecter));
	  
	}
	@When("Je clique sur se connecter")
	public void jeCliqueSurSeConnecter() {
		authentificationZaraPage.clickOnbtnSeConnecter();
	   
	}
	@Then("Je me rederige vers la page {string}")
	public void jeMeRedreigeVersLaPageDemarrerLaSession(String text) {
		String titlePage = AuthentificationZaraPage.pageConnexion.getText();
		System.out.println("xxxxxxxxxxx " + titlePage);
		Assert.assertTrue(titlePage.contains(text));
	  
	}
	@When("Je saisis l adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		authentificationZaraPage.fillEmail(email);
	   
	}
	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		authentificationZaraPage.fillPassword(password);
	  
	}

}
