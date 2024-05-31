package Listerner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class NetworkFailure {


@Test(retryAnalyzer = com.crm.ListnersCode.NetworkRetry.class)
public void main() {
	WebDriver driver = new ChromeDriver();
	assertEquals("hi","bye");
	
}}