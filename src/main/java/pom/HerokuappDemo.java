package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerokuappDemo {

 public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	String url=	driver.getCurrentUrl();
	System.out.println("url :"+url);
	
	String title=	driver.getTitle();
	System.out.println("title :"+title);
	
	if(title.equals("The Internet"))
	{
		System.out.println("pass : login page is displayed ");
	}
	else
	{
		System.out.println("Fail : login is not displayed");
	}
	
		Herokuapp obj=new Herokuapp(driver);
		obj.username("tomsmith");
		obj.password("SuperSecretPassword!");
		obj.login();
		
	}

}
