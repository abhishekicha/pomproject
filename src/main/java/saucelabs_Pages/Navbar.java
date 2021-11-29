package saucelabs_Pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Navbar {

	WebDriver driver;
	public Navbar(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//div[text()='Help & Support']/ancestor-or-self::button[@class='Buttons__btn__3yodQ HeaderButtonV2__navigation-badge__1hNEI Buttons__btn-default__1-n0a']") 	
	WebElement Help;
	@FindBy(xpath="//div[@class='StyledDropdown__container__31oo8 dropdown open']//a[@href='https://support.saucelabs.com']") 	
	WebElement Support;
	@FindBy(xpath="//div[@class='StyledDropdown__container__31oo8 dropdown open']//a[@href='https://docs.saucelabs.com/']") 	
	WebElement Documentation;
	@FindBy(xpath="//div[@class='StyledDropdown__container__31oo8 dropdown open']//a[@href='https://status.saucelabs.com']") 	
	WebElement StatusPage;
	
	public void checkNavbar() throws InterruptedException {
		Thread.sleep(30000);
		WebDriverWait wait = new WebDriverWait(driver,30);
	    String oldTab = driver.getWindowHandle();
		wait.until(ExpectedConditions.elementToBeClickable(Help)).click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		wait.until(ExpectedConditions.elementToBeClickable(Support)).click();
	    driver.switchTo().window(newTab.get(0));
		wait.until(ExpectedConditions.elementToBeClickable(Help)).click();
		Documentation.click();
	    driver.switchTo().window(newTab.get(0));
		wait.until(ExpectedConditions.elementToBeClickable(Help)).click();
		StatusPage.click();
	    driver.switchTo().window(newTab.get(0));
		driver.quit();
	}
	

}