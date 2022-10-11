package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePomClass 
{
//  1.driver declared
	WebDriver driver;
	Actions act;
//	2.element find
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
//	3.create a method as per action on element
//	 and add action in that method
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	public void clickonloginbutton()
	{
		loginButton.click();
	}
	
//	how to perform mouse action
	public void mouseactiononlogin()
	{
	    act=new Actions(driver);
		act.click(loginButton).perform();
	}
	
	
	public LoginPagePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
	}
	
	
	
	
	
	
}


