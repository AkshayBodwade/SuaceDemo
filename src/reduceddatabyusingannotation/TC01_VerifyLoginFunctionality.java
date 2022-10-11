package reduceddatabyusingannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	 @Test
	   public void verifyLoginFunctionality()
	   {
		   
			System.out.println("apply the validation");
			
			String expectedTitle=driver.getTitle();
			
			String actualtitle="Swag Labs";
			
		Assert.assertEquals(actualtitle, expectedTitle);
			
	   }
}
