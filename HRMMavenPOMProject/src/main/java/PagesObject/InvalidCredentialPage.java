package PagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunctions.BaseClass;



public class InvalidCredentialPage extends BaseClass{
	
	
@FindBy(id = "spanMessage")
WebElement invalidpassword;

public InvalidCredentialPage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
	
}

      public void CorrectPassword()
      {
    	 String txt  = invalidpassword.getText();
    	/* if(txt == "Invalid credentials")
    	 {
    		 String txt1 = "Paas";
    	 }*/
      }
      
      public void InvalidPassword()
      {
    	 String txt  = invalidpassword.getText();
    	/* if(txt == "Invalid credentials")
    	 {
    		 String txt1 = "Paas";
    	 }*/
      }
}
