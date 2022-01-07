package saucelabs_Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usage {

	WebDriver driver;
	public Usage(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//a[@href='/tunnels']") 	
	WebElement Tunnels;
	
//	@FindBy(xpath="//a[@href='/tunnkels']") 	
//	WebElement Tunnels;
	
	@FindBy(xpath="//div[text()='Usage']") 	
	WebElement Usage;
	@FindBy(xpath="//span[@class='SidebarLogoPanelV2__logo__2PUWQ']") 	
	WebElement logo;
	@FindBy(xpath="//button[@class='Buttons__btn__3yodQ SidebarToggleV2__wrapper__2pC4J Buttons__btn-action-inv__Np8dr']/*") 	
	WebElement nav;
	@FindBy(xpath="//div[@class='beamerAnnouncementSnippetClose']") WebElement alerts;
	
	public void checkUsage() throws  InterruptedException {
		Thread.sleep(30000);
		
		try {
			alerts.click();
		} catch (Exception ignored) {
		    //do what you need here if you were expecting
		    //the element wouldn't exist
			System.out.println(ignored);
		}
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Tunnels)).click();
		Usage.click();
		Thread.sleep(5000);
		logo.click();
		Thread.sleep(5000);
		nav.click();
		Thread.sleep(5000);
	}
	

	
	
}
