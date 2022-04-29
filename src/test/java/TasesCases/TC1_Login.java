package TasesCases;

import static org.junit.Assert.assertEquals;

import BaseClass.Baseclass;
import Pages.Homepage;
import Pages.Loginpage;

public class TC1_Login extends Baseclass{
	
	public static void main(String[] args) {
		Baseclass.setupApp();

		//Login page object
		Loginpage loginpage = new Loginpage(driver);
		//Home page object
		Homepage homepage = new Homepage(driver);
		
		//Click login button wp
		//welcomepage.clickLoginwp();
		
		//Enter the credentials
		loginpage.enterCredentials("standard_user", "secret_sauce");
		
		//click login after 
		loginpage.clickLogin();
		
		//validate you login successfully
		assertEquals("PRODUCTS", homepage.validateTitle());
		
		//close chrome
		Baseclass.closeChrome();
	}
	
}
