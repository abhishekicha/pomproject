package saucelabs_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fun {

	WebDriver driver;
	public Fun(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//div[contains(text(),'Get Started Guide')]//../../../../../a") 	
	WebElement GetStarted;
	@FindBy(xpath="//label[@for='manualTesting']//../../input") 	
	WebElement radio;
	@FindBy(xpath="//span[contains(text(),'Mobile app')]") 	
	WebElement mobile;
	
	
	public void checkFunctions() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		GetStarted.click();
		radio.click();
		mobile.click();
		
	}
	
}
