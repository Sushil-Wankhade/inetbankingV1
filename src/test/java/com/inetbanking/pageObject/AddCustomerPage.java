package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;

public class AddCustomerPage 
{
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]\"")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnlogin")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	@CacheLookup
	WebElement lnkLogout;
	


}
