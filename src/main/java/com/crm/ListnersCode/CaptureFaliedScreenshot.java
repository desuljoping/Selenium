package com.crm.ListnersCode;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.baseClass.BaseClass;

public class CaptureFaliedScreenshot  extends BaseClass implements ITestListener{
	public void onTestFailure(ITestResult result) {
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File form = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("./screenshot/dws"+time+".png");
		try {
			FileHandler.copy(form, to);
		}
		catch(IOException e){
			e.printStackTrace();
			
		}

	}}
