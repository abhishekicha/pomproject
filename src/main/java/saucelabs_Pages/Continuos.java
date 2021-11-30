package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Continuos {
	
	WebDriver driver;
	public Continuos(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//div[@class='nav-menu']//a[text()='Solutions']") 	
	WebElement Solutions;
	@FindBy(xpath="(//span[text()='Continuous Testing'])[2]") 	
	WebElement Continuos;
	@FindBy(xpath="(//span[text()='Try it free'])[2]") 	
	WebElement Try;
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement Signin;
	
	
	public void checkSolutions() throws InterruptedException {
		Actions actions = new Actions(driver);
        WebElement menuOption = Solutions;
    	actions.moveToElement(menuOption).perform();
    	WebElement subMenuOption = Continuos; 
    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	Thread.sleep(5000);
    	Try.click();
    	Thread.sleep(5000);
    	Signin.click();
		
	}

}
