package com.crm.baseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		//launch the browser
	    driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@BeforeMethod
	public void beforeMethod() {
		//Login user
		System.out.println("Welcome to the page");
	}
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Thanks for coming");	
	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
	}
	


}
