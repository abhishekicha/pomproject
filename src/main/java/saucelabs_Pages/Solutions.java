package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Solutions {
	
	WebDriver driver;
	public Solutions(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//div[@class='nav-menu']//a[text()='Solutions']") 	
	WebElement Solutions;
	@FindBy(xpath="(//a[@href='/solutions/enterprise'])[2]") 	
	WebElement Enterprise;
	@FindBy(xpath="//span[text()='Start Testing']") 	
	WebElement Start;
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement Signin;
	
	public void checkSolutions() throws InterruptedException {
		Thread.sleep(5000);
		
        Actions actions = new Actions(driver);
        WebElement menuOption = Solutions;
    	actions.moveToElement(menuOption).perform();
    	WebElement subMenuOption = Enterprise; 
    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	Thread.sleep(5000);
    	Start.click();
    	Thread.sleep(5000);
    	Signin.click();
		
		
	}

}
