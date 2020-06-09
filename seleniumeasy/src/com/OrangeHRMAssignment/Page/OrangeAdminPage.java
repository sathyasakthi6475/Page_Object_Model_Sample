package com.OrangeHRMAssignment.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeAdminPage {

	WebDriver driver;

	public OrangeAdminPage(WebDriver ldriver) {

		this.driver = ldriver;
		
		PageFactory.initElements(ldriver, this);
		
	}

	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement Homepage_admin;

	@FindBy(id="menu_admin_Organization")
	public WebElement Homepage_admin_organisation;

	@FindBy(id="menu_admin_viewOrganizationGeneralInformation")
	public WebElement Homepage_admin_organisation_GeneralInformation;
	
	@FindBy(xpath="//a[contains(text(),'Locations')]")
	public WebElement locations;

	
	

			


	

}

