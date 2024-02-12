package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPage extends BasePage {
	public ForgetPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(name="email") WebElement txt_email;
	@FindBy(xpath="//input[@value='Continue']") WebElement btn_Forget;
	@FindBy(xpath="//a[@class='btn btn-default']") WebElement btn_back;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement cnfrm_Success;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement cnfrm_Fail;
	
	public void temail(String str)
	{
		txt_email.sendKeys(str);
	}
	public void btn()
	{
		btn_Forget.click();
	}
public void back()
{
	btn_back.click();
}
public String success()
{
	String str= cnfrm_Success.getText();
	System.out.println("Confirm Success :"+str);
	
	return str;
}
public String Fail()
{
	String str= cnfrm_Fail.getText();
	System.out.println("its fail : "+str);
	return str;
}
	
	
}
