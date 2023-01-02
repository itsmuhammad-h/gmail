package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	public WebDriver driver;
	
	@DataProvider
	public Object getData()
	{
		Object[][] obj=new Object[3][2];
		   obj[0][0]="hero";
		   obj[0][1]="12234";
		
		   obj[1][0]="heroine";
		   obj[1][1]="1234567";
		   
		   obj[2][0]="admin";
		   obj[2][1]="manager";
		   
		
		return obj;
		
	}
		@Test(dataProvider = "getData")
	public void demoDataProvider(String username,String password) throws InterruptedException
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		    driver.findElement(By.xpath("//*[text()='Login ']")).click();
		    Thread.sleep(6000);
		    driver.close();
		    
	}
	}

