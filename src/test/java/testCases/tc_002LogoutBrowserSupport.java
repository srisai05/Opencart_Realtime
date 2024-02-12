package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class tc_002LogoutBrowserSupport extends BaseClass {

@Test(priority=1)
public void setup() throws InterruptedException
{
HomePage hp= new HomePage(driver);
hp.clickMyAccount();
Thread.sleep(4000);	
	
}
//@Test(priority=2)
public void browser()
{
	
}
//@Test(priority=3)
public void browserReopen()
{
	
}

	
	
}
