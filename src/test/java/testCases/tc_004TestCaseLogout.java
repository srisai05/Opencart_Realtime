package testCases;
import org.testng.annotations.Test;
import testBase.BaseClass;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.HomePage;

public class tc_004TestCaseLogout extends BaseClass {
@Test(priority=1)
public void HomeFunctionality()
{
	HomePage hp= new HomePage(driver);

	hp.clickMyAccount();
	hp.clickLogin();
}
@Test(priority=2)
public void LoginFunctionality()
{
	LoginPage lp= new LoginPage(driver);
	lp.setEmail("msamaddk@gmail.com");
	lp.setPassword("12345");
	lp.ClickLogin();
}
@Test(priority=3)
public void Logout()
{
	Logout lo= new Logout(driver);
	lo.Account();
	lo.Logot();
	lo.COntinue();
}
	
	
	
	
	
	

}
