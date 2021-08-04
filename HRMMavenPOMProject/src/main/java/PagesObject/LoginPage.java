package PagesObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunctions.BaseClass;
public class LoginPage extends BaseClass {
	
	@FindBy(id="txtUsername")
	WebElement userName; 
		
	
    @FindBy(id="txtPassword")
    WebElement password;
    
    @FindBy(name = "Submit")
    WebElement submit;
    
public LoginPage(WebDriver driver)
    {
    	//WebElement username = driver.findElement(By.id("txtUsername"));
    	//username.sendKeys("Admin");
    	//WebElement pawd = driver.findElement(By.id("txtPassword"));
    	//pawd.sendKeys("admin123");
    	//driver.findElement(By.name("Submit")).click();
    	//************************************************************
	   // this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
    }
    
    
   /* public HomePage login()
    {
    	userName.sendKeys("admin");
    	password.sendKeys("admin123");
    	submit.click();
    	return new HomePage();
    } */
    
   /* public void login(String Username, String Password) throws InterruptedException
    {
    	
    	
    	userName.sendKeys(Username);
    	Thread.sleep(3000);
    	password.sendKeys(Password);
    	Thread.sleep(3000);
    	submit.click();
    	Thread.sleep(3000);
    	
    	//return new InvalidCredentialPage(driver);
    	    } */

    
    public InvalidCredentialPage login(String Username, String Password) throws InterruptedException
    {
    	
    	
    	userName.sendKeys(Username);
    	Thread.sleep(3000);
    	password.sendKeys(Password);
    	Thread.sleep(3000);
    	submit.click();
    	Thread.sleep(3000);
    	
    	return new InvalidCredentialPage(driver);
    	    }

    
    public InvalidCredentialPage wrongPassword(String Username, String Password) throws InterruptedException
    {
    	
    	
    	userName.sendKeys(Username);
    	Thread.sleep(3000);
    	password.sendKeys(Password);
    	Thread.sleep(3000);
    	submit.click();
    	Thread.sleep(3000);
    	
    	return new InvalidCredentialPage(driver);
    	    }

}
