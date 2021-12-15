package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryItFree {

	WebDriver driver;
	public TryItFree(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="(//a//span[text()='Try it free'])[1]") 	
	WebElement Try;
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement Signin;
	
	public void checkTryitFreeSolutions() throws InterruptedException {
		
		Try.click();
		Thread.sleep(7000);
		Signin.click();
		
	
   	    
	}
}
