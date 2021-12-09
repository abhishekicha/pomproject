package saucelabs_testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Usage;
import saucelabs_Pages.LoginPage;

public class UsageTest  {
	
	@Test
	public void checkSauce() throws InterruptedException, IOException  {
		//launch browser
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		
		//created page object using page factory 
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		try{

		Usage use = PageFactory.initElements(driver, Usage.class);
		use.checkUsage();
		//Assert.assertEquals(false, true);

		}catch(Exception e){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File("C:\\Users\\ACER\\eclipse-workspace\\Pom\\screenshots"
	    		+ "\\SoftwareTestingMaterial.png"));
	}
	}
	
	

}
