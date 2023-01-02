package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
 //we are searching java tutorials in google and finding how many auto suggests are showing we got 10 results
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']/li"));//li[@class='sbct']//div[@role='option']//div[1]/span
     System.out.println(" size (or)count of autosuggestions:"+list.size()); //ul[@role='listbox']/li
     
     for(WebElement listitem:list)
     {
    	 if( listitem.getText().contains("selenium dev"))
    	 {
            listitem.click();
    	 break;
    	 }
		
		 
	}

 }
}
