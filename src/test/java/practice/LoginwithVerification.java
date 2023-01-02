package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginwithVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	
	    driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	    
	    //gettitle
	  String title=  driver.getTitle();
	    
	    System.out.println("title :"+title);
	
	
	    //get url 
	    
String url=	    driver.getCurrentUrl();
	System.out.println(url);
	
	
	//verification
	if(title.equals("The Internet"))
	{
		System.out.println("pass : page is displayed");
	}
	
	else
	{
		System.out.println("Fail : page is not displayed");
		
	}
	
	
	
	
	}

}
