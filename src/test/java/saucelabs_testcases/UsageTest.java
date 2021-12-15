package saucelabs_testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import saucelabs_Pages.Usage;
import saucelabs_Pages.LoginPage;

public class UsageTest  {
	
	
	
	@Test
	public void checkUsageTest()  throws InterruptedException, IOException  {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

//		try{
		//created page object using page factory 
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		
		Usage use = PageFactory.initElements(driver, Usage.class);
	
		use.checkUsage();

//		}catch(Exception e){
//            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    FileUtils.copyFile(screenshotFile, new File("C:\\Users\\ACER\\eclipse-workspace\\Pom\\screenshots"
//	    		+ "\\SoftwareTestingMaterial8.png"));
//	}

		Assert.fail("Write your custom error message");

	}

	  @AfterMethod
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
	
	
}
