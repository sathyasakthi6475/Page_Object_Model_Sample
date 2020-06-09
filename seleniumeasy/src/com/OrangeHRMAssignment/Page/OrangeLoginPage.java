package com.OrangeHRMAssignment.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage {
	
	WebDriver driver;

	public OrangeLoginPage(WebDriver ldriver) {

		this.driver = ldriver;

		PageFactory.initElements(ldriver, this);
	}

	@FindBy(id="txtUsername")
	public WebElement Login_username;

	@FindBy(id="txtPassword")
	public WebElement Login_password;

	@FindBy(id="btnLogin")
	public WebElement Login_login;



	public void Login_username(String Username) {
		Login_username.sendKeys(Username);
	}

	public void Login_password(String Password) {
		Login_password.sendKeys(Password);
	}

	public void Login_login() {
		Login_login.click();
	}
}
