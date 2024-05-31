package Listerner;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ListnersCode.BaseClassDws;
@Listeners(com.crm.ListnersCode.Listeners.class)

public class test extends BaseClassDws 
{
	@Test
	public void addTocart() throws InterruptedException, IOException
	{
	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	List<WebElement> follow = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	for(WebElement add: follow)
	{			add.click();
	
	       Thread.sleep(2000);
	}	
	}
}
