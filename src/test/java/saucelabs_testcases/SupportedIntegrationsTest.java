package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.SupportedIntegrations;
import saucelabs_Pages.SolutionsLogin;

public class SupportedIntegrationsTest {

	@Test(groups = { "sanity", "smoke" })
	public void checkIntegrations() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		SupportedIntegrations con = PageFactory.initElements(driver, SupportedIntegrations.class);
		//call the method
		con.checkSupportedIntegrationsSolutions();
		Thread.sleep(10000);

//		//created page object using page factory
//		SolutionsLogin login_page = PageFactory.initElements(driver, SolutionsLogin.class);
//		//call the method
//		login_page.login_to_saucedemo("abbypra", "Avi@1994");

	}
	
    @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
}
