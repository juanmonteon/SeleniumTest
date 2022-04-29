package BaseClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass {
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setupApp() {
		System.getProperty("WebDriver.gecko.driver","User/juanmonteon/eclipse-workspace/Automationinterview/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterClass
	public static void closeChrome() {
		driver.quit();
	}
}
