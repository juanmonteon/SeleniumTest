package TasesCases;

import BaseClass.Baseclass;
import Pages.Homepage;
import Pages.Loginpage;

public class TC4_LogOut extends Baseclass{
	
	public static void main(String[] args) throws InterruptedException {
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
		
		//click on left menu
		homepage.leftMenu();
		
		//click on log out
		homepage.logOut();
		
		//close chrome
		Baseclass.closeChrome();
	}
	
}
