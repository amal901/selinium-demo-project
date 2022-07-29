package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AuthentificationBuzzPage {
	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement btnLogin;
	
	@FindBy(how = How.ID, using = "menu_buzz_viewBuzz")
	public static WebElement btnBuzz;
	
	@FindBy(how = How.ID, using = "createPost_content")
	public static WebElement inYourMind;
	
	@FindBy(how = How.ID, using = "postSubmitBtn")
	public static WebElement btnPost;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
	public static WebElement btnLogout;
	
	
	public AuthentificationBuzzPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	/*Create Method*/
	
	public void goToURL(String url) {
		Setup.driver.get(url);
	}
	
	public void fillUsername(String txt_username) {
	username.sendKeys(txt_username);
	}

	public void fillPassword(String txt_password) {
		password.sendKeys(txt_password);
	}

	public void clickOnbtnLogin() {
		btnLogin.click();
	}
	
	public void clickOnbtnBuzz() {
		btnBuzz.click();
	}
	
	public void fillInYourMind(String txt_mind) {
		inYourMind.sendKeys(txt_mind);
	}
	
	public void clickOnbtnPost() {
		btnPost.click();
	}
	
	public void clickOnbtnLogout() {
		btnLogout.click();
	}


}
