package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextofallLinksUSingFindElements {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	List<WebElement> links=	 driver.findElements(By.xpath("//a"));
		
      int  count=links.size();
      System.out.println(count);
      
      
      for(WebElement e :links )
      {
    String text= e.getText();
    System.out.println(text);    
    
      }
		
	}

  }