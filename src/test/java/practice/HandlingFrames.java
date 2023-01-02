package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

WebDriverManager.chromiumdriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Frames.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//nested frame 
driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
 WebElement ele=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
driver.switchTo().frame(ele);
 WebElement ele1=driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
driver.switchTo().frame(ele1);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");


//need to get out of frame so tht i can go to single frame  by using defaultContent()

driver.switchTo().defaultContent();
//single frame

driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();

 WebElement e=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
 driver.switchTo().frame(e);
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bruh u r bad guy ");
		
	}

}
