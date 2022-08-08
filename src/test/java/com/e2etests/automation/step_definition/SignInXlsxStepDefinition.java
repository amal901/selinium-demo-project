package com.e2etests.automation.step_definition;

import com.e2etests.automation.page_object.SignInXlsxPage;
import com.e2etests.automation.utils.Constant;
import com.e2etests.automation.utils.ExcelUtils;

import io.cucumber.java.en.When;

public class SignInXlsxStepDefinition {
	
	private SignInXlsxPage signInXlsxPage;
	public SignInXlsxStepDefinition() throws Exception {
		this.signInXlsxPage = new SignInXlsxPage();
	}

	@When("Je m authentifie avec un fichier excel")
	public void jeMAuthentifieAvecUnFichierExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"sheet1");
		signInXlsxPage.signInXlsxe();
		ExcelUtils.setCellData("pass", 1, 3);	
	   
	}

}
