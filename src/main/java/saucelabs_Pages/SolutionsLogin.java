package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SolutionsLogin {
	
	WebDriver driver;
	public SolutionsLogin(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	@FindBy(xpath="//*[@id=\"idToken1\"]") 
	WebElement Username;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"idToken2\"]")  WebElement Password;
		@FindBy(how=How.XPATH, using="//*[@id=\"loginButton_0\"]")  WebElement Login;
		
		
		public void login_to_saucedemo(String uid, String pas) throws InterruptedException {
			Thread.sleep(15000);
			Username.sendKeys(uid);
			Password.sendKeys(pas);
			Login.click();


		
		}

}
