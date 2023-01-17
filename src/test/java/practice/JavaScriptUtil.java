package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {


	public static void DrawBorder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}

	
	
	public static void ClickElementByJS(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
	}


	
	public static void RefreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
	}


	public static void ScrollPageDownByJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void ScrollPageUpByJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
	}
	
	public static void ScrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element );
	
	
	}
	
	public static void sendkeysByJS(WebDriver driver,WebElement element)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//find the xpath of element and pass it in element place
//enter the text inside value ='' here we cannot enter text from called class here we shud enter txt
		js.executeScript("arguments[0].value='*****hello world*****';", element);
		
		
	}
	
	
	
	
    
	
		public static void clearByJS(WebDriver driver,WebElement element)
		{
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//find the xpath of element and pass it in element place
	
			js.executeScript("arguments[0].value='';", element);
			
			
		}

	
	}
