package testData;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Circle
{

	static {
		WebDriverManager.firefoxdriver().setup();
	}
	
	@Test
	public void testA() throws InterruptedException
	{
		int count = 0;
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("‪C:\\Users\\lenovo\\Desktop\\circle.html");
		 List<WebElement> allElemts = driver.findElements(By.xpath("//*"));
		Reporter.log("No of elements in WebPage are :"+allElemts.size(),true);
		for (WebElement circle : allElemts) {
			String tagName = circle.getTagName();
			if (tagName.equals("circle"))
			{
				count++;
				String cx = circle.getCssValue("cx");
				String cy = circle.getCssValue("cy");
				String fill = circle.getCssValue("fill-opacity");
				String color = circle.getCssValue("stroke");
				Reporter.log("Cx value is :"+cx,true);
				Reporter.log("Cy value is :"+cy,true);
				Reporter.log("Fill-opacity  value is :"+fill,true);
				Reporter.log("Color is :"+color,true);
				Reporter.log("/////////////////////////////////////////////////////",true);
			}
		}
		Reporter.log("No of Circles are :"+count,true);
		driver.close();
	}
}
