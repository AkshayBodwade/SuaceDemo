package reduceddatabyusingannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogoutFunctionality() 
	{
			String expectedtitle="Swag Labs";
			
			String actualtitle=driver.getTitle();
			
			Assert.assertEquals(actualtitle, expectedtitle);
	}
}
