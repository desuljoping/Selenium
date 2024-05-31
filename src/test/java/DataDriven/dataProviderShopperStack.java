package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderShopperStack {
	@Test(dataProvider = "login")
	public void receiver(String username,String pass) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	driver.get("https://www.shoppersstack.com/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']")));
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	
	driver.findElement(By.id("Email")).sendKeys(username);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(2000);
	driver.close();
	}
	
	@DataProvider(name="login")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		return DataProviderUtilityShopper.shopperLogin();
	}

	
}

