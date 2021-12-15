package saucelabs_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Continuos;
import saucelabs_Pages.SolutionsLogin;

public class ContinuosTest {


	@Test
	public void checkContinuous() throws InterruptedException { 
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		//created page object using page factory
		Continuos con = PageFactory.initElements(driver, Continuos.class);
		//call the method
		con.checkContinuosSolutions();
		Thread.sleep(7000);

		//created page object using page factory
		SolutionsLogin login_page = PageFactory.initElements(driver, SolutionsLogin.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");

	}

	@AfterTest
	  public void teardown()
	  {
		BrowserFactory.close();
	  }
}
