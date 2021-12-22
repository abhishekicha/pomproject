package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.ErrorReporting;

public class ErrorReportingTest {
	
	@Test(groups = { "regression" })
	public void checkErrorReportingTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		ErrorReporting con2 = PageFactory.initElements(driver, ErrorReporting.class);
		//call the method
		con2.checErrorReporting();
	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }



}
