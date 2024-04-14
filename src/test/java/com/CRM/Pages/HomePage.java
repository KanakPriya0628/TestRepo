package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Utility;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//By Locator
	
	private By signIn = By.linkText("Sign In");
	
	//Method
	
	public String getAppUrl() {
		return driver.getCurrentUrl();
	}
	public String getAppTitle() {
		return driver.getTitle();
	}
	public void getSignIn() {
		Utility.capture(driver);
		driver.findElement(signIn).click();
		
	}

}
