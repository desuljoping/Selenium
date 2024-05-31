package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import TestNg.DwsBaseClass;

public class AssertEqual extends DwsBaseClass {
	
	@Test
	public void hardAssert(){
		String expected_result="https://demowebshop.tricentis.com/";
		 WebDriver driver = new ChromeDriver();
			//maximize window
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://demowebshop.tricentis.com/");
			String actual_result = driver.getCurrentUrl();
			assertEquals(expected_result,actual_result);
			driver.findElement(By.id("small-searchterms")).sendKeys("desul");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			
	}
	

}
