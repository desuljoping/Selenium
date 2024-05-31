package DataDriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethod {
	@Test(enabled = false)
	public void Main() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.close();
		
	}

	@Test(priority = 1,invocationCount = 2,threadPoolSize = 2)
	public void RCB() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.royalchallengers.com/");
		driver.close();
		
	}
	@Test(priority = 0)
     public void MI() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.mumbaiindians.com/");
		driver.close();
		
	}
     @Test(priority = 2)
     public void CSK() {
 		
 		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		driver.navigate().to("https://www.chennaisuperkings.com/");
 		driver.close();
 		
 	}

}
