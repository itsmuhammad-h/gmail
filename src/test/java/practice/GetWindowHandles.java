package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		
		
	String parent=	driver.getWindowHandle();
		System.out.println( "parent window :"+parent);
		
		
Set<String>	child=	driver.getWindowHandles();
System.out.println(" window ids :"+child);

for(String handles:child)
{
String title=	driver.switchTo().window(handles).getTitle();
System.out.println(title);


if(!handles.equals(parent))
{
	driver.switchTo().window(parent);
}


if(parent.equals(parent))
{
	driver.switchTo().window(handles);
}










	
}
		
		
	}

}
