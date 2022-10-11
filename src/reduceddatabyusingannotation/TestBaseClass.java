package reduceddatabyusingannotation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PomClass.LoginPagePomClass;
import PomClass.LogoutPomClass;
import PomClass.ScreenshotPomClass;

public class TestBaseClass 
{
	 WebDriver driver;
	  @Parameters("browserName")
	   @BeforeClass
	   public void BeforeClassMethod(String browserName) 
	   {
		  if(browserName.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver",
						"D:\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
			  driver=new ChromeDriver();
		  }
		  else
		  {
			  System.setProperty("webdriver.gecko.driver",
						"D:\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			  driver=new FirefoxDriver();  
		  }
		  
			System.out.println("browser is opened");
			
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("SauceDemo url is opened");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   }
	   
	   @BeforeMethod
	   public void setUp() throws IOException
	   {
			LoginPagePomClass x=new LoginPagePomClass(driver);
			
			x.sendusername();
			System.out.println("username is entered");
			
			x.sendpassword();
			System.out.println("password is entered");
			
//			x.clickonloginbutton();
			x.mouseactiononlogin();
			System.out.println("click on login button");
			
//			homepage
//			ScreenshotPomClass.screenshot(driver, "HomPage");
	   }
	   
	   @AfterMethod
	   public void tearDown()
	   {
	   LogoutPomClass y=new LogoutPomClass(driver);
		
		y.clickmenubutton();
		System.out.println("clicked on menu button");
		
		y.clickonlogoutbuttom();
		System.out.println("clicked on logout button");
		
//		loginpage screenshot
//		ScreenshotPomClass.screenshot(driver, "loginPage");
	   
	   }
	   
	   
	   
	   @AfterClass
	   public void AfterClassMethod() 
	   {
			driver.quit();
			System.out.println("browser is closed");
			
	   }

}
