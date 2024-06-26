package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;

public class HomePageTest extends BaseClass{
	
  @Test(priority=1)
  public void verifyUrl() {
	  String curl = hp.getAppUrl();
	  Assert.assertTrue(curl.contains("crm"),"Url is Wrong!");
	  System.out.println("URL is valid: "+ hp.getAppUrl());
	  
  }
  @Test(priority=2)
 public void verifyTitle() {
	  Assert.assertTrue(hp.getAppTitle().contains("Service"),"Title is not matched");
	  System.out.println("Title is matched "+ hp.getAppTitle());
	  
  }
  @Test(priority=3)
 public void verifySignIn() {
	  hp.getSignIn();
	  Assert.assertTrue(hp.getAppUrl().contains("login"),"Test Fail test page not open");
	  System.out.println("Test Paas: Login Page gets open");
 }
}
