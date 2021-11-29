package saucelabs_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceApp {
	
	
	
			WebDriver driver;
			public SauceApp(WebDriver kdriver) {
				this.driver= kdriver;
			}
			
			@FindBy(xpath="(//div[text()='Sauce Apps']/../..//following::*)[2]") 	
			WebElement SauceApps;
			@FindBy(xpath="//a//div[contains(text(),'Visual')]") 	
			WebElement Visual;
			
			public void checkFunctions() throws InterruptedException {
				Thread.sleep(30000);
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(SauceApps)).click();
				Visual.click();
				driver.quit();
			}
			

	}



