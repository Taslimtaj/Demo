package links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class img
{
	@Test
	public void testImages() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/img.html");
		List<WebElement> allimages = driver.findElements(By.tagName("img"));
		System.out.println(+allimages.size());
		for (WebElement image : allimages)
		{
			String src = image.getAttribute("src");
			URL url = new URL(src);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(2000);//to handle the synchronisation in url and method
			con.connect();
			
			int code = con.getResponseCode();
			
			
		String msg = con.getResponseMessage();
		
		String value = image.getAttribute("value");
		
		if(code==200)
		{
			System.out.println(value+"image is working fine"+"response code is"+code);
		}
		else
		{
			System.out.println(value+"image isbroken"+"response code is"+code);
		}
		
		}
		driver.close();
	}

}
