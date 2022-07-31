package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthenticationPage extends BasePage {
	
	private ConfigFileReader configFileReader;

	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement btnLogin;
	
	@FindBy(how = How.ID, using = "welcome")
	public static WebElement homePage;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
	public static WebElement btnLogout;
	
	public AuthenticationPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create methods */
	public void fillUsername(String txt_username) {
		username.sendKeys(txt_username);
		log.info("Send text username to the field username");
	}

	public void fillPassword(String txt_password) {
		password.sendKeys(txt_password);
	}

	public void clickOnbtnLogin() {
		btnLogin.click();
	}
	
	public void goToURL() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
		log.info("open browser application");
	}
	
	public void clickOniconLogout() {
		homePage.click();
	}
	
	public void clickOnbtnLogout() {
		btnLogout.click();
	}

}
