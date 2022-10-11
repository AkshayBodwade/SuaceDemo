package reduceddatabyusingannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

import PomClass.HomPagePomClass;

public class TC04_VerifyAllTestCases extends TestBaseClass
{
	 @Test
	   public void verifyLoginFunctionality()
	   {
		   
			System.out.println("apply the validation");
			
			String expectedTitle=driver.getTitle();
			
			String actualtitle="Swag Labs";
			
			Assert.assertEquals(actualtitle, expectedTitle);
			
	   }
	 
	 @Test
		public void verifyLogoutFunctionality() 
		{
				String expectedtitle="Swag Labs";
				
				String actualtitle=driver.getTitle();
				
				Assert.assertEquals(actualtitle, expectedtitle);
				
		}
	 
	 @Test
		public void verifyAddToCartFunctionality()
		{
			HomPagePomClass y=new HomPagePomClass(driver);
			y.clickonbagbutton();
		    System.out.println("bag product will get selected");
	   
//			Add Allproducts
			y.clickallproducts();
			System.out.println("All products will get selected");
			
			String expectedproduct="6";
			
			String actualproduct=y.gettextfromaddtocart();
			
			System.out.println("apply the validation");
			
			Assert.assertEquals(actualproduct, expectedproduct);
	   }
}
