package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.SupportedIntegrations;
import saucelabs_Pages.SolutionsLogin;

public class SupportedIntegrationsTest {

	@Test
	public void checkSol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		SupportedIntegrations con = PageFactory.initElements(driver, SupportedIntegrations.class);
		//call the method
		con.checkSolutions();
		Thread.sleep(10000);

		//created page object using page factory
		SolutionsLogin login_page = PageFactory.initElements(driver, SolutionsLogin.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		driver.quit();

	}
}
