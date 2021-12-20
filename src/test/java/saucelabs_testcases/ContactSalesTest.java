package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.Sales;
import saucelabs_Pages.ContactSales;

public class ContactSalesTest {
	
	@Test(groups = { "regression" })
	public void checkContactSalesTestSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		ContactSales con = PageFactory.initElements(driver, ContactSales.class);
		//call the method
		con.checkContactSales();
		Sales con2 = PageFactory.initElements(driver, Sales.class);
		//call the method
		con2.checkSalesContact();
		Thread.sleep(1000);

	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
	

}
