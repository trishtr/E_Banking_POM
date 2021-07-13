package com.eBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (how = How.XPATH, using = "//a[contains(text(),'New Customer')]")
	WebElement linkAddNewCustomer;
	
	@FindBy (how = How.NAME, using = "name")
	WebElement txtCustomerName;
	
	@FindBy (how = How.XPATH, using = "//input[@value='m']")
	WebElement rdGenderMale;
	
	@FindBy (how = How.XPATH, using = "//input[@value='f']")
	WebElement rdGenderFemale;
	
	@FindBy (how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;
	
	@FindBy (how = How.NAME, using = "addr")
	WebElement txtAddress;
	
	@FindBy (how = How.NAME, using = "city")
	WebElement txtCity;
	
	@FindBy (how = How.NAME, using = "state")
	WebElement txtState;
	
	@FindBy (how = How.NAME, using = "pinno")
	WebElement txtpinno;
	
	@FindBy (how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;
	
	@FindBy (how = How.NAME, using = "emailid")
	WebElement txtemailid;
	
	@FindBy (how = How.NAME, using = "password")
	WebElement txtpassword;
	
	@FindBy (how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		linkAddNewCustomer.click();
			
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}

	public void custgender1() {
		rdGenderFemale.click();
	}
	
	public void custgender2() {
		rdGenderMale.click();
	}
	

	public void custdob(String mmddyyyy) {
		txtdob.sendKeys(mmddyyyy);
		
		
	}

	public void custaddress(String caddress) {
		txtAddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtCity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtState.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}
	
	
	
	
	
	
	
	
}
