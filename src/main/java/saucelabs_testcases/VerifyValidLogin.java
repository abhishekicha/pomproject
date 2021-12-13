package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.HomePage;
import saucelabs_Pages.LoginPage;

public class VerifyValidLogin {

	@Test
	public void checkValidUser() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		//created page object using page factory
		HomePage home_page = PageFactory.initElements(driver, HomePage.class);
	    home_page.logout_to_saucedemo();
		driver.quit();

	}

}
