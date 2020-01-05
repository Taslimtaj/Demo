package headless;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome
{
	
	//we will not going to see any graphical user interface
	static {
		WebDriverManager.chromedriver().setup();
	}

	
	@Test
	public void testA() throws InterruptedException, IOException
	{
		ChromeOptions co=new ChromeOptions();//class
		co.setHeadless(true);//method
		
		WebDriver driver=new ChromeDriver(co);//initializing the driver//method
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		Thread.sleep(2000);
		
		//if i want to take screenshot of file
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screeshot/img.png"));
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		Reporter.log("the current url is"+url,true);
		Reporter.log("the current title is"+title,true);
		
		driver.close();
		
	}
}
