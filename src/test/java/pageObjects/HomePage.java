package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
public class HomePage extends BasePage {
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements locating the points 
	@FindBy(xpath ="//span[normalize-space()='My Account']" ) WebElement lnkMyaccount;
	
@FindBy(xpath="//a[normalize-space()='Register']") WebElement lnkRegister;
@FindBy(xpath="//a[normalize-space()='Login']" ) WebElement lnkLogin;
//Action methods:

public void clickMyAccount()
{
	lnkMyaccount.click();
	
}
public void clickRegister()
{
	lnkRegister.click();
}
public void clickLogin()
{
	lnkLogin.click();
}

}
