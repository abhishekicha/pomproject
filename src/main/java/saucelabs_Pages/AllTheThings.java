package saucelabs_Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AllTheThings {
	
	WebDriver driver;
	public AllTheThings(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//h2[text()= 'Mobile Beta Testing']") 	
	WebElement Mobile;
	@FindBy(xpath="(*//a[@class='button is-rounded is-primary'])[3]") 	
	WebElement Try;
	@FindBy(xpath="//h2[text()='API Testing']") 	
	WebElement Api;
	@FindBy(xpath="(//a[@class='button is-rounded is-primary'])[3]") 	
	WebElement GetStarted;
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement SignIn;
	@FindBy(xpath="//h2[text()='UI / Visual Testing']") 	
	WebElement Ui;
	@FindBy(xpath="//span[text()='Request a demo']") 	
	WebElement Demo;
	@FindBy(xpath="//input[@name='FirstName']") 	
	WebElement Fname;
	@FindBy(xpath="//input[@name='LastName']") 	
	WebElement Lname;
	@FindBy(xpath="(//input[@name='Email'])[1]") 	
	WebElement Email;
	@FindBy(xpath="(//input[@name='Company'])[1]") 	
	WebElement Company;
	@FindBy(xpath="(//input[@name='Title'])[1]") 	
	WebElement Job;
	@FindBy(xpath="//select[@id='Country']") 	
	WebElement Country;
	@FindBy(xpath="(//button[@class='mktoButton'])[1]") 	
	WebElement Submit;
	@FindBy(xpath="//h2[text()='Test Automation']") 	
	WebElement Test;

	
	
	public void checkMobile() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,470)", "");
		Thread.sleep(3000);
		Mobile.click();
		Thread.sleep(5000);
		Try.click();
		
	}
	
	public void checkApi() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,470)", "");
		Thread.sleep(3000);
		Api.click();
		Thread.sleep(5000);
		GetStarted.click();
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
	          SignIn.click();
	}
	
	public void checkUi() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,470)", "");
		Thread.sleep(3000);
		Ui.click();
		Thread.sleep(5000);
		Demo.click();
		Thread.sleep(7000);
		Fname.sendKeys("Abhishek");
		Thread.sleep(3000);
		Lname.sendKeys("Pramanik");
		Thread.sleep(3000);
		Email.sendKeys("abhishek.pramanik@codelogicx.com");
		Thread.sleep(3000);
		Company.sendKeys("Codelogicx");
		Thread.sleep(3000);
		Job.sendKeys("QA Tester");
		Thread.sleep(3000);
		Select select = new Select(Country);
	    select.selectByValue("India");
	    Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,300)", "");
	    Submit.click();
	}
	
	public void checkAutomation() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,470)", "");
		Thread.sleep(3000);
		Test.click();
		Thread.sleep(5000);
		Try.click();
		Thread.sleep(5000);
		SignIn.click();
		Thread.sleep(5000);
	
	}
}
