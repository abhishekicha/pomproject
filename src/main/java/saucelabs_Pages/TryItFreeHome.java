package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryItFreeHome {

		WebDriver driver;
		public TryItFreeHome(WebDriver kdriver) {
			this.driver= kdriver;
		}
		
		@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']") 	
		WebElement Ok;
		@FindBy(xpath="(//a[@class='button is-rounded is-primary'])[1]") 	
		WebElement TryIt;
		@FindBy(xpath="//a[text()='Sign in']") 	
		WebElement Signin;
		
		
		
		public void checkTryHome() throws InterruptedException {
			
			Thread.sleep(5000);
			Ok.click();
			TryIt.click();
			Thread.sleep(7000);
			Signin.click();
			
		}
	}



