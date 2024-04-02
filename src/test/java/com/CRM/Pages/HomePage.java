package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//By Locator
	
	private By signIn = By.id("SignIn");
	
	//Method
	
	public String getAppUrl() {
		return driver.getCurrentUrl();
	}
	public String getAppTitle() {
		return driver.getTitle();
	}
	public void getSignIn() {
		driver.findElement(signIn).click();
	}

}
