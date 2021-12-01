package saucelabs_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TryItFree {

	WebDriver driver;
	public TryItFree(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="(//a//span[text()='Try it free'])[1]") 	
	WebElement Try;
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement Signin;
	
	public void checkSolutions() throws InterruptedException {
		
		Try.click();
		Thread.sleep(7000);
		Signin.click();
		
	
   	    
	}
}
