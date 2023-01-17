package datadriventesting;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	       @DataProvider
           public  Object getData()throws Throwable
            {
			Object[][] obj = new Object[4][2];
			obj[0][0] = "1234777772";
			obj[0][1] = "1234566565";

			obj[1][0] = "admin";
			obj[1][1] = "manager";

			obj[2][0] = "qaz123$%^^";
		    obj[2][1] = "2354FDF@#Z#$";
		    
		    obj[3][0]="helllo";
		    obj[3][1]="hwru";
		    
		    return obj;
		}

		@Test(dataProvider ="getData")
		public void tc1(String username,String password) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	//here im not hardcoding the data im passing it as variable inside parameter as username,password
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
		//	Thread.sleep(1000);
			driver.close();
		
		}

	}


