package testData;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bargraph 
{
	static
	{
		WebDriverManager.firefoxdriver().setup();
	}
	@org.testng.annotations.Test
	public void Test() throws InterruptedException
	{
	int count = 0;
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/lenovo/Desktop/Bargraph.html\r\n");
	 List<WebElement> alllinks = driver.findElements(By.xpath("//*"));
	Reporter.log("Number of links present in the webpage are "+alllinks,true);
	Actions act = new Actions(driver);
	for (WebElement line : alllinks) 
	{
	String tagname = line.getTagName();	
	if (tagname.equals("line"))
	{
		count++;
		String bcolor = line.getCssValue("stroke");
		Reporter.log("Before Mouse Hoverover the Color is :"+bcolor,true);
		Thread.sleep(2000);
		act.moveToElement(line).perform();
		Thread.sleep(2000);
		
		WebElement tootTip = line.findElement(By.xpath("./following-sibling::[1]/[2]"));
		//WebElement tootTip = driver.findElement(By.xpath("./following-sibling::[1]/[2]"));
		String text = tootTip.getText();
		Reporter.log("Tool Tip Text is :"+text,true);
		
		
		String acolor = line.getCssValue("stroke");
		Reporter.log("After Mouse Hoverover the Color is :"+acolor,true);
		Reporter.log("----------------------------",true);
	}
	}
	Reporter.log("No of Lines are :"+count,true);
	driver.close();
}

}
