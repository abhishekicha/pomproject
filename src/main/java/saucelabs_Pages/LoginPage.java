package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	@FindBy(xpath="//*[@id=\"headerMainNav\"]/div/nav/ul/li[3]/ul/li[2]/a/span") 	
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"idToken1\"]") 
WebElement Username;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"idToken2\"]")  WebElement Password;

	@FindBy(how=How.XPATH, using="//*[@id=\"loginButton_0\"]")  WebElement Login;
	
	
	public void login_to_saucedemo(String uid, String pas) throws InterruptedException {
		signin.click();
		Thread.sleep(7000);
		Username.sendKeys(uid);
		Password.sendKeys(pas);
		Login.click();


	}
	
	
}
