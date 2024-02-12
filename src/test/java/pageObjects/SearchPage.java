package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//input[@placeholder='Search']") WebElement txt_search;	
@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement btn_search;
@FindBy(xpath="//a[normalize-space()='iMac']") WebElement txt_doc;
@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]") WebElement txt_NoProduct;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement txt_ProductCompare;
@FindBy(xpath="//i[@class='fa fa-exchange']") WebElement btn_compareProduct;
@FindBy(xpath="//a[@id='compare-total']") WebElement btn_ProductCompare;
@FindBy(xpath="//td[@class='description']") WebElement txt_Comparsionimac;

public void search(String str)
{
	txt_search.sendKeys(str);
}
public void Search()
{
	btn_search.click();
}

public String st()
{
	String str= txt_doc.getText();
	return str;
}
public String noProduct()
{
	String str = txt_NoProduct.getText();
	return str;
}
public void CompareProduct()
{
	Actions act= new Actions(driver);
	act.moveToElement(btn_compareProduct).click().build().perform();
	
}
public void productCompare()
{
	btn_ProductCompare.click();
}

public String imacComparsion()
{
String str=	txt_Comparsionimac.getText();
return str;
}
}
