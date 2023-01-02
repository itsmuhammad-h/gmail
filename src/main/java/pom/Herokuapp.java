package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herokuapp {
	
	@FindBy(name="username") private WebElement usernametb;
	
	
	@FindBy(name="password") private WebElement passwordtb;
	
	@FindBy(xpath="//i[@class='fa fa-2x fa-sign-in']") private WebElement loginbtn;
	
	
   public Herokuapp(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }

	public void username(String name)
	{
		usernametb.sendKeys(name);
	}
	public void password(String pass)
	{
		passwordtb.sendKeys(pass);
		
	}
	public void login()
	{
		loginbtn.click();
	}
	
	

}
