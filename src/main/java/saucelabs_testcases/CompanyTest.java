package saucelabs_testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Company;

public class CompanyTest {
	
	@Test
	public void checkSol() throws InterruptedException {
		//launch browser
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		
		//created page object using page factory
		Company con = PageFactory.initElements(driver, Company.class);
		//call the method
		con.checkSolutions();
		Thread.sleep(1000);
		driver.quit();

	}


}
