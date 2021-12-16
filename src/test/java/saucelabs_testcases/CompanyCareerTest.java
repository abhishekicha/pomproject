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
import saucelabs_Pages.CompanyCareers;

public class CompanyCareerTest {
	
	@Test (groups = { "sanity", "smoke" })
	public void checkCareer() throws InterruptedException {
		//launch browser
		
	WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");
		
		//created page object using page factory
		CompanyCareers con = PageFactory.initElements(driver, CompanyCareers.class);
		//call the method
		con.checkCareerSolutions();
		Thread.sleep(5000);

	}

	  @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
}
