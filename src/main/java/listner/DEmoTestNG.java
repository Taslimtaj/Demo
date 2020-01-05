package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listner.TestNG.class)
public class DEmoTestNG
{

	@Test
	public void testA()
	{
		Reporter.log("-------TESTA---------",true);

	}
	@Test
	public void testB()
	{
		Reporter.log("-------TESTB---------",true);
	//	Assert.fail();
	}
	@Test(dependsOnMethods = "testB")
	public void testC()
	{
		Reporter.log("-------TESTC---------",true);
		//Assert.fail();
	}
}
