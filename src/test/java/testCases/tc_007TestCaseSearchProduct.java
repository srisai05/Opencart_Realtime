package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;
import testBase.BaseClass;

public class tc_007TestCaseSearchProduct extends BaseClass{
	
	@Test(priority=1)
	public void Search()
	{
	SearchPage sp= new SearchPage(driver);
	sp.search("iMac");
	sp.Search();
	Assert.assertEquals(sp.st(),"iMac");
	
	}
	

}
