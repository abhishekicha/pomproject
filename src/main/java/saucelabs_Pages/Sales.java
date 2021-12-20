package saucelabs_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Sales {
	
	WebDriver driver;
	public Sales(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="(//a[@href='/sales'])[2]") 	
	WebElement Sales;
	@FindBy(xpath="//input[@id='FirstName']") 	
	WebElement Fname;
	@FindBy(xpath="//input[@id='LastName']") 	
	WebElement Lname;
	@FindBy(xpath="//input[@id='Company']") 	
	WebElement Company;
	@FindBy(xpath="(//input[@id='Email'])[1]") 	
	WebElement Email;
	@FindBy(xpath="(//select[@id='Company_Size__c'])[1]") 	
	WebElement Size;
	@FindBy(xpath="(//select[@id='Country'])[1]") 	
	WebElement Country;
	@FindBy(xpath="(//input[@id='Phone'])[1]") 	
	WebElement Phone;
	@FindBy(xpath="(//input[@name='productInterest'])[1]") 	
	WebElement cb1;
	@FindBy(xpath="(//input[@name='productInterest'])[6]") 	
	WebElement cb2;
	@FindBy(xpath="//textarea[@id='Sales_Contact_Comments__c']") 	
	WebElement text;
	@FindBy(xpath="//input[@name='sauceLabsContactConsent']") 	
	WebElement consent;
	@FindBy(xpath="(//button[@type='submit'])[2]") 	
	WebElement submit;
	
	
	public void checkSalesContact() throws InterruptedException {
		
   	    Thread.sleep(7000);
    	Fname.sendKeys("Abhishek");
    	Thread.sleep(3000);
    	Lname.sendKeys("Pramanik");
    	Thread.sleep(3000);
    	Company.sendKeys("Codelogicx");
    	Thread.sleep(3000);
    	Email.sendKeys("abhishek.pramanik@codelogicx.com");
    	Thread.sleep(3000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)", "");
	    Select select1 = new Select(Size);
	    select1.selectByValue("11-50");
    	Thread.sleep(3000);
    	Select select = new Select(Country);
	    select.selectByValue("India");
    	Thread.sleep(3000);
    	Phone.sendKeys("44552255225");
    	Thread.sleep(3000);
    	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("window.scrollBy(0,250)", "");
	    Thread.sleep(1000);
	    cb1.click();
	    Thread.sleep(3000);
	    cb2.click();
	    JavascriptExecutor js3 = (JavascriptExecutor) driver;
	    js3.executeScript("window.scrollBy(0,420)", "");
	    Thread.sleep(3000);
	    text.sendKeys("nothing...");
	    Thread.sleep(3000);
	    consent.click();
	    Thread.sleep(3000);
	    submit.click(); 
	    


	}


}
