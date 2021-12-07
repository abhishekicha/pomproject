package saucelabs_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pricing {
	
	WebDriver driver;
	public Pricing(WebDriver kdriver) {
		this.driver= kdriver;
	}

	@FindBy(xpath="(//a[@href='/pricing'])[2]") 	
	WebElement Pricing;
	@FindBy(xpath="//a[text()='Help me choose a plan']") 	
	WebElement Plan;
	@FindBy(xpath="//a[text()='Test Manually']") 	
	WebElement TestManually;
	@FindBy(xpath="//a[text()='Website']") 	
	WebElement Website;
	@FindBy(xpath="//a[text()='Desktop']") 	
	WebElement Desktop;
	@FindBy(xpath="(//select[@class='browser-default'])[1]") 	
	WebElement Drop;
	@FindBy(xpath="//span[@class='lever']") 	
	WebElement Monthly;
	@FindBy(xpath="(//a//span[text()='Get Started'])[1]") 	
	WebElement GetStarted;
	
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement Signin;
	
	
	
	public void checkSolutions() throws InterruptedException {
		Pricing.click();
		Thread.sleep(7000);
		Plan.click();
		Thread.sleep(3000);
		TestManually.click();
		Thread.sleep(3000);
		Website.click();
		Thread.sleep(3000);
		Desktop.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,280)", "");
		Drop.click();
		Drop.sendKeys(Keys.ARROW_DOWN);
		Drop.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Monthly.click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,420)", "");
		Thread.sleep(2000);
		GetStarted.click();
		Thread.sleep(7000);
		Signin.click();
		
		
	}
	

}
