package saucelabs_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Company {
	
	WebDriver driver;
	public Company(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="(//a[text()= 'Company'])[2]") 	
	WebElement Pricing;
	@FindBy(xpath="(//a[@href='/company']//span[text()='About Us'])[2]") 	
	WebElement AboutUs;
	@FindBy(xpath="//a//span[text()= 'View company fact sheet']") 	
	WebElement Fact;
	@FindBy(xpath="//a//span[text()= 'View data sheet']") 	
	WebElement data;
	
	public void checkCompanySolutions() throws InterruptedException {
		Actions actions = new Actions(driver);
        WebElement menuOption = Pricing;
    	actions.moveToElement(menuOption).perform();
    	WebElement subMenuOption = AboutUs;
    	WebDriverWait wait= (new WebDriverWait(driver, 60));
    	wait.until(ExpectedConditions . elementToBeClickable (subMenuOption));
    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	Thread.sleep(7000);
    	Fact.click();
    	Thread.sleep(10000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
    	data.click();


		
		
	}

}
