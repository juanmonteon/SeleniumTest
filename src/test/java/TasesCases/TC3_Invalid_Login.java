package TasesCases;

import static org.junit.Assert.assertEquals;

import BaseClass.Baseclass;
import Pages.Loginpage;

public class TC3_Invalid_Login extends Baseclass{
	
	public static void main(String[] args) {
		Baseclass.setupApp();

		//Login page object
		Loginpage loginpage = new Loginpage(driver);
		
		//Click login button wp
		//welcomepage.clickLoginwp();
		
		//Enter the credentials
		loginpage.enterCredentials("standard_usertest", "secret_sauce");
		
		//click login after 
		loginpage.clickLogin();
		
		//validate you login successfully
		assertEquals("Epic sadface: Username and password do not match any user in this service", loginpage.invalidadLogin());
		
		//close chrome
		Baseclass.closeChrome();
	}
	
}
