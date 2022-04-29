package TasesCases;

import static org.junit.Assert.assertEquals;

import BaseClass.Baseclass;
import Pages.Homepage;
import Pages.Loginpage;
import Pages.Cart;

public class TC2_Add_products extends Baseclass{
	
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
		
		//validate you login successfully
		assertEquals("REMOVE", homepage.validateButtonTitle());
		
		//click on cart to see the product
		homepage.clickOnCart();
		
		//Validate if the product is in the shopping cart
		assertEquals("Sauce Labs Onesie", cart.ValidateProductsInCartLabsOnesie());
	
		//close chrome
		Baseclass.closeChrome();
	}
	
}
