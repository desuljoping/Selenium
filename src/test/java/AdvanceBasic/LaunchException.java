package AdvanceBasic;

import org.testng.annotations.Test;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class LaunchException {
		
		@Test
		public void Main() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://demowebshop.tricentis.com/");
			driver.close();
			
		}

		@Test
		public void RCB() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.royalchallengers.com/");
			driver.close();
			
		}
		@Test
	     public void MI() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.mumbaiindians.com/");
			driver.close();
			
		}
	     @Test
	     public void CSK() {
	 		
	 		WebDriver driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 		driver.navigate().to("https://www.chennaisuperkings.com/");
	 		driver.close();
	 		
	 	}
//		public static void main(String[] args) {
//			
//			WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			driver.navigate().to("https://www.royalchallengers.com/");
//			System.out.println("esala cup namdhe");
//			driver.close();
//			
//		}
	}

	

