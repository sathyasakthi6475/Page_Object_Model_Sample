package com.OrangeHRMAssignment.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeGeneralinformationPage {

	WebDriver driver;

	public OrangeGeneralinformationPage(WebDriver ldriver) {

		this.driver = ldriver;

		PageFactory.initElements(ldriver, this);
	}

	@FindBy(id="btnSaveGenInfo")
	public WebElement General_Information_edit;

	@FindBy(id="organization_name")
	public WebElement General_Information_organisation;

	@FindBy(id="organization_phone")
	public WebElement General_Information_phone;

	@FindBy(id="organization_email")
	public WebElement General_Information_email;

	@FindBy(id="organization_street1")
	public WebElement General_Information_address1;

	@FindBy(id="organization_city")
	public WebElement General_Information_city;

	@FindBy(id="organization_zipCode")
	public WebElement General_Information_zipcode;

	@FindBy(id="organization_note")
	public WebElement General_Information_note;

	@FindBy(id="organization_taxId")
	public WebElement General_Information_tax;

	@FindBy(id="organization_registraionNumber")
	public WebElement General_Information_registration;

	@FindBy(id="organization_fax")
	public WebElement General_Information_fax;

	@FindBy(id="organization_street2")
	public WebElement General_Information_address2;

	@FindBy(id="organization_province")
	public WebElement General_Information_province;

	@FindBy(id="organization_country")
	public WebElement General_Information_country;

	@FindBy(id="btnSaveGenInfo")
	public WebElement General_Information_save;


	//Click Edit to enable all the fields
	public void General_Information_edit() {
		General_Information_edit.click();
	}	

	//Enter the Organization Name 
	public void General_Information_organisation(String organisationame) {	
		General_Information_organisation.clear();
		General_Information_organisation.sendKeys(organisationame);
	}

	//Enter the Phone Number
	public void General_Information_phone(long phonenumber) {
		General_Information_phone.clear();
		General_Information_phone.sendKeys(String.valueOf(phonenumber));
	}

	//Enter the Email
	public void General_Information_email(String Email) {
		General_Information_email.clear();
		General_Information_email.sendKeys(Email);
	}

	//Enter the Address1
	public void General_Information_address1(String address1) {
		General_Information_address1.clear();
		General_Information_address1.sendKeys(address1);
	}

	//Enter the City
	public void General_Information_city(String city) {
		General_Information_city.clear();
		General_Information_city.sendKeys(city);
	}

	//Enter the Zipcode
	public void General_Information_zipcode(long zipcode) {
		General_Information_zipcode.clear();
		General_Information_zipcode.sendKeys(String.valueOf(zipcode));
	}

	//Enter the Note
	public void General_Information_note(String note) {
		General_Information_note.clear();
		General_Information_note.sendKeys(note);
	}

	//Enter the Tax ID
	public void General_Information_tax(long taxID) {
		General_Information_tax.clear();
		General_Information_tax.sendKeys(String.valueOf(taxID));
	}

	//Enter the Registration Number
	public void General_Information_registration(String registrationNo) {
		General_Information_registration.clear();
		General_Information_registration.sendKeys(registrationNo);
	}

	//Enter the Fax Number
	public void General_Information_fax(long fax) {
		General_Information_fax.clear();
		General_Information_fax.sendKeys(String.valueOf(fax));
	}

	//Enter the Address2
	public void General_Information_address2(String address2) {
		General_Information_address2.sendKeys(address2);
	}

	//Enter the Province
	public void General_Information_province(String province) {
		General_Information_province.clear();
		General_Information_province.sendKeys(province);
	}
	
	//Select the country
	//Using Drop Down Reusable function
	public void General_Information_country() {
	
	}
	
	//Click to Save
	public void General_Information_save() {
		General_Information_save.click();
	}

}
