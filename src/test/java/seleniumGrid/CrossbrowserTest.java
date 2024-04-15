package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class CrossbrowserTest {
	
	public WebDriver driver;
	@Parameters({"bname"})
	

	@SuppressWarnings("deprecation")
	@Test
	public void browserTest(String bname) throws MalformedURLException, InterruptedException {
		
		if(bname.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			Reporter.log("Test Executing on Chrome ! ", true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
			Reporter.log("Driver session established with server! ", true);
		}else if(bname.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			Reporter.log("Test Executing on Chrome ! ", true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
			Reporter.log("Driver session established with server! ", true);
			
		}else if(bname.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			Reporter.log("Test Executing on Chrome ! ", true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
			Reporter.log("Driver session established with server! ", true);
			
		}
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		System.out.println("Title is "+driver.getTitle());
		Thread.sleep(10000);
		Reporter.log("Test Executing for Amazon application ! ", true);
		
		driver.quit();
		Reporter.log("Test Executing on chrome completed ! ", true);
	}

}
