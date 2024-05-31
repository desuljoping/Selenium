package DataDriven;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class dataProvider extends baseClassDwsLogin {
	WebDriver driver;
	@Test(dataProvider = "login")//identifier name
public void main(String username,String pass) throws InterruptedException {
//		  driver = new ChromeDriver();
//			//maximize window
//			driver.manage().window().maximize();
//			//implicitly wait
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			driver.navigate().to("https://demowebshop.tricentis.com/");
//		driver.findElement(By.className("ico-login")).click();
//		driver.findElement(By.id("Email")).sendKeys(username);
//		driver.findElement(By.id("Password")).sendKeys(pass);
//		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	
		//click on digital download
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		//add product
		List<WebElement> addtocart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement add : addtocart) 
		{
			add.click();
			Thread.sleep(1000);
		}
		
		
	}}
//	@DataProvider(name="login")
//	public Object[][] sender() throws EncryptedDocumentException, IOException{
//		return DataProviderUtility.dwsLogin();
	
	


