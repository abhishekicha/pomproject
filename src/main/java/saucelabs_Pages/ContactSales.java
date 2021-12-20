package saucelabs_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactSales {
	
	WebDriver driver;
	public ContactSales(WebDriver kdriver) {
		this.driver= kdriver;
	}
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']") 	
	WebElement Ok;
	@FindBy(xpath="(//a[@class='button is-rounded is-secondary'])[3]") 	
	WebElement Contact;
	@FindBy(xpath="//a[text()='Sign in']") 	
	WebElement Signin;
	
	public void checkContactSales() throws InterruptedException {
		
		Thread.sleep(5000);
		Ok.click();
		Contact.click();
		Thread.sleep(7000);
		
	}

}
