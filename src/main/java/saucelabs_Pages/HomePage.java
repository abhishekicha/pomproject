package saucelabs_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Account')]/..//div//div/*") 
    WebElement Account;
	
	@FindBy(how=How.XPATH, using="//div[@class='HeaderV2__navigation-item__1yICo']//span/*") 
    WebElement Logout;
	
	
	public void logout_to_saucedemo() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Account.click();
        Logout.click();

	}
}
