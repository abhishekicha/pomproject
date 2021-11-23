package saucelabs_testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.HomePage;
//import saucelabs_testcases.VerifyValidLogin;


public class Logout {

	@Test
	public void LogoutPage() throws InterruptedException  {

	WebDriver driver=	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");
    VerifyValidLogin login = PageFactory.initElements(driver, VerifyValidLogin.class);
	login.checkValidUser();
	HomePage home_page = PageFactory.initElements(driver, HomePage.class);
	home_page.logout_to_saucedemo();
	
	}
	
}
