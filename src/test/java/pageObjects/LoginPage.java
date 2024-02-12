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
	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']") WebElement btn_Forget;
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
	
	public void ForgetPassword()
	{
		btn_Forget.click();
	}

	
	
	
	
}
