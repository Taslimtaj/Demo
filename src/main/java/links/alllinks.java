package links;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alllinks 
{
	static
	
	{
		WebDriverManager.firefoxdriver().setup();
		
	}
	@Test
public void testA() throws IOException
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://selenium.dev/downloads/");
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	System.out.println("No of links are:"+alllinks.size());
	for(WebElement link : alllinks) 
	{
		String href = link.getAttribute("href");
	}
	
	try {
		URL url=new URL("href");
		HttpURLConnection httpurlconnection=(HttpURLConnection) url.openConnection();
		httpurlconnection.connect();
		
		if(httpurlconnection.getResponseCode()==200)
		{
			System.out.println(httpurlconnection.getURL()+"url is working fine. Response code is"+httpurlconnection.getResponseCode()+"Response message is:"+httpurlconnection.getResponseMessage());
			
		}
		
		else
		{
			System.out.println(httpurlconnection.getURL()+"url is working fine. Response code is"+httpurlconnection.getResponseCode()+"Response message is:"+httpurlconnection.getResponseMessage());
		}
	} 
	catch (MalformedURLException e) 
	{
		
		e.printStackTrace();
	}
	
}
	
}
