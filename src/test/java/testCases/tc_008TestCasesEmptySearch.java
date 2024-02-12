package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.BaseClass;
import pageObjects.SearchPage;
public class tc_008TestCasesEmptySearch extends BaseClass{
	
	@Test
	public void Search ()
	{
		SearchPage sp= new SearchPage(driver);
		sp.Search();
		Assert.assertEquals(sp.noProduct(), "There is no product that matches the search criteria.");
		
	}
	
	
	

}
