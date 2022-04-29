package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Variables
	public By title = By.xpath("//span");
	
	//products variables
	public By addSauceLabsOnesie = By.name("add-to-cart-sauce-labs-onesie");
	public By removeSauceLabsOnesie = By.name("remove-sauce-labs-onesie");
	public By shoppingCart = By.className("shopping_cart_link");
	public By leftMenu = By.cssSelector(".bm-burger-button");
	public By logOutClick = By.xpath("//*[@id=\"logout_sidebar_link\"]");
	public By addSauceLabsBackpack = By.name("add-to-cart-sauce-labs-backpack");
	public By removeSuceLabsBackpack = By.name("remove-sauce-labs-backpack");
	public By addSauceLabsBikeLight = By.name("add-to-cart-sauce-labs-bike-light");
	public By removeSauceLabsBikeLight= By.name("remove-sauce-labs-bike-light");
	//Validate if are in the home page after login
	public String validateTitle() {
		String currenttitle = driver.findElement(title).getText();
		return currenttitle;
		
	}
	
	//Click on add Sauce labs onesie product
	public void clickAddSauceLabsOnesie() {
		driver.findElement(addSauceLabsOnesie).click();
		
	}
	
	//Click on add Sauce labs backpack
	public void clickAddSauceLabsBackpack() {
		driver.findElement(addSauceLabsBackpack).click();
			
	}
	
	//Click on add Sauce labs bike light
		public void clickAddSauceLabsBikeLight() {
			driver.findElement(addSauceLabsBikeLight).click();
				
	}
	
	//Validate if the title of the button changed after add the product in the cart
	public String validateButtonTitle() throws InterruptedException {
		Thread.sleep(1000);
		String buttontitle = driver.findElement(removeSauceLabsOnesie).getText();
		return buttontitle;
		
	}
	
	//Validate if the title of the button changed after add the product in the cart
	public String validateButtonTitleBackpack() throws InterruptedException {
		Thread.sleep(1000);
		String buttontitle = driver.findElement(removeSuceLabsBackpack).getText();
		return buttontitle;
	}
	
	//Validate if the title of the button changed after add the product in the cart
	public String validateButtonTitleBikeLight() throws InterruptedException {
		Thread.sleep(1000);
		String buttontitle = driver.findElement(removeSauceLabsBikeLight).getText();
		return buttontitle;
	}
	
	//Click on the cart
	public void clickOnCart() {
		driver.findElement(shoppingCart).click();
			
	}
	
	//click on left menu
	public void leftMenu() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(leftMenu).click();
			
	}

	//click on log out
	public void logOut() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(logOutClick).click();
			
	}
	
}
