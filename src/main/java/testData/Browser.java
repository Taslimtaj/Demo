package testData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser
{
//required html url
	static 
	{
		//without exe file open the browser
		WebDriverManager.firefoxdriver().setup();
	}
	@Test
	public void testA() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = DataUtility.getProperyData("url");
		String un = DataUtility.getProperyData("un");
		String pw = DataUtility.getProperyData("pw");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
