package TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClass.LoginPagePomClass;
import PomClass.ScreenshotPomClass;

public class LoginFunctionality_testclass 
{
	   WebDriver driver;
	   @BeforeMethod
	   public void setUp() throws IOException 
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
			
//			x.clickonloginbutton();
			x.mouseactiononlogin();
			System.out.println("click on login button");
			
//			homepage
			ScreenshotPomClass.screenshot(driver, "HomPage");
	   }
	   @Test
	   public void verifyLoginFunctionality()
	   {
		   
			System.out.println("apply the validation");
			
			String expectedTitle=driver.getTitle();
			
			String actualtitle="Swag Labs";
			
			if(actualtitle.equals(expectedTitle))
			{
				System.out.println("Login finctionality test case is passed");
			}
			else
			{
				System.out.println("Login functionality test case is failed");
			}
			
	   }
	   @AfterMethod
	   public void tearDown() 
	   {
			driver.close();
			System.out.println("browser is closed");
			
	   }
			
			
			
			
			
			
	}


