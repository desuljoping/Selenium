package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft {
	@Test
	public void SoftAssert(){
		String expected_result="https://demowebshop.tricentis.com/";
		String a = "desul";
		String b = null;
		 WebDriver driver = new ChromeDriver();
			//maximize window
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://demowebshop.tricentis.com/");
			SoftAssert ass = new SoftAssert();
			String actual_result = driver.getCurrentUrl();
			boolean result = expected_result.equals(actual_result);
			ass.assertTrue(result);
			driver.findElement(By.id("small-searchterms")).sendKeys("desul");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			ass.assertAll();
			

	}}
