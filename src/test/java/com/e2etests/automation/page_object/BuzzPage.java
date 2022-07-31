package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class BuzzPage {
		
	@FindBy(how = How.ID, using = "menu_buzz_viewBuzz")
	public static WebElement btnBuzz;
	
	@FindBy(how = How.ID, using = "createPost_content")
	public static WebElement champMind;
	
	@FindBy(how = How.ID, using = "postSubmitBtn")
	public static WebElement btnPost;
	
	@FindBy(how = How.ID, using = "postContent_17")
	public static WebElement newMessage;
		
	public BuzzPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	/*Create Method*/
	
	public void goToURL(String url) {
		Setup.driver.get(url);
	}
	
	
	public void clickOnbtnBuzz() {
		btnBuzz.click();
	}
	
	public void fillInYourMind(String txt_mind) {
		champMind.sendKeys(txt_mind);
	}
	
	public void clickOnbtnPost() {
		btnPost.click();
	}


}
