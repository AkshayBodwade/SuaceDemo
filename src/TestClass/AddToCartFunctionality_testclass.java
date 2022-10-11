package TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClass.HomPagePomClass;
import PomClass.LoginPagePomClass;

public class AddToCartFunctionality_testclass 
{
	   WebDriver driver;
	   @BeforeMethod
	   public void setUp()
	   {
		   System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
			
		    driver=new ChromeDriver();
			System.out.println("browser is opened");
			
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("SauceDemo url is opened");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			LoginPagePomClass x=new LoginPagePomClass(driver);
			
			x.sendusername();
			System.out.println("username is entered");
			
			x.sendpassword();
			System.out.println("password is entered");
			
			x.clickonloginbutton();
			System.out.println("clicked on login button");
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
			
			if(expectedproduct.equals(actualproduct))
			{
				System.out.println("bag product add to cart test case is passed");
			}
			else
			{
				System.out.println("bag product add to cart test case is failed");
			}
	   }
//			Dropdown example
			
//			y.clickonfilter();
//			System.out.println("dropdown element selected");
//	   
//			System.out.println("apply validation");
//			
//			String actualtext=y.getactualtext();
//			
//			String giventext="Price (low to high)";
//			
//			if(actualtext.equals(giventext))
//			{
//				System.out.println("Filter test case is passed");
//			}
//			else
//			{
//				System.out.println("filter test case is failed");
//			}
			   
	    
			 @AfterMethod
			public void tearDown()
			{
			 
			driver.close();
			System.out.println("browser is closed");
			
			System.out.println("end of programe");
			
			}
			
			
			
			
	}


