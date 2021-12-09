package saucelabs_testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import saucelabs_Pages.Fun;
import saucelabs_Pages.LoginPage;

public class FuncionalityTest {
	@Test
	public void checkFunctions() throws InterruptedException {
	 
	//launch browser
			WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://saucelabs.com/");
			
			//created page object using page factory
			LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
			//call the method
			login_page.login_to_saucedemo("abbypra", "Avi@1994");
			Fun fun_page = PageFactory.initElements(driver, Fun.class);
			fun_page.checkFunctions();

	}
}
