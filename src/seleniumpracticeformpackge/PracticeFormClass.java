package seleniumpracticeformpackge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

public class PracticeFormClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sebin Joseph\\Desktop\\JAVA Sel Docs\\chromedriver.exe");

		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		
		driver = new ChromeDriver(co);
			
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumframework.com/practiceform");
		//driver.manage().window().maximize();
		
		/*WebElement element;
		element = driver.findElement(By.xpath("//*[@id='button1']"));
				
		String window1 = driver.getWindowHandle();
		element.click();
		//driver.switchTo().window(window1);
		Thread.sleep(5000);*/
		
		WebElement element1;
		element1 = driver.findElement(By.xpath("//*[@id='alert']"));
		element1.click();
		
		Alert AlertBoxButton = driver.switchTo().alert();
		AlertBoxButton.accept();
				
		//driver.close();
		
		System.out.println("Completed");
	}

}
