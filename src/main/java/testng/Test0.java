package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {

	
@Test(invocationCount = 1,priority = 1)	
public void calls()
{
	Reporter.log("calls",true);
}

@Test(invocationCount = 2,priority = 2)
public void settings() 
{
	Reporter.log("settings",true);
}

@Test(invocationCount =3,priority = 3)
public void chats() 
{
	Reporter.log("chats",true);
}
}
