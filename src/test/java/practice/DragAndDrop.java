package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

@Test
	public void simple() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/category.php?category=testing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	

	
	  WebElement a=	driver.findElement(By.xpath("//div[@class='box-body prod-body']//img[@id='Selenium Training']"));
	  WebElement b=	driver.findElement(By.xpath("//div[@class='col-sm-3']//fieldset//div[@id='cartArea']"));
	//  WebElement c=driver.findElement(By.xpath(null)); 
	  
	  
//	 Point loc = b.getLocation();
  //   int x = loc.getX();
//     int y = loc.getY();
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
	
		//js.executeScript("window.scrollBy("+x+","+y+")");
		//	js.executeScript("arguments[0].scrollIntoView();", b );
		js.executeScript("window.scrollBy(0,210)");
		
		Actions act=new Actions(driver);
		act.dragAndDrop(a,b).perform();
	//	act.clickAndHold(a);
	//	js.executeScript("window.scrollBy(0,220)");
	//	act.release(c).build().perform();
	     Thread.sleep(5000);


	//	js.executeScript("arguments[0].scrollIntoView();",b);
	      
	}



}
