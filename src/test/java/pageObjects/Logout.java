package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage {

	public Logout(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement btn_Account;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']") WebElement btn_logout;
	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement btn_continue;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement btn_RightLogout;
	
	public void Account()
	{
		btn_Account.click();
	}
	public void Logot()
	{
		btn_logout.click();
	}
	public void COntinue()
	{
		btn_continue.click();
	}
	public void Right()
	{
		btn_RightLogout.click();
	}

}
