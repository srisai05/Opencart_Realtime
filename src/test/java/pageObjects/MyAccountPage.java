package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage  extends BasePage
{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement txtCnt;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement btnLogout;
public boolean isMyAccountPageExists()
{
	try
	{
		return (txtCnt.isDisplayed());
		
	}
	catch(Exception e)
	{
		return (false);
	}
}
public void ClickLogout()
{
	btnLogout.click();
}
	
}
