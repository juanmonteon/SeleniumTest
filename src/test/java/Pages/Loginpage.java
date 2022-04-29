package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Variables
	public By username = By.name("user-name");
	public By password = By.name("password");
	public By loginBtn = By.name("login-button");
	public By errorMessageLogin = By.xpath("//h3");
	
	//Enter the credentials
	public void enterCredentials (String usrname, String pass) {
		driver.findElement(username).sendKeys(usrname);
		driver.findElement(password).sendKeys(pass);
	}
	
	//Click login after enter the credencials
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	
	//Validate message when you type invalid users
	public String invalidadLogin() {
		String currenttitle = driver.findElement(errorMessageLogin).getText();
		return currenttitle;
	}

}
