package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFileDemo {

	

    public static void getdata() throws IOException
    {
		
		FileInputStream fis=new FileInputStream("./data.properties");
	
		Properties pdata=new Properties();	
        pdata.load(fis);
        WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get(pdata.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(pdata.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(pdata.getProperty("password"));
		
		
	
	
	}

}
