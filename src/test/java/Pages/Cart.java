package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;

	public Cart(WebDriver driver) {
		this.driver=driver;
	}
	
	//Variables
	public By productSauceLabsOnesie = By.xpath("//div[contains(text(),\"Sauce Labs Onesie\")]");
	public By productSauceBackpack = By.xpath("//div[contains(text(),\"Sauce Labs Backpack\")]");
	public By productSauceBikeLight = By.xpath("//div[contains(text(),\"Sauce Labs Bike Light\")]");
	
	//Validate if are in the home page after login
	public String ValidateProductsInCartLabsOnesie() throws InterruptedException {
		Thread.sleep(1000);
		String currentProductLabsOnesie = driver.findElement(productSauceLabsOnesie).getText();
		return currentProductLabsOnesie;
		
	}
	
	//Validate if are in the home page after login
	public String ValidateProductsInCartBackpack() throws InterruptedException {
		Thread.sleep(1000);
		String currentProductbackpack = driver.findElement(productSauceBackpack).getText();
		return currentProductbackpack;
			
	}
		
	//Validate if are in the home page after login
	public String ValidateProductsInCartBikeLight() throws InterruptedException {
		Thread.sleep(1000);
		String currentProductBikeLight = driver.findElement(productSauceBikeLight).getText();
		return currentProductBikeLight;
			
	}
	

}
