package testCases;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.*;
import org.testng.Assert;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
public class tc_001TestcaseRegistrationPage extends BaseClass{

	
	
	@Test(groups = {"Regression","Master"})
	void test_account_Registration () throws InterruptedException
	{
		//Generating the random data
		/*
		 * It would be under test cases package and in the base class it was RandomPackage utils
		 */
		logger.info("*** Starting the Tc_001TESTCASE ************");
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		logger.info("CLICKED ON MY ACCOUNT LINK");
		hp.clickRegister();
		logger.info("Clicked on register link");
		AccountRegistrationPage repage= new AccountRegistrationPage(driver);
		repage.setFirstName("abc");
		logger.info("entered  first name");

		repage.setLastName("nms");
		logger.info("entered on Last Name");

		repage.setEmail(randomeString()+"@gmail.com");
		logger.info("entered email");
		repage.Cnumber(randomeNumber());
	String sr=randomePassword();
	repage.CheckPassword(sr);

		repage.setPassword(sr);

		logger.info("enter password");
		
		logger.info("enter reconfirm password");

		repage.setAgree();
		logger.info("Clicked on privacy policy");

		Thread.sleep(5000);
		repage.Clickcontinue();
		logger.info("Clicked on Continue Button");
		
		Thread.sleep(5000);
     String confmsg=repage.getConfirmationMsg();
		
     try {	
     logger.info("Validating expected message");
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!","Test failed");
		
		}
	 catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");		
		}

		
	}
