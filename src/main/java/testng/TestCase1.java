package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	
	public WebDriver driver;
	
	
	

	@BeforeMethod
	public void openApp()
	{
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

	
	@Test
	public void forgotpassword()
	{
		driver.findElement(By.xpath("//*[text()='Forgotten account?']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("muhammad khan");
		driver.findElement(By.xpath("//*[@name='did_submit']")).click();
	String title = driver.getTitle();
	Reporter.log(title, true);
	
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	
	
	
	//hard assertions 
	// Assert.assertEquals(title, "Forgotten Password | Can't Log In | Facebook","verifying page title with actual vrs expected");
	
   //  driver.navigate().refresh();
	
	
     
     //SoftAssertions
	SoftAssert s=new SoftAssert();
	s.assertEquals(url, "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0","verifying page title with actual vrs expected");
	s.assertAll(); //it will cause an exception to be thrown coz in  softassert evn test case fails test block will get executed 
	
	}
	
	
	@AfterMethod
	public void closeApp() throws InterruptedException //delayed succesfully done
	{
		Thread.sleep(3000);
		driver.close();
	}
}
