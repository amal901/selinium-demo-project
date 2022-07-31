package com.e2etests.automation.step_definition;

import org.junit.Assert;

import com.e2etests.automation.page_object.AdminPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {
	
	private AdminPage adminPage;
	public AdminStepDefinition() {
		this.adminPage = new AdminPage();
		
	}
	
	@When("Je clique sur le module admin")
	public void jeCliqueSurLeModuleAdmin() {
		adminPage.clickOnModuleAdmin();
	}
	@When("Je saisis {string} dans le champ Username")
	public void jeSaisisDansLeChampUsername(String name) {
		adminPage.fillUsername(name);
	}
	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		adminPage.clickOnbtnSearsh();
	}

	@Then("Je verifie la presence d un utilisateur dans le tableau {string}")
	public void jeVerifieLaPresenceDUnUtilisateurDansLeTableau(String name) {
		String username = AdminPage.resultTable.getText();
		Assert.assertTrue(username.contains(name));
	}

}
