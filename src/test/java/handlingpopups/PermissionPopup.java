package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromiumdriver().setup();
		
	//put the browser launching statement after disabling notification statment and add option in parameter of WebDriver driver=new ChromeDriver(option);
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.justdial.com/");
		
		
	}

}
