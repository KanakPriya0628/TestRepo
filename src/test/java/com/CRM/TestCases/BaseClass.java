package com.CRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Pages.*;

public class BaseClass {
	
	public WebDriver driver;
	public HomePage hp;
	
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		hp = new HomePage(driver);
		System.out.println(hp);
	}
	

}
