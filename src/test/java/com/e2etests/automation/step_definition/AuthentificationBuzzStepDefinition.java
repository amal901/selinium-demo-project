package com.e2etests.automation.step_definition;

import com.e2etests.automation.page_object.AuthentificationBuzzPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationBuzzStepDefinition {
	
	private AuthentificationBuzzPage authentificationBuzzPage;
	public AuthentificationBuzzStepDefinition() {
	this.authentificationBuzzPage = new AuthentificationBuzzPage();
			
	}

	@Given("Je me connecte a l application OrangeHRM {string}")
	public void jeMeConnecteALApplicationOrangeHRM(String url) {
		authentificationBuzzPage.goToURL(url);

	}
	@When("Je clique sur le module Buzz")
	public void jeCliqueSurLeModuleBuzz() {
		authentificationBuzzPage.clickOnbtnBuzz();

	}
	@When("Je saisis un message dans le champ mind {string}")
	public void jeSaisisUnMessageDansLeChampMind(String inYourMind) {
		authentificationBuzzPage.fillInYourMind(inYourMind);

	}
	@When("Je clique sur le bouton post")
	public void jeCliqueSurLeBoutonPost() {
		authentificationBuzzPage.clickOnbtnPost();
		
	}
	@Then("Le nouveau message s affiche")
	public void leNouveauMessageSAffiche() {

	}




}
