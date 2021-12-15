package saucelabs_Pages;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyCareers {
	
	private static final String SECONDS = null;
	WebDriver driver;
	public CompanyCareers(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="(//a[text()='Company'])[2]") 	
	WebElement Company;
	@FindBy(xpath="(//a[@href='/company/careers']//span[text()='Careers'])[2]") 	
	WebElement Careers;
	@FindBy(xpath="//select[@name='departments-select'][@id='departments-select']") 	
	WebElement sel1;
	
	
	@FindBy(xpath="(//div[@class='filter-container'])[2]") 	
	WebElement sel2;
	
	@FindBy(xpath="//iframe[@id='careersCurrentPosition']") 	
	WebElement frame;
	@FindBy(xpath="//select[@name='offices-select']//option[@value='25493']") 	
	List<WebElement> selval;
	
	
	public void checkCareerSolutions() throws InterruptedException {
		
		Actions actions = new Actions(driver);
        WebElement menuOption = Company;
    	actions.moveToElement(menuOption).perform();
    	WebElement subMenuOption = Careers;
//    	WebDriverWait wait= (new WebDriverWait(driver, 60));
//    	wait.until(ExpectedConditions . elementToBeClickable (subMenuOption));
    	actions.moveToElement(subMenuOption).perform();
    	subMenuOption.click();
    	Thread.sleep(10000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,550)", "");
	    Thread.sleep(10000);
	    driver.switchTo().frame(frame);

	    sel1.click();
	    sel1.sendKeys(Keys.ARROW_DOWN);
  	    Thread.sleep(3000);
  	    sel1.sendKeys(Keys.ENTER);
//	    WebDriverWait wait2 = new WebDriverWait(driver,30);
//	    wait2.until(ExpectedConditions.visibilityOf(sel1));


	
  	    WebElement dropdown = sel2; 
  	    dropdown.click();
	    List<WebElement> options =  selval;
   	    options.get(0).click();
  	    dropdown.click();
	    
	
	}
	
	

	}
