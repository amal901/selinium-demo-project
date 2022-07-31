package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AdminPage {
	
	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "menu_admin_viewAdminModule")
	public static WebElement adminModule;
	
	@FindBy(how = How.ID, using = "searchSystemUser_userName")
	public static WebElement username;
	
	@FindBy(how = How.ID, using = "searchBtn")
	public static WebElement searchBtn;
	
	@FindBy(how = How.XPATH, using = "resultTable")
	public static WebElement resultTable;
	
	public AdminPage() {
	PageFactory.initElements(Setup.driver, this);
	}
	
	/* @Create Methods */
	public void clickOnModuleAdmin() {
		adminModule.click();
	}
	
	public void fillUsername(String text_username) {
		username.sendKeys(text_username);
		
	}
	public void clickOnbtnSearsh() {
		searchBtn.click();
	}
}
