package saucelabs_testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.SolutionsLogin;
import saucelabs_Pages.TryItFree;

public class TryItFreeTest {
	
 
	@Test
	public void checkSol() throws InterruptedException {
		//launch browser
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		
		//created page object using page factory
		TryItFree con = PageFactory.initElements(driver, TryItFree.class);
		//call the method
		con.checkSolutions();
		Thread.sleep(7000);
		SolutionsLogin login = PageFactory.initElements(driver, SolutionsLogin.class);
		login.login_to_saucedemo("abbypra", "Avi@1994");
		driver.quit();

	}

}
