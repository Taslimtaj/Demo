package links;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends Linkutility
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
	
	Linkutility.verifylink("href");
	
	
}
}
