package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


//for faster execution

//we cant take the screenshots
public class htmlunitdriverforheadless
{
	@Test
	public void Demo4()
	{
		WebDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		Reporter.log("currrent url is"+url,true);
		Reporter.log("current title is"+title,true);
		driver.close();
	}
	

}
