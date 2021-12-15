package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Platform {
	
	WebDriver driver;
	public Platform(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="(//a[text()='Platform'])[2]") 	
	WebElement Platform;
	@FindBy(xpath="(//span[text()='Cross-browser Testing'])[2]") 	
	WebElement Cross;
	@FindBy(xpath="(//span[text()='Try it free'])[2]") 	
	WebElement Try;
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement Signin;
	
	public void checkPlatformSolutions() throws InterruptedException {
		Actions actions = new Actions(driver);
        WebElement menuOption = Platform;
    	actions.moveToElement(menuOption).perform();
    	WebElement subMenuOption = Cross; 
    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	Thread.sleep(5000);
    	Try.click();
    	Thread.sleep(5000);
    	Signin.click();
		
	}


}
