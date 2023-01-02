package handlingpopups;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAndConfirmationPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromiumdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	//simple Alert
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
    Thread.sleep(2000);
    Alert a=driver.switchTo().alert();
    String text=   a.getText();
    System.out.println(text);
    a.accept();
	
	//confirmation alert
    
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
    Thread.sleep(2000);
   Alert b= driver.switchTo().alert();
   String text1=b.getText();
   System.out.println(text1);
	b.dismiss();
	
	//driver.close();
	
	
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
    Thread.sleep(2000);
     Alert c=	driver.switchTo().alert();
	
	String text3=c.getText();
	System.out.println(text3);
	c.sendKeys("hello assalamu alaikum");
	c.accept();
	
	//basic authentication
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
