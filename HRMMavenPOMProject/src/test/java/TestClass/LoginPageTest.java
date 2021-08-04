package TestClass;

import org.testng.annotations.Test;

import CommonFunctions.BaseClass;
import PagesObject.InvalidCredentialPage;
  //import PagesObject.LoginPage;



public class LoginPageTest extends BaseClass {	
	
	//InvalidCredentialPage InvalidCredentialPage1;
	@Test
	public void LoginTest() throws InterruptedException
    {
		//*********************************
		//InvalidCredentialPage1=  
		loginPage.login("Admin", "admin123");
		//************************************
  
    } 
}
