package saucelabs_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SauceApp {
	
	
	
			WebDriver driver;
			public SauceApp(WebDriver kdriver) {
				this.driver= kdriver;
			}
			
			@FindBy(xpath="") 	
			WebElement SauceApps;
			@FindBy(xpath="(//div[text()='Sauce Apps']/../..//following::*)[2]") 	
			WebElement Visual;
			@FindBy(xpath="//a//div[contains(text(),'Visual')]") 	
			WebElement Build;
			
			//a//div[contains(text(),'Sauce Apps')]/../../..//*//*//*//*//*//*//..//..//..
			public void checkFunctions() throws InterruptedException {
				Thread.sleep(30000);
				SauceApps.click();
				Visual.click();
				//driver.quit();
			}
			

	}



