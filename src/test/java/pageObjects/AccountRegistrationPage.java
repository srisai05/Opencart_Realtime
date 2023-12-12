package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//ELements 
	@FindBy(name="firstname") WebElement txtFirstname;
	@FindBy(name="lastname") WebElement txtLastname;
	@FindBy(name="email") WebElement txtEmail;
	@FindBy(name="password") WebElement txtPassword;
	@FindBy(xpath="//input[@name='agree']") WebElement CheckAgree;
	@FindBy(xpath ="//input[@value='Continue']") WebElement ContinueSubmit;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txtNumber;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement ConfirmPassword;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void CheckPassword(String pwd)
	{
		ConfirmPassword.sendKeys(pwd);
		System.out.println("Checked password entering ");	}
	public void setAgree() throws InterruptedException
	{
		Thread.sleep(5000);
		
		CheckAgree.click();
	}
	public void Clickcontinue()
	{
		ContinueSubmit.click();
	}
	public void Cnumber(String  Num)
	{
		txtNumber.sendKeys(Num);
	}
	public String getConfirmationMsg() {
		
		try {
			
			return (msgConfirmation.getText());
		} 
		catch (Exception e) {
		
			return (e.getMessage());

		}
	}
}


	
/*	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
			
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
		
	}*/

