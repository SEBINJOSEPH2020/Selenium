package seleniumproject2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public void SetUP()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\JAVA Sel Docs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
	}
	
	

}
