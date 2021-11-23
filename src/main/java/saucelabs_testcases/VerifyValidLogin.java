package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.LoginPage;

public class VerifyValidLogin {

	@Test
	public void checkValidUser() throws InterruptedException {
		//launch browser
	WebDriver driver=	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");
	//created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	//call the method
	login_page.login_to_saucedemo("abbypra", "Avi@1994");
	}
}
