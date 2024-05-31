package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSLoginPage;

public class dwsLogin {
	@Test
	public void loginpom() {
	 WebDriver driver = new ChromeDriver();
		//maximize window
	 driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		DWSLoginPage dws = new DWSLoginPage(driver);
//		dws.username.sendKeys("admin01@gmail.com");
//		dws.password.sendKeys("admin01");
//		dws.login.click();
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login();
		
		

}}
