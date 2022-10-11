package PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomPagePomClass 
{
	private WebDriver driver;
    Select s;
    @FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement bagbutton;
    public void clickonbagbutton()
    {
    	bagbutton.click();
    }
    
//   multiple product element 
    @FindBy(xpath="//button[text()='Add to cart']")
    private List<WebElement> allproducts;
    
    public void clickallproducts()
    {
    	for(WebElement a:allproducts)
    	{
    		a.click();
    	}
    }
    
    
    
    
    @FindBy (xpath="//a[@class='shopping_cart_link']")
    private WebElement addtocartbutton;
    
//    for validation gettext method is used
    public String gettextfromaddtocart()
    {
    	String totalproducts=addtocartbutton.getText();
    	return totalproducts;
    }
    
//    how to handle dropdown
    @FindBy (xpath="//select[@class='product_sort_container']")
    WebElement filter;
    public void clickonfilter()
    {
    	filter.click();
//      Select s=new Select(filter);
    	s.selectByVisibleText("Price (low to high)");
    }
    
//    validation for filter
    public String getactualtext()
    {
    	String z=s.getFirstSelectedOption().getText();
    	return z;
    }
    
    @FindBy (xpath="//button[@id='react-burger-menu-btn']")
    WebElement menubutton;
    public void clickonmenubutton()
    {
    	menubutton.click();
    }
    
    @FindBy (xpath="//a[@id='inventory_sidebar_link']")
    WebElement allitem;
    public void clickonallitem()
    {
    	allitem.click();
    }
    
    @FindBy (xpath="//a[@id='about_sidebar_link']")
    WebElement abouttab;
    public void clickonabouttab()
    {
    	abouttab.click();
    }  
  
    @FindBy (xpath="//a[@id='logout_sidebar_link']")
    WebElement logout;
    public void clickonlogout()
    {
    	logout.click();
    }  
    
    @FindBy (xpath="//a[@id='reset_sidebar_link']")
    WebElement resetappstate;
    public void clickonresetappstate()
    {
    	resetappstate.click();
    }  
    
    public HomPagePomClass(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    	s=new Select(filter);
    }
    
    

}
