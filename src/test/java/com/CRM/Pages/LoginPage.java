package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Utility;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//By Locator
	
		private By email = By.id("email-id");
		private By pass = By.id("password");
		private By btn = By.id("submit-id");

		
		//Method
		
		public void doLogin(String em,String ps) {
			 driver.findElement(email).sendKeys(em);
			 driver.findElement(pass).sendKeys(ps);
			 Utility.capture(driver);
			 driver.findElement(btn).click();

		}
	
}
