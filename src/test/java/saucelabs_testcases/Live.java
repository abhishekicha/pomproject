package saucelabs_testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.LiveButton;
import saucelabs_Pages.LoginPage;


public class Live {
	@Test
	public void checkLive() throws InterruptedException {
		//launch browser 
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		
		LiveButton live_button = PageFactory.initElements(driver, LiveButton.class);
		live_button.checkLive();
	}

	@AfterTest
	  public void teardown()
	  {
		BrowserFactory.close();
	  }
}
