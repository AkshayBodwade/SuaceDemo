package TestNGpack;

import org.testng.annotations.Test;

public class InvocationCountkeyword 
{
   @Test(invocationCount=5)
   public void testA()
   {
	   System.out.println("TestA");
   }
   
   @Test(priority=1,invocationCount=3)
   public void testB()
   {
	   System.out.println("TestB");
   }
   
   @Test(priority=0,invocationCount=2)
   public void testZ()
   {
	   System.out.println("TestZ");
   }
   
   @Test
   public void testC()
   {
	   System.out.println("TestC");
   }
   
   @Test(priority=-3,invocationCount=0)
   public void testD()
   {
	   System.out.println("TestD");
   }
   
   @Test(invocationCount=-1)
   public void testE()
   {
	   System.out.println("TestE");
   }
   
   
   
   
   
   
   
   
   
   
   
   
}
