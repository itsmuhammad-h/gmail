package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingTextInsideDisabledtxtfieldUsingJavaScriptExecutor {

	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.instagram.com");
	//	driver.navigate().back();
	//	driver.navigate().forward();

		
		
WebElement ele=	driver.findElement(By.name("username"));

//both sendkeys & clear method are working good...
JavaScriptUtil.sendkeysByJS(driver, ele);
Thread.sleep(2000);
JavaScriptUtil.clearByJS(driver, ele);
		


//driver.navigate().refresh();
	}
}
