package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.LowCode;

public class LowCodeTest {

	@Test(groups = { "regression" })
	public void checkLowCodeTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		LowCode con2 = PageFactory.initElements(driver, LowCode.class);
		//call the method
		con2.checLowCode();
	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }


}
