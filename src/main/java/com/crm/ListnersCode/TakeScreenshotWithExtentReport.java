package com.crm.ListnersCode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.baseClass.BaseClass;

public class TakeScreenshotWithExtentReport  extends BaseClass implements ITestListener {
	public ExtentReports report;
	  public ExtentSparkReporter spark;
	   public ExtentTest test;
	  
		@Override
		public void onTestStart(ITestResult result) {
			String name= result.getMethod().getMethodName();
			test=report.createTest(name);
			test.log(Status.INFO, "welcome to our class");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
		
			
			test.log(Status.PASS, "is Passed");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			test.log(Status.FAIL, "is failed");
			TakesScreenshot ts =  (TakesScreenshot) driver ;
			String from = ts.getScreenshotAs(OutputType.BASE64);
			test.addScreenCaptureFromBase64String(from);
				
				
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
			
			test.log(Status.SKIP,"is Skipped");
	
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			File path =  new File("./extenetReport/screenshotFile.html");
			spark = new  ExtentSparkReporter(path);
			spark.config().setDocumentTitle("selenium");
			spark.config().setReportName("Desul");
			spark.config().setTheme(Theme.STANDARD);
			//attach the test case
			report=new ExtentReports();
			report.setSystemInfo("os", "Windows10");
			report.setSystemInfo("Browser", "chrome");
			report.attachReporter(spark);
			//create the test case
			
			
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			report.flush();
		}

}
