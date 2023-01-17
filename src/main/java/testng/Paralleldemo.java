package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleldemo {

public 	WebDriver driver;
	@Parameters({"Boo"})
	@Test
	public void demo(String Browser)
	{
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else
		{
			driver=new FirefoxDriver();
			
		}
		
	}																		
	
	
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("Test1 execution "+Thread.currentThread().getId());
		
		driver.get("https://www.google.com/");
		//Thread.sleep(1000); //just to see execution
		
	}
	
		
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("Test2 execution "+Thread.currentThread().getId());
		
		driver.get("https://www.gmail.com");
		//Thread.sleep(1000); //just to see execution
		
	}
		
	
	
	
}
