package com.eBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver; //initalize local webdriver
	
	public LoginPage(WebDriver rdriver) //constructor
	{
		ldriver = rdriver; //initalize driver : local driver , remote driver
		PageFactory.initElements(rdriver, this); //initalize pagefactory
		
	}
	
	@FindBy(name="uid") //annotation FindBy
	WebElement txtUserName;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name= "btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement logout;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}
}
