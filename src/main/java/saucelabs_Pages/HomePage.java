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
	
	
	@FindBy(xpath="//div[contains(text(),'Account')]/..//div//div/*") 
    WebElement Account;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/div[3]/div/ul/li[4]/a/span[1]") 
    WebElement Logout;
	
	
	public void logout_to_saucedemo() throws InterruptedException {
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(Account));
		Account.click();
        Logout.click();
        driver.quit();
	}

}
