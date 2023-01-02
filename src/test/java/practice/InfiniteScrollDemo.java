package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InfiniteScrollDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinite-scroll.com/demo/full-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
		
		 
		//infinite scroll 
		
		 JavaScriptUtil.ScrollPageDownByJS(driver);
	}

}
