package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {

	
@FindBy(name="email")  private WebElement usernametb;
	
@FindBy(name="password") 	private WebElement passwordtb;

@FindBy(id="last")   private WebElement loginbutton;


public Skillrary(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	
	public void username(String name)
	{
		usernametb.sendKeys(name);
	}
	public void password(String pass)
	{
		passwordtb.sendKeys(pass);
	}
	
	public void loginbutton()
	{
		loginbutton.click();
	}

}
