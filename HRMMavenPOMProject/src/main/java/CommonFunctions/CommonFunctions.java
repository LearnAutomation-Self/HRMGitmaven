package CommonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class CommonFunctions {
	static Properties properties = null;
	
	public Properties loadPropertyFile() throws IOException 
	{
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		 properties = new Properties();
		properties.load(fileinputstream);
		
		return properties;
	}
	
	
	
	@BeforeSuite
	public void launceBrowser() 
	{
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");	}
	
	
	@AfterSuite
	public void tearDown()
	{
		
	}

}
