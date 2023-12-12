package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.*;
import testBase.BaseClass;

public class tc_002TestCaseLogin extends BaseClass{
	
	@Test(groups = {"Sanity","Master"}) 
	public void test_login()
	{
		
		try{
		logger.info("starting TC__002_ Login Test Method *****");
		
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.ClickLogin();
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetpage =macc.isMyAccountPageExists();
		Assert.assertEquals(targetpage, true);
	}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
logger.info("***** Finished Test case 02 login test*******");
		
		
		
		
	
	}

}
