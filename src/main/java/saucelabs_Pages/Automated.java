package saucelabs_Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Automated {
		WebDriver driver;
		public Automated(WebDriver kdriver) {
			this.driver= kdriver;
		}
		
		@FindBy(xpath="//a//div[contains(text(),'Automated')]//../*/*") 	
		WebElement Automated;
		@FindBy(xpath="//a[@href='/dashboard/tests']//div[contains(text(),'Test Results')]") 	
		WebElement TestResults;
		@FindBy(xpath="//a//div[contains(text(),'Builds')]") 	
		WebElement Build;
		
		
		public void checkFunctions() throws InterruptedException {
			Thread.sleep(30000);
			Automated.click();
			Automated.click();
			TestResults.click();
			Build.click();
			driver.quit();
		}
		

}
