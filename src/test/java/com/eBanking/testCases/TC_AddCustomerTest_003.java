package com.eBanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.pageObjects.AddCustomerPage;
import com.eBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		logger.info("Providing customer details....");
		
		
		addcust.custName("Trish");
		addcust.custgender1();
		addcust.custdob("01011995");
		Thread.sleep(5000);
		addcust.custaddress("USA");
		addcust.custcity("SJ");
		addcust.custstate("CA");
		addcust.custpinno("123456");
		addcust.custtelephoneno("123456789");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
		public String randomestring() 
		{
			String generatedstring = RandomStringUtils.randomAlphabetic(8);
			return generatedstring;
		}
		
		
	}


