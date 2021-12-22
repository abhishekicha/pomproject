package saucelabs_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LowCode {
	
	WebDriver driver;
	public LowCode(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	
	@FindBy(xpath="//h2[text()= 'Low-code testing']") 	
	WebElement Mobile;
	@FindBy(xpath="(//span[text()='Request a demo'])[1]") 	
	WebElement Req;
	@FindBy(xpath="//input[@id='FirstName']") 	
	WebElement Name;
	@FindBy(xpath="//input[@id='LastName']") 	
	WebElement Lname;
	@FindBy(xpath="//input[@id='Company']") 	
	WebElement Company;
	@FindBy(xpath="//input[@id='Title']") 	
	WebElement Title;
	@FindBy(xpath="//input[@id='Email']") 	
	WebElement Email;
	@FindBy(xpath="//input[@id='Phone']") 	
	WebElement Phone;
	@FindBy(xpath="//select[@id='Country']") 	
	WebElement Country;
	@FindBy(xpath="//textarea[@id='Sales_Contact_Comments__c']") 	
	WebElement Comments;
	@FindBy(xpath="//label[@id='LblmktoCheckbox_26256_0']") 	
	WebElement Consent;
	@FindBy(xpath="//button[text()='Submit']") 	
	WebElement Submit;
	
	public void checLowCode() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,330)", "");
		Mobile.click();
		Thread.sleep(5000);
		Req.click();
		WebDriverWait wait= (new WebDriverWait(driver, 60));
		wait.until(ExpectedConditions.visibilityOf(Name));
		Name.sendKeys("Abhishek");
		Thread.sleep(3000);
		Lname.sendKeys("Pramanik");
		Thread.sleep(3000);
		Company.sendKeys("codelogicx");
		Thread.sleep(3000);
		Title.sendKeys("QA Engineer");
	    js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		Email.sendKeys("abhishek.pramanik@codelogicx.com");
		Thread.sleep(3000);
		Phone.sendKeys("7855445246");
		Thread.sleep(3000);
		Select select1 = new Select(Country);
	    select1.selectByValue("India");
		Thread.sleep(3000);
		Comments.sendKeys("nothing..");
		Thread.sleep(3000);
		Consent.click();
		Thread.sleep(1000);
		Submit.click();
		
	}


}
