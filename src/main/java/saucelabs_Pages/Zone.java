package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zone {
	
	WebDriver driver;
	public Zone(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//div[text()='Data Center: ']/..") 	
	WebElement Zones;
	@FindBy(xpath="(//li[@class='DCMenuListV2__item__3_L13']//a/ancestor-or-self::div[@class='DCMenuListV2__container__xV3ff']//a[text()='US West 1'])[2]") 	
	WebElement ZonesSelect;
	
	public void checkUsage() throws InterruptedException {
		Thread.sleep(30000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Zones)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ZonesSelect)).click();
		driver.quit();
		
	}
	

}
