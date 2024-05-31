package screenshot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.baseClass.BaseClass;
import com.crm.pom.DWSLoginPage;
@Listeners(com.crm.ListnersCode.CaptureFaliedScreenshot.class)


public class ssforFailTest extends BaseClass {
	@Test
	public void dwsLoginCorrect() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DWSLoginPage dws = new DWSLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@Test
	public void dwsLoginWrong() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DWSLoginPage dws = new DWSLoginPage(driver);
		dws.username("admin01@gmail.com");
		dws.password("admin02");
		dws.login();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

	@Test
	public void redbus() {
		driver.get("https://www.redbus.in/");
		assertEquals("hi","bye");
	}
}
