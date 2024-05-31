package com.crm.ListnersCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.ReadDataFromExternal.ReadFileUtility;

public class BaseClassDws  {
	public  WebDriver driver;//globalization
	 
	
 
	@BeforeSuite
	public void beforeSuit() 
	{
		System.out.println("Connecting to the DataBase");
	}
	
	@BeforeTest
	public void beforetTest()
	{
		System.out.println("Pre-condition for test runner");
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
		String url = ReadFileUtility.property("url");
		
		//launch the browser
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("./config/DwsFile.properties");
//		prop.load(fis);
//		String url = prop.getProperty("url");
	    driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to(url);
		}

	@BeforeMethod
	public void beforeMethod() throws IOException  {
		String password = ReadFileUtility.property("password");
		String username = ReadFileUtility.property("username");
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("./config/DwsFile.properties");
//		prop.load(fis);
//		String username = ob.getProperty("username");
//		String password = prop.getProperty("password");
		//Login user
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	@AfterMethod
	public void afterMethod() 
	{	
		driver.findElement(By.className("ico-logout")).click();
	}

	@AfterClass	
	public void afterClass() 
	{	
		driver.close();
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Post Conditions for test runner");
	}
	
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("Disconnect for database");
	}
}


