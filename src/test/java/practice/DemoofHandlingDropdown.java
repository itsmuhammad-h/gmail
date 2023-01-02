package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoofHandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Muhammad/Desktop/Training1/SingleDropdown.html");
		driver.manage().window().maximize();
	WebElement ele=	driver.findElement(By.xpath("//select[@id='Taj']"));
		 
	      Select sel=new Select(ele);
	 //     sel.selectByIndex(2);
	   //   Thread.sleep(2000);
	   //   sel.selectByValue("F");
	   //   Thread.sleep(2000);
	   //   sel.selectByVisibleText(" Tomato rice bath ");
	    //  Thread.sleep(2000);
	    //  sel.getFirstSelectedOption();
	      
	      
              List<WebElement> option=    sel.getOptions();
              
                       int count= option.size();
                       System.out.println(count);
                       ArrayList<String> list=new ArrayList<String>();   
                       
                       
                       for(WebElement text:option)
                       {
                       String	alltext= text.getText();
                        list.add(alltext);
                    
                       }
                       
                       Collections.sort(list);
                       for(String sortedtext:list)
                       {
                    	   System.out.println(sortedtext);
                       }
                       driver.close();
	}

}
