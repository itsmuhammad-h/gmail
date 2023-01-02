import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseHoverActions {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
               
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	
		Actions act=new Actions(driver);
	WebElement e=	driver.findElement(By.xpath("//a[text()='COURSE']"));
	WebElement e1=	driver.findElement(By.xpath("//a[text()='Selenium Training']"));
	act.moveToElement(e).moveToElement(e1).click().perform();
	
	 WebElement e2=driver.findElement(By.xpath("//button[@id='add' and @type='button' and @class='btn btn-default btn-flat btn-lg']"));
	 act.doubleClick(e2).perform();
	 
	WebElement e3= driver.findElement(By.id("navbar-search-input"));
	
	act.contextClick(e3).perform();
	

	}

}
