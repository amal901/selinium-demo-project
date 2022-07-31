package com.e2etests.automation.step_definition;

import org.junit.Assert;

import com.e2etests.automation.page_object.BuzzPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinition {

	private BuzzPage buzzPage;

	public BuzzStepDefinition() {
		this.buzzPage = new BuzzPage();
	}

	@Given("Je me connecte a l application OrangeHRM {string}")
	public void jeMeConnecteALApplicationOrangeHRM(String url) {
		buzzPage.goToURL(url);
	}

	@When("Je clique sur le module Buzz")
	public void jeCliqueSurLeModuleBuzz() {
		buzzPage.clickOnbtnBuzz();
	}

	@When("Je saisis un message dans le champ mind {string}")
	public void jeSaisisUnMessageDansLeChampMind(String champMind) {
		buzzPage.fillInYourMind(champMind);
	}

	@When("Je clique sur le bouton post")
	public void jeCliqueSurLeBoutonPost() throws InterruptedException {
		Thread.sleep(1000);
		buzzPage.clickOnbtnPost();
	}

	@Then("Le nouveau message s affiche {string}")
	public void leNouveauMessageSAffiche(String postMessage) {
		String postContent = BuzzPage.newMessage.getText();
		Assert.assertTrue(postContent.contains(postMessage));
		System.out.println("The message is displayed");
	}

}
