package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindowsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//clicking on a link wch opens a new tab
		driver.findElement(By.className("_aa5q")).click();
	        //get window handle()
	String parent	=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child=	driver.getWindowHandles();
		System.out.println(child);
		
		for(String handles:child)
		{
		String title=driver.switchTo().window(handles).getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		if(!handles.equals(parent))
		{
			driver.switchTo().window(parent);
			
		}
		
		Thread.sleep(2000);
		if(parent.equals(parent))
		{
			driver.switchTo().window(handles);
		}
		}
		
		
	
	}

}
