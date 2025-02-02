package parameterAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ShopperStack {
	@Parameters({"url","username","password"})
	@Test
	public void shopperLogin(String url,String username,String password) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
			//maximize window
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']")));
            WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
			if(loginButton.isEnabled()) {
				loginButton.click();
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("username");
				driver.findElement(By.id("Password")).sendKeys("password");
				driver.findElement(By.xpath("//span[text()='Login']")).click();
			}
			else {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();",loginButton);
			}

			
		}
	}


