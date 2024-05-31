package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class shopperLogin extends baseClassShopper {
	@Test
	public void addTshirt() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		Thread.sleep(2000);
		List<WebElement> addtocart = driver.findElements(By.xpath("//button[text()='add to cart']"));
		for (WebElement add : addtocart) 
		{
			add.click();
			Thread.sleep(1000);
		}
	}
}
