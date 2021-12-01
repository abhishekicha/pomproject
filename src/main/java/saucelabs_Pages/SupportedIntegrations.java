package saucelabs_Pages;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SupportedIntegrations {
	
	WebDriver driver;
	public SupportedIntegrations(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="(//a[text()='Platform'])[2]") 	
	WebElement Platform;
	@FindBy(xpath="(//span[text()='Supported Integrations'])[2]") 	
	WebElement Support;
	@FindBy(xpath="(//span[text()='Learn more'])[1]") 	
	WebElement Learn;
	@FindBy(xpath="//a[text()='Get Started']\r\n") 	
	WebElement GetStarted;
	@FindBy(xpath="//span[text()='Sign In']") 	
	WebElement Signin;
	
	public void checkSolutions() throws InterruptedException {
		Actions actions = new Actions(driver);
        WebElement menuOption = Platform;
    	actions.moveToElement(menuOption).perform();
    	WebElement subMenuOption = Support; 
    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	Thread.sleep(5000);
    	Learn.click();
    	Thread.sleep(5000);
    	GetStarted.click();
    	Thread.sleep(5000);
        String newTab =null;
        String baseTab = driver.getWindowHandle();
        Signin.click();
        Set <String> allTabs = driver.getWindowHandles();
        allTabs.remove(baseTab);
        Iterator<String> itr = allTabs.iterator();
        
        while(itr.hasNext()){


            newTab = (String) itr.next();

            }

            driver.switchTo().window(newTab);
    	
       
    	
	}

}
