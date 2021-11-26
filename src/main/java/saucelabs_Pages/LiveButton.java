package saucelabs_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveButton {
	WebDriver driver;
	public LiveButton(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//div[contains(text(),'Live')]/../..") 	
	WebElement Live;
	@FindBy(xpath="//div[contains(text(),'Test Results')]") 	
	WebElement TestResults;
	@FindBy(xpath="//div[contains(text(),'Cross Browser')]") 	
	WebElement crossbrowser;
	
	
	public void checkLive() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Live.click();
		TestResults.click();
		crossbrowser.click();
		driver.quit();
	}
	

}
