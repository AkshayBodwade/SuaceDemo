package TestNGpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG5 
{
	@BeforeMethod
	public void setUp()
	{
		System.out.println("browser-url-login Activity");
	}
    
	@Test
	public void verifyLogin()
	{
		System.out.println("validation -verifylogin");
	}
	
	@Test
	public void verifylogout()
	{
		System.out.println("validation-verifylogout");
	}
	
	@Test
	public void verifybagproduct()
	{
		System.out.println("validation-verifyBagproduct");
	}
	
	@AfterMethod
	public void tearDown() 
	{
		System.out.println("browser close");
	}
}
