package TestNGpack;

import org.testng.annotations.Test;

public class TestNG9 
{
   @Test
   public void testA()
   {
	   System.out.println("testA");
   }
   
   @Test(timeOut=2000)
   public void testB() throws InterruptedException
   {
	   Thread.sleep(10000);
	   System.out.println("TestB");
   }
//   here we use timeout for putting condition 
//    TC if takes 2 sec run-->execution
//   else make the tc--> fail
}
