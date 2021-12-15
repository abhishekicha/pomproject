package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Contact;


public class ContactTest {


	@Test
	public void checkContact() throws InterruptedException {
		//launch browser 
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		Contact con = PageFactory.initElements(driver, Contact.class);
		//call the method
		con.checkContact();
		Thread.sleep(1000);

	}
	   @AfterMethod
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
	
}
