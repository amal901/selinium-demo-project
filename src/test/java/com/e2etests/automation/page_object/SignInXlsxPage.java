package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2etests.automation.utils.ExcelUtils;

public class SignInXlsxPage {
	
	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement btnLogin;
	
	public void signInXlsxPage() throws Exception {
		
		//This is to get the values from Excel Sheet, passing parameters(Row Num, Col Num) to getCellData
		String sUsername = ExcelUtils.getCellData(1,1);
		String sPassword = ExcelUtils.getCellData(1,2);
		
		username.sendKeys(sUsername);
		password.sendKeys(sPassword);
		
	}

}