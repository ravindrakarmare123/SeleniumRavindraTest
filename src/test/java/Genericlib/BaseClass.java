package Genericlib;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	
public WebDriver driver;
	
	
	
	@BeforeClass
	public void openBrowser()
	{
		driver= new ChromeDriver();
		
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}
