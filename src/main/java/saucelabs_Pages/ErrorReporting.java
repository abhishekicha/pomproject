package saucelabs_Pages;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorReporting {
	
	WebDriver driver;
	public ErrorReporting(WebDriver kdriver) {
		this.driver= kdriver;
	}
	@FindBy(xpath="//h2[text()= 'Error Reporting']") 	
	WebElement Err;
	@FindBy(xpath="(//a[@class='button is-rounded is-primary'])[3]") 	
	WebElement Try;
	@FindBy(xpath="	(//input[@name='company'])[1]") 	
	WebElement Com;
	@FindBy(xpath="(//input[@name='first'])[1]") 	
	WebElement First;
	@FindBy(xpath="(//input[@name='last'])[1]") 	
	WebElement Last;
	@FindBy(xpath="(//p[@id='email-container'])[1]//input") 	
	WebElement Email;
	@FindBy(xpath="(//input[@name='role'])[1]") 	
	WebElement Role;
	@FindBy(xpath="(//input[@name='phone'])[1]") 	
	WebElement Ph;
	@FindBy(xpath="(//input[@name='subdomain'])[1]") 	
	WebElement Sub;
	@FindBy(xpath="(//input[@name='username'])[1]") 	
	WebElement Username;
	@FindBy(xpath="(//input[@value='SIGN UP FOR FREE'])[1]") 	
	WebElement Submit;
	
	public void checErrorReporting() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,330)", "");
		Err.click();
		Thread.sleep(5000);
		Try.click();
		Thread.sleep(10000);		
		String newTab =null;
      String baseTab = driver.getWindowHandle();
      Set <String> allTabs = driver.getWindowHandles();
      allTabs.remove(baseTab);
      Iterator<String> itr = allTabs.iterator();
      
      while(itr.hasNext()){


          newTab = (String) itr.next();

          }

          driver.switchTo().window(newTab);
  	
  		Com.sendKeys("Codelogicx");
  		Thread.sleep(3000);
  		First.sendKeys("Abhishek");
  		Thread.sleep(3000);
  		Last.sendKeys("Pramanik");
  		Thread.sleep(3000);
  		Email.sendKeys("abhishek.pramanik@codelogicx.com");
		Thread.sleep(3000);
		Role.sendKeys("Qa Engnr");
		Thread.sleep(3000);
		Ph.sendKeys("784526655");
		Thread.sleep(3000);
		Sub.sendKeys("codelogicx.com");
		Thread.sleep(3000);
		Username.sendKeys("Abhishek");
		Submit.click();
	}
}
