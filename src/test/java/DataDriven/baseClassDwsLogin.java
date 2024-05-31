package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class baseClassDwsLogin {
     protected WebDriver driver;//globalization
 	@Test(dataProvider = "login")
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Connecting to the DataBase");
	}
	@BeforeTest
	public void beforetTest() {
		System.out.println("Pre-condition for test runner");
	}
	@BeforeClass
	public void beforeClass() {
		//launch the browser
	    driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		}

	@BeforeMethod
	public void beforeMethod(String username,String password)  {
		//Login user
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	@AfterMethod
	public void afterMethod() {
		
		driver.findElement(By.className("ico-logout"));
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Post Conditions for test runner");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("Disconnect for database");
	}
		

	@DataProvider(name="login")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		return DataProviderUtility.dwsLogin();
	}}



