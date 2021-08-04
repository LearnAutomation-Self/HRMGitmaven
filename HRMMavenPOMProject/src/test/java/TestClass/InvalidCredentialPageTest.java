package TestClass;

import CommonFunctions.BaseClass;
import PagesObject.InvalidCredentialPage;
import org.testng.annotations.Test;

public class InvalidCredentialPageTest extends BaseClass {
	
	
	InvalidCredentialPage InvalidCredentialPage1;
	
	@Test
	public void CorrectTest() throws InterruptedException
	{
		InvalidCredentialPage1 = loginPage.login("Admin", "admin123");
	InvalidCredentialPage1.InvalidPassword();
	
	}
	
	@Test
	public void invdTest() throws InterruptedException
	{
		InvalidCredentialPage1 = loginPage.login("Admiin", "admin123");
	    InvalidCredentialPage1.InvalidPassword();
	
	}
	
}
