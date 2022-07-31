package com.e2etests.automation.step_definition;

import com.e2etests.automation.page_object.SignInXlsxPage;

import io.cucumber.java.en.When;

public class SignInStepDefinition {
	
	private SignInXlsxPage signInXlsxPage;
	public SignInStepDefinition() {
		this.signInXlsxPage = new SignInXlsxPage();
	}

	@When("Je m authentifie avec un fichier excel")
	public void jeMAuthentifieAvecUnFichierExcel() {
	   
	}



}
