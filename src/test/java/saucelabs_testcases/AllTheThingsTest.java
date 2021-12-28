package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.AllTheThings;
import saucelabs_Pages.SolutionsLogin;



public class AllTheThingsTest {

	@Test(priority=1, groups = { "regression" })
	public void checkMobileBetaTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		AllTheThings con2 = PageFactory.initElements(driver, AllTheThings.class);
		//call the method
		con2.checkMobile();
	}
	
	@Test(priority=2, groups = { "regression" })
	public void checkApiTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		AllTheThings con3 = PageFactory.initElements(driver, AllTheThings.class);
		//call the method
		con3.checkApi();
		
		SolutionsLogin login = PageFactory.initElements(driver, SolutionsLogin.class);
		login.login_to_saucedemo("abbypra", "Avi@1994");
		
		
	}
	
	@Test(priority=3, groups = { "regression" })
	public void checkUiTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		AllTheThings con3 = PageFactory.initElements(driver, AllTheThings.class);
		//call the method
		con3.checkUi();
	
	}
	
	@Test(priority=4, groups = { "regression" })
	public void checkAutomationTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		AllTheThings con3 = PageFactory.initElements(driver, AllTheThings.class);
		//call the method
		con3.checkAutomation();
		
		SolutionsLogin login = PageFactory.initElements(driver, SolutionsLogin.class);
		login.login_to_saucedemo("abbypra", "Avi@1994");
		
		
	}
	

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }


}
