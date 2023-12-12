package utilities;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	String repName;
	public void onStart(ITestContext testContext)
	{
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); //to report the timestamp
		repName= "Test_Report_"+timestamp+".html"; //report Name 
		
		sparkReporter = new ExtentSparkReporter(".\\reports\\"+repName);
		sparkReporter.config().setDocumentTitle("Open Cart Automatiion");//Title of the report
		sparkReporter.config().setReportName("Open cart Functional Testing"); //Name of the report
		sparkReporter.config().setTheme(Theme.DARK);//it will set the theme color to black
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "Open Cart");
		extent.setSystemInfo("Module", "Admin");
		extent.setSystemInfo("subModule", "Customers");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("UserName",System.getProperty("user.name"));
		extent.setSystemInfo("Environment","QA");
	
	}
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.PASS,"Test Passed");
		
	}
	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Failed");
		test.log(Status.FAIL, result.getThrowable().getMessage());

	try
	{
		String imgpath = new BaseClass().captureScreen(result.getName());
		test.addScreenCaptureFromPath(imgpath);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.createNode(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, "Test Skipped");
		test.log(Status.SKIP, result.getThrowable().getMessage());
		
	}
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
	
	
	
	

}
