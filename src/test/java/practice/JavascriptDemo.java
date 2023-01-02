package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
		//highlighting element by drawing border to any desired element
		WebElement e=	driver.findElement(By.xpath("//i[@aria-label='Instagram']"));
		JavaScriptUtil.DrawBorder(e, driver);
		
		JavaScriptUtil.ScrollPageDownByJS(driver);
		Thread.sleep(2000);
		JavaScriptUtil.ScrollPageUpByJS(driver);
		
		
		
		//performing click action
//		WebElement f=	driver.findElement(By.className("_aa5q"));
//		JavaScriptUtil.ClickElementByJS(f, driver);
//		JavaScriptUtil.RefreshBrowserByJS(f, driver);
		
		
   
		
		
	
		 
	}

}
