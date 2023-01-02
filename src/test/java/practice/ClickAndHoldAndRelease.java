package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHoldAndRelease {

	@Test
	public void clickAndHold()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

	

	
	  WebElement a=	driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	  WebElement b=	driver.findElement(By.id("trash"));
	  
	Point loc = b.getLocation();
	
	int x = loc.getX();
    int y=	loc.getY();
 Actions act=new Actions(driver);
 act.dragAndDropBy(a, x, y).perform();

 
// act.dragAndDrop(a,b).build().perform();
 
	}
	
	
	
}
