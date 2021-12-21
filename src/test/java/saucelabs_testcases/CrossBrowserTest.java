package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.SolutionsLogin;
import saucelabs_Pages.CrossBrowser;

public class CrossBrowserTest {
	
	@Test(groups = { "regression" })
	public void checkCrossBrowserTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		CrossBrowser con2 = PageFactory.initElements(driver, CrossBrowser.class);
		//call the method
		con2.checkCrossBrowser();
		Thread.sleep(5000);
		SolutionsLogin sol = PageFactory.initElements(driver, SolutionsLogin.class);
		sol.login_to_saucedemo("abbypra", "Avi@1994");

	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }

}
