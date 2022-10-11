package TestNGpack;

import org.testng.annotations.Test;

public class TestNG7 
{
   @Test(priority=3)
   public void testA()
   {
	   System.out.println("TestA");
   }
   
   @Test(priority=2, invocationCount=0)
   public void testB()
   {
	   System.out.println("TestB");
   }
   
   @Test(priority=1,enabled=false)
   public void testC()
   {
	   System.out.println("TestC");
   }
   
   
   
   
   
   
   
   
   
   
}
