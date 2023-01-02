package practice;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ScreenshotExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	String systemdate =new Date().toString().replace(":","_").replace("","_");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);

    File dst=new File("./screenshots/"+systemdate+".png");
	FileUtils.copyFile(src, dst);
	

	//driver.close is not working it throws socket exception it couldnt capture SS..its closing fast 
	//bruh always close the folder from 2 sides ./screenshots/  use forward slash both sides
	//bruh dont forget to refresh the screenshot folder 
	
	}
	}


