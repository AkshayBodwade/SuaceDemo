package TestNGpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG8 
{
  @Test
  public void loginTest()
  {
	  System.out.println("loginTest");
//	  syntax to fail the testcase
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods= {"loginTest"})
  public void addToCartTest()
  {
	  System.out.println("addToCartTest");
  }
  
  @Test()
  public void loginTest1()
  {
	  System.out.println("loginTest");
//	  syntax to fail the tc
	  Assert.assertTrue(true);
	  Assert.assertTrue(false);
	  
	  Assert.assertFalse(false);
	  Assert.assertFalse(true);
  }
}
