package TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClass.LoginPagePomClass;
import PomClass.LogoutPomClass;
import PomClass.ScreenshotPomClass;

public class LogoutFunctinality_testclass 
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
			
			x.clickonloginbutton();
			System.out.println("clicked on login button");
			
//			homepage screenshot
			ScreenshotPomClass.screenshot(driver, "HomPage");
	 	
			LogoutPomClass y=new LogoutPomClass(driver);
			
			y.clickmenubutton();
			System.out.println("clicked on menu button");
			
			y.clickonlogoutbuttom();
			System.out.println("clicked on logout button");
			
//			loginpage screenshot
			ScreenshotPomClass.screenshot(driver, "loginPage");
			}
			
	@Test
	public void verifyLogoutFunctionality() 
	{
			String expectedtitle="Swag Labs";
			
			String actualtitle=driver.getTitle();
			
			if(expectedtitle.equals(actualtitle))
			{
				System.out.println("logout functionality test case is passed");
			}
			else
			{
				System.out.println("logout functionality test case is failed");
			}
	}
	@AfterMethod
	public void teardown(){
		
		
			driver.close();
			System.out.println("browser is closed");
			
			
			
			
			
			
			
			
			
			
	}

}
