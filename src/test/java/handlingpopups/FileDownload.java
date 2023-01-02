package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//sendkeys will work only when type="file" otherwise we have to go with Robot class methods 
		//clicking on chooose file button and uploading the file
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Muhammad\\Downloads\\menu (1).pdf");
		
		//clicking on upload button
		driver.findElement(By.id("file-submit")).click();
	
		
		
		//
	
	}

}
