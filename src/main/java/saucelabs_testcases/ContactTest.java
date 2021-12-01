package saucelabs_testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Contact;


public class ContactTest {


	@Test
	public void checkSol() throws InterruptedException {
		//launch browser
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		
		//created page object using page factory
		Contact con = PageFactory.initElements(driver, Contact.class);
		//call the method
		con.checkSolutions();
		Thread.sleep(1000);
		driver.quit();

	}
	
}
