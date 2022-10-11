package TestNGpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 
{
	//only annotations sequence will matter in TestNG
		//no the code sequence
		//1.@BeforeMethod
		//2.@Test
		//3.@AfterMethod

	@BeforeMethod
	public void setUp()
	{
		System.out.println("brwser-url-login_activity");
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		System.out.println("Validation->TC->pass/fail");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("brwsr close");
	}

	
}
