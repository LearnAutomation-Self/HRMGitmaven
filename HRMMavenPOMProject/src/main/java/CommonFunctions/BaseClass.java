package CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PagesObject.LoginPage;
 
public class BaseClass {

	public WebDriver driver;
	public LoginPage loginPage;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\2021SelProj\\Java\\JulyPOMSelenium2021\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/* WebElement username = driver.findElement(By.id("txtUsername"));
    	username.sendKeys("Admin");
    	WebElement pawd = driver.findElement(By.id("txtPassword"));
    	pawd.sendKeys("admin123");
    	driver.findElement(By.name("Submit")).click(); */
    	
    	
		loginPage = new LoginPage(driver);
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
	}
}
