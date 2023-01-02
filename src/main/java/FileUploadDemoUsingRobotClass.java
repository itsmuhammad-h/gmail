import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemoUsingRobotClass {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub

		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		
	WebElement e=	driver.findElement(By.xpath("//input[@id='file-upload']"));
	//using javascriptExecutor to perform click action on button of select file to upload
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",e);
		
		StringSelection s=new StringSelection("C:\\Users\\Muhammad\\Downloads\\menu (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Robot r=new Robot();
		//control+v press
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		//control+v release
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//tab 2 times to reach open then enter ......thts it uploaded 
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
		//done k                                                       
		
		
	}

}
