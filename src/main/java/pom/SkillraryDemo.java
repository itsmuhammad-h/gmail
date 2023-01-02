package pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillraryDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	   WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//geturl
	String url=	driver.getCurrentUrl();
	System.out.println( "url :"+url);
	
	//gettitle
	String title=driver.getTitle();
	System.out.println( "title :"+title);
	
	//verification
	if(title.equals("SkillRary Courses"))
	{
		System.out.println("pass : login page is displayed ");
	}
	else
	{
		System.out.println("fail : login page is not displayed ");
	}
	
	
  Skillrary obj=new Skillrary(driver);
  obj.username("admin");
  obj.password("admin");
  obj.loginbutton();
  
  
  //home f11 button for execution is not working 
  
  
	}

}
