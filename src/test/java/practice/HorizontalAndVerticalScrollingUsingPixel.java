package practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HorizontalAndVerticalScrollingUsingPixel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// vertical scroll down
		js.executeScript("window.scrollBy(0,1000)", ""); //LEAVE THE EXACT SAME SPACE OTHRWISE IT WONT WORK
		Thread.sleep(2000);
		
		// vertical scrolling up
		js.executeScript("window.scrollBy(0,-1000)", "");
		
		
		//horizontal scroll to the right side
		js.executeScript("window.scrollBy(1000,0)", "");
		
		//horizontal scroll to the left side
		js.executeScript("window.scrollBy(-1000,0)", "");
		
		js.executeScript("window.scrollBy(1000,0)");
	}

}
