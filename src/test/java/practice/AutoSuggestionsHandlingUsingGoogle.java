package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionsHandlingUsingGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium dev");
		
	//now i want to find the list number of suggestions google is giving when i type or send selenium dev 
		
	//for finding more thn 1 WebElement we shud use findElements() abstract method of WebDriver (or) search context interface method
	                   
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbct']//div[@class='pcTkSc']//div[@class='wM6W7d']//span"));
		
    int count=	list.size();
     System.out.println(" count of list is : "+count);
	
	for(WebElement alllist:list)
	{
		if(alllist.getText().contains("selenium dev"))
		{
			alllist.click();
			break;
		}
		
	}
		
		
		
		
		
		
		
		
	}

}
