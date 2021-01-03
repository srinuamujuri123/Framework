package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	// @FindBy(id = "foobar") WebElement foobar;
	// @FindBy(how = How.LINK_TEXT, using = "foobar") WebElement foobar;
	
	@FindBy(id="user_email") WebElement username;
	@FindBy (id="user_password") WebElement password;
	@FindBy(name = "commit")WebElement LoginButton;
	
	public void LoginToCRM(String usernameApplication,String passwordApplication) {
		username.sendKeys(usernameApplication);
		password.sendKeys(passwordApplication);
		LoginButton.click();
	}

}
