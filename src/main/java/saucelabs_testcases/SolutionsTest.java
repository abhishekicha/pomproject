package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Solutions;
import saucelabs_Pages.SolutionsLogin;

public class SolutionsTest {
	
	
	@Test
	public void checkSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		Solutions sol = PageFactory.initElements(driver, Solutions.class);
		//call the method
		sol.checkSolutions();
		Thread.sleep(7000);

		//created page object using page factory
		SolutionsLogin login_page = PageFactory.initElements(driver, SolutionsLogin.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		driver.quit();

	}

}
