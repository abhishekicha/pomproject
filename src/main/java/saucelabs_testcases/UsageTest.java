package saucelabs_testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Usage;
import saucelabs_Pages.LoginPage;

public class UsageTest  {
	
	@Test
	public void checkSauce()  throws InterruptedException, IOException  {
		//launch browser
		WebDriver driver =	BrowserFactory.startBrowser("chrome", "https://saucelabs.com/");

		
		try{
		//created page object using page factory 
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		
		Usage use = PageFactory.initElements(driver, Usage.class);
	
		use.checkUsage();

		}catch(Exception e){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File("C:\\Users\\ACER\\eclipse-workspace\\Pom\\screenshots"
	    		+ "\\SoftwareTestingMaterial5.png"));
	}
	}

}
