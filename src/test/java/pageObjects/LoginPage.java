package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
	@FindBy(xpath ="//input[@id='input-password']") WebElement txtPassword;
	@FindBy(xpath ="//input[@value='Login']") WebElement btnLogin;
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void ClickLogin()
	{
		btnLogin.click();
	}
	
	

	
	
	
	
}
