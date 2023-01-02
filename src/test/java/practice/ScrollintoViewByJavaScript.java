package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollintoViewByJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
		
		
		//scrollIntoView demo
		

	WebElement z=driver.findElement(By.xpath("//img[@src='https://www.skillrary.com/assets/skillrary/images/app-android.png']"));
		 JavaScriptUtil.ScrollIntoView(driver, z);
		 
		 
		 
		 
		 
		
	}

}
