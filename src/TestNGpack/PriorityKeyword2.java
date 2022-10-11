package TestNGpack;

import org.testng.annotations.Test;

public class PriorityKeyword2 
{
//	it will call second priority not set value
   @Test
   public void testA()
   {
	   System.out.println("TestA");
   }
   
   
   @Test(priority=1)
   public void testB()
   {
	   System.out.println("TestB");
   }
   
   @Test(priority=1)
   public void testC()
   {
	   System.out.println("TestC");
   }
   
   //then call 0 value
   @Test(priority=0)
   public void testD()
   {
	   System.out.println("TestD");
   }
   
//   first call negative priority value
   @Test(priority=-1)
   public void testE()
   {
	   System.out.println("TestE");
   }
   
}
