package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;

	public static  WebDriver startBrowser(String browserName, String url) {
		if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
}
