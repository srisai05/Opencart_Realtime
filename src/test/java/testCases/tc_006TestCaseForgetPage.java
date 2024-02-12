package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgetPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class tc_006TestCaseForgetPage extends BaseClass {

@Test(priority=1)
public void HomePag()
{
	HomePage hp= new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
}

@Test(priority=2)
public void Forget()
{
	LoginPage lp= new LoginPage(driver);
	lp.ForgetPassword();
		
}

@Test(priority=3)
public void eMAIL()
{
	ForgetPage fp= new ForgetPage(driver);
	fp.temail("msaaddk@gmail.com");
	fp.btn();
	Assert.assertEquals(fp.success(),"An email with a confirmation link has been sent your email address.");
}
	
}
