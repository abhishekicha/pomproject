package saucelabs_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrossBrowser {
	
	WebDriver driver;
	public CrossBrowser(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//h2[text()= 'Cross-browser testing']") 	
	WebElement Cross;
	@FindBy(xpath="(//a//span[text()='Try it free'])[2]") 	
	WebElement Try;
	@FindBy(xpath="//a[@class='A_button__1Sovt']") 	
	WebElement Login;
	

	
public void checkCrossBrowser() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,330)", "");
		Thread.sleep(3000);
		Cross.click();
		Thread.sleep(5000);
		Try.click();
		Thread.sleep(5000);
		Login.click();
		
	}


}
