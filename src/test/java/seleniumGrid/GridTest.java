package seleniumGrid;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

public class GridTest {
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void testOnChrome() throws MalformedURLException, InterruptedException{
		
		ChromeOptions options = new ChromeOptions();
		Reporter.log("Test Executing on Chrome ! ", true);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		Reporter.log("Driver session established with server! ", true);
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		System.out.println("Title is "+driver.getTitle());
		Thread.sleep(10000);
		Reporter.log("Test Executing for Amazon application ! ", true);
		
		driver.quit();
		Reporter.log("Test Executing on chrome completed ! ", true);


	}

}
