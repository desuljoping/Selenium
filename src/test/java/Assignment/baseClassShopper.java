package Assignment;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

import DataDriven.DataProviderUtilityShopper;

public class baseClassShopper {
	
	WebDriver driver;//globalization
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Connecting to the DataBase");
	}
	@BeforeTest
	public void beforetTest() {
		System.out.println("Pre-condition for test runner");
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		//launch the browser
	    driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		//Login user
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']")));
//		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		if(loginButton.isEnabled()) {
			loginButton.click();
		}
		else {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",loginButton);
		}
//		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
//		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("desuljoping@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Desul123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	@AfterMethod
	public void afterMethod() {
	
		driver.findElement(By.linkText("Logout")).click();
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
	
	}


