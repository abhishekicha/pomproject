package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.SolutionsLogin;
import saucelabs_Pages.TryItFreeHome;


public class TryItFreeHomeTest {

	@Test(groups = { "regression" })
	public void checkTryHomeTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		TryItFreeHome con = PageFactory.initElements(driver, TryItFreeHome.class);
		//call the method
		con.checkTryHome();
		Thread.sleep(7000);
		SolutionsLogin login = PageFactory.initElements(driver, SolutionsLogin.class);
		login.login_to_saucedemo("abbypra", "Avi@1994");

	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
}
	

