package saucelabs_testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Automated;
import saucelabs_Pages.LoginPage;

public class AutomatedTest {
	
	@Test (groups = { "sanity" })
	public void checkAutomated() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://saucelabs.com");
		
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		
		Automated automated = PageFactory.initElements(driver, Automated.class);
		automated.checkAutomated();
	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
}
