package com.OrangeHRMAssignment.Test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRMAssignment.Page.OrangeAdminPage;
import com.OrangeHRMAssignment.Page.OrangeGeneralinformationPage;
import com.OrangeHRMAssignment.Page.OrangeLocationPage;
import com.OrangeHRMAssignment.Page.OrangeLoginPage;

import library.Library;

public class OrangeLoginTest extends Library{
	
	Actions actions;
	Select select;

	@BeforeTest
	public void start() throws IOException {
		launchbrowser();
	}

	@Test(priority=1)
	public void login_page()  {
		OrangeLoginPage Loginpage= new OrangeLoginPage(driver);
		Loginpage.Login_username(prop.getProperty("Username"));
		Loginpage.Login_password(prop.getProperty("Password"));
		Loginpage.Login_login();	
	}

	@Test(priority=2)
	public void Homepage_generalinformation() {
		OrangeAdminPage adminpage = new OrangeAdminPage(driver);
		actions = new Actions(driver);
		actions.moveToElement(adminpage.Homepage_admin);
		actions.moveToElement(adminpage.Homepage_admin_organisation);
		actions.moveToElement(adminpage.Homepage_admin_organisation_GeneralInformation).click().build().perform();	
	}

	@Test(priority=3)
	public void GeneralInformation() {
		OrangeGeneralinformationPage generalinformation = new OrangeGeneralinformationPage(driver);
		generalinformation.General_Information_edit();
		generalinformation.General_Information_organisation("OrangeHRM (Pvt) Ltd");
		generalinformation.General_Information_phone(1404795768);
		generalinformation.General_Information_email("info@orangehrm.com");
		generalinformation.General_Information_address1("538 Teal Plaza");
		generalinformation.General_Information_city("Secaucus");
		generalinformation.General_Information_zipcode(35816);
		generalinformation.General_Information_note("HRM Software");
		generalinformation.General_Information_tax(1234560);
		generalinformation.General_Information_registration("A23456");
		generalinformation.General_Information_fax(83300);
		generalinformation.General_Information_address2("Dowton");
		generalinformation.General_Information_province("NJ");
		select = new Select(generalinformation.General_Information_country);
		select.selectByVisibleText("India");
		generalinformation.General_Information_save();	
	}
	
	@Test(priority=4)
	public void Homepage_location() {
		OrangeAdminPage adminpage = new OrangeAdminPage(driver);
		actions.moveToElement(adminpage.Homepage_admin);
		actions.moveToElement(adminpage.Homepage_admin_organisation);	
		actions.moveToElement(adminpage.locations).click().build().perform();
	}
	
	@Test(priority=5)
	public void Location() {
		OrangeLocationPage location = new OrangeLocationPage(driver);
		location.Location_locationname("Texas R&D");
		select = new Select(location.Location_country);
		select.selectByVisibleText("United States");
		location.Location_search();
		location.Location_reset();
		location.Location_add();
		location.Location_add_name("Chelsea Development Center");
		select = new Select(location.Location_add_country);
		select.selectByVisibleText("United Kingdom");
		location.Location_add_save();
		location.Location_checkbox_selection();
		location.Location_delete();
		location.Location_delete_alert();
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.alertIsPresent());
		Alert DeleteAlert= driver.switchTo().alert();
		DeleteAlert.accept();*/
	}

}