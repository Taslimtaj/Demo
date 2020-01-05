package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;


//only for checking data
//we cant see the GUI

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefox {
	static {
		WebDriverManager.firefoxdriver().setup();
	}

	
	@Test
	public void testA()
	{
		FirefoxOptions fa=new FirefoxOptions();
		fa.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(fa);
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		Reporter.log("the current url is"+url,true);
		Reporter.log("the current title is"+title,true);
		
		driver.close();
		
	}
}


