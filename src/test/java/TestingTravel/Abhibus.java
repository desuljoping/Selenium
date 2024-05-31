package TestingTravel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Abhibus {
	@Parameters("url")
	@Test(groups ="regression")
	public void abhiBus(String url) {
	 WebDriver driver = new ChromeDriver();
	//maximize window
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().to(url);


}}
