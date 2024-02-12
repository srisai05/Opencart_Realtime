package testCases;
import testBase.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;
public class tc_009ProductCompare extends BaseClass{

	@Test
	public void Check1() throws InterruptedException
	{
		SearchPage sp= new SearchPage(driver);
		sp.search("imac");
		sp.Search();
		Thread.sleep(5000);
		sp.CompareProduct();
		Thread.sleep(5000);
		sp.productCompare();
		Assert.assertEquals(sp.imacComparsion(), "Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s mor..");
	
		
	}
	
	
	
	
}
