package Listerner;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class dwsLogin  extends baseClass{
	@Test(retryAnalyzer =  com.crm.ListnersCode.ListenersRetry.class)
	public void main() throws InterruptedException {
		
		List<WebElement> follow = driver.findElements(By.xpath("//div[@class='column follow-us']//h3//..//ul//li"));
		for(WebElement add: follow)
		{
			add.click();
		
		}
	

}}