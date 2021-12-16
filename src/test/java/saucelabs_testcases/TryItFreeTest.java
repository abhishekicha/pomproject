package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.SolutionsLogin;
import saucelabs_Pages.TryItFree;

public class TryItFreeTest {
	
 
	@Test(groups = { "sanity", "smoke" })
	public void checkTrySol() throws InterruptedException {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		TryItFree con = PageFactory.initElements(driver, TryItFree.class);
		//call the method
		con.checkTryitFreeSolutions();
		Thread.sleep(7000);
		SolutionsLogin login = PageFactory.initElements(driver, SolutionsLogin.class);
		login.login_to_saucedemo("abbypra", "Avi@1994");

	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
}
