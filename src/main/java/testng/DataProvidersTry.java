package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersTry {
	
public	WebDriver driver;

	@DataProvider
	public Object demo()
	{
		
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="hero";
		obj[0][1]="heroine234567890";
		
		obj[1][0]="admin";
		obj[1][1]="manager";
		
		return obj;
		}
	
	
	
	@Test(dataProvider = "demo") //give method name of DataProvider
	public void Actitime(String username,String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();      //NUllpointerException this.driver=null if we dont give
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Login ']")).click();
        
        Thread.sleep(6000);
        
        driver.close();
	
	
	
	
	
	
	
	}
	

}
