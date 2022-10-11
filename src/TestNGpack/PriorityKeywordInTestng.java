package TestNGpack;

import org.testng.annotations.Test;

public class PriorityKeywordInTestng 
{
     @Test(priority=2)
     public void testA()
     {
    	 System.out.println("TestA");
     }
     
//     it will call first priority method
     @Test(priority=1)
      public void testB()
    	 {
    		 System.out.println("TestB");
    	 }
     
}
