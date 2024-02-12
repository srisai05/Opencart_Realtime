package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import testBase.BaseClass;

public class tc_005TestCaseLogoutFunctionality extends BaseClass {
SoftAssert sa= new SoftAssert();
	@Test(priority=1)
	public void HomPage(){
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		//sa.assertEquals(false, false);
		
		
	}
	@Test(priority=2)
	public void Login() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setEmail("msamaddk@gmail.com");
		lp.setPassword("12345");
		lp.ClickLogin();
		//driver.navigate().refresh();
		//driver.get("http://localhost/opencart/upload/");
		//driver.navigate().forward();
		//Actions act= new Actions(driver);
		//act.keyDown(Keys.CONTROL).sendKeys("T").keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		
		
	}
	//@Test(priority=3)
	public void Log()
	{
		Logout lo = new Logout(driver);
		lo.Account();
		//lo.Right();
		//lo.COntinue();
	}
}
