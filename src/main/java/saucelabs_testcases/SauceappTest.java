package saucelabs_testcases;


	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import saucelabs_Pages.SauceApp;
	import saucelabs_Pages.LoginPage;

	public class SauceappTest {

		
		@Test
		public void checkSauce() throws InterruptedException {
			//launch browser
			WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://saucelabs.com/");
			
			//created page object using page factory
			LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
			//call the method
			login_page.login_to_saucedemo("abbypra", "Avi@1994");
			
			SauceApp automated = PageFactory.initElements(driver, SauceApp.class);
			automated.checkFunctions();
		}

	}


