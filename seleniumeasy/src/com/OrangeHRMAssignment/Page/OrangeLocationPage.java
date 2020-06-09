package com.OrangeHRMAssignment.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeLocationPage {

	WebDriver driver;

	public OrangeLocationPage(WebDriver ldriver) {

		this.driver = ldriver;

		PageFactory.initElements(ldriver, this);
	}


	@FindBy(id="searchLocation_name")
	public WebElement Location_locationname;

	@FindBy(id="searchLocation_city")
	public WebElement Location_city;

	@FindBy(id="searchLocation_country")
	public WebElement Location_country;

	@FindBy(id="btnSearch")
	public WebElement Location_search;

	@FindBy(id="btnReset")
	public WebElement Location_reset;

	@FindBy(name="btnAdd")
	public WebElement Location_add;

	@FindBy(id="location_name")
	public WebElement Location_add_name;

	@FindBy(id="location_country")
	public WebElement Location_add_country;

	@FindBy(id="location_city")
	public WebElement Location_add_city;

	@FindBy(id="location_address")
	public WebElement Location_add_address;

	@FindBy(id="location_zipCode")
	public WebElement Location_add_zipcode;

	@FindBy(id="location_phone")
	public WebElement Location_add_phone;

	@FindBy(id="location_fax")
	public WebElement Location_add_fax;

	@FindBy(id="location_notes")
	public WebElement Location_add_notes;

	@FindBy(id="btnSave")
	public WebElement Location_add_save;

	@FindBy(id="btnCancel")
	public WebElement Location_add_cancel;

	@FindBy(xpath="//a[contains(text(),'Chelsea Development Center')]//preceding::input[1]")
	public WebElement Location_checkbox_selection;

	@FindBy(name="btnDelete")
	public WebElement Location_delete;


	@FindBy(id="dialogDeleteBtn")
	public WebElement Location_delete_alert;


	//Enter the Location Name
	public void Location_locationname(String location) {
		Location_locationname.sendKeys(location);
	}

	//Enter the City
	public void Location_city(String city) {
		Location_city.sendKeys(city);
	}

	//Click to Search
	public void Location_search() {
		Location_search.click();
	}

	//Click to Reset
	public void Location_reset() {
		Location_reset.click();
	}

	//Click to Add the Location
	public void Location_add() {
		Location_add.click();
	}

	//Enter the Location
	public void Location_add_name(String name) {
		Location_add_name.sendKeys(name);
	}

	//Enter the City
	public void Location_add_city(String city) {
		Location_add_city.sendKeys(city);
	}

	//Enter the Address
	public void Location_add_address(String address) {
		Location_add_address.sendKeys(address);
	}

	//Enter the Zipcode
	public void Location_add_zipcode(long zipcode) {
		Location_add_zipcode.sendKeys(String.valueOf(zipcode));
	}	

	//Enter the Phone Number
	public void Location_add_phone(long phonenumber) {
		Location_add_phone.sendKeys(String.valueOf(phonenumber));
	}	

	//Enter the Fax
	public void Location_add_fax(long fax) {
		Location_add_fax.sendKeys(String.valueOf(fax));
	}	

	//Enter the Notes
	public void Location_delete(String notes) {
		Location_add_notes.sendKeys(notes);
	}

	//Click to save
	public void Location_add_save() {
		Location_add_save.click();
	}

	//Click to Cancel
	public void Location_add_cancel() {
		Location_add_cancel.click();
	}		

	//Click to select the checkbox to Delete
	public void Location_checkbox_selection() {
		Location_checkbox_selection.click();
	}

	//Click to Delete
	public void Location_delete() {
		Location_delete.click();
	}

	//Click OK in the alert box
	public void Location_delete_alert() {
		Location_delete_alert.click();
	}

}


