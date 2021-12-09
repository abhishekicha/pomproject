package saucelabs_testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Pricing;
import saucelabs_Pages.SolutionsLogin;

public class PricingTest {
	
	
	@Test
	public void checkSol() throws InterruptedException {
		//launch browser
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		
		//created page object using page factory
		Pricing con = PageFactory.initElements(driver, Pricing.class);
		//call the method
		con.checkSolutions();
		Thread.sleep(10000);

		//created page object using page factory
		SolutionsLogin login_page = PageFactory.initElements(driver, SolutionsLogin.class);
		//call the method
		login_page.login_to_saucedemo("abbypra", "Avi@1994");
		driver.quit();

	}

}
