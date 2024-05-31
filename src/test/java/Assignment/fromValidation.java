package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fromValidation {
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
	
	driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("Something");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("desul@gmail.com");
	driver.findElement(By.xpath("//input[@name='url']")).sendKeys("qspider.com");
	
	driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("21325346547");
	driver.findElement(By.xpath("//input[@name='number']")).sendKeys("21325346547");
	driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("ffhfh6675");
	driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("nxhgdb");
	driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("fhdvgh");
	
	driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("bfgajjdbn");
	driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("123456");
	
	
	driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("5");
	driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("99");
	
	
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
	
	
	
	
	

}
}
