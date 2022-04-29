package TasesCases;

import static org.junit.Assert.assertEquals;

import BaseClass.Baseclass;
import Pages.Homepage;
import Pages.Loginpage;
import Pages.Cart;

public class TC5_Add_multiple_products extends Baseclass{
	
	public static void main(String[] args) throws InterruptedException {
		Baseclass.setupApp();

		//Login page object
		Loginpage loginpage = new Loginpage(driver);
		//Home page object
		Homepage homepage = new Homepage(driver);
		//
		Cart cart = new Cart(driver);
		
		//Enter the credentials
		loginpage.enterCredentials("standard_user", "secret_sauce");
		
		//click login after 
		loginpage.clickLogin();
				
		//click on add product
		homepage.clickAddSauceLabsOnesie();
		
		//validate the button changed to REMOVE text
		assertEquals("REMOVE", homepage.validateButtonTitle());
		
		//click on add product
		homepage.clickAddSauceLabsBackpack();
		
		//validate the button changed to REMOVE text
		assertEquals("REMOVE", homepage.validateButtonTitleBackpack());
				
		//click on add product
		homepage.clickAddSauceLabsBikeLight();
		
		//validate the button changed to REMOVE text
		assertEquals("REMOVE", homepage.validateButtonTitleBikeLight());
		
		//click on cart to see the product
		homepage.clickOnCart();
		
		//Validate if the product is in the shopping cart
		assertEquals("Sauce Labs Onesie", cart.ValidateProductsInCartLabsOnesie());
		
		//Validate if the product is in the shopping cart
		assertEquals("Sauce Labs Backpack", cart.ValidateProductsInCartBackpack());
	
		//Validate if the product is in the shopping cart
		assertEquals("Sauce Labs Bike Light", cart.ValidateProductsInCartBikeLight());
		
		//close chrome
		Baseclass.closeChrome();
	}
	
}
