package testBase;

import org.testng.annotations.*;

import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	@BeforeClass(groups = {"Regression","Master","Sanity"})
	@Parameters("browser")
	public void setup(String br)
	{
		rb= ResourceBundle.getBundle("config"); // Load configuration files 
		logger= LogManager.getLogger(this.getClass());//Logging for to get class
		
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if (br.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("appURL"));
		driver.manage().window().fullscreen();
		

	
		
	}
	//Below two method will uses the Random number and text 
	public String randomeString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public String randomeNumber()
	{
		String genString2 = RandomStringUtils.randomNumeric(10);
		//String genString3 = RandomStringUtils.randomAlphanumeric(6);

		return genString2;
	}
	public String randomePassword()
	{
		String genString3= RandomStringUtils.randomAlphanumeric(6);
		return genString3;
	}
	
	public String captureScreen(String tname) throws IOException
	{
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timestamp+".png";
		try
		{
			FileUtils.copyFile(source,new File(destination));
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return destination;
	}

	
	@AfterClass(groups = {"Regression","Master","Sanity"})
	public void tear_Down()
	{
	driver.quit();	
	}
	
	
}
