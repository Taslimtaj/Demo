package testData;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

public class test 
{
	

	@Test
	public void testA() throws IOException 
	{
		//specify url to be tested//present in java.net
		
		URL url=new URL("https://selenium.dev/downloads/");
		
	
		
		HttpURLConnection httpconnection=(HttpURLConnection) url.openConnection();
		
		//to get connection
		httpconnection.connect();
		
		//to get the response code
		int code = httpconnection.getResponseCode();
		
		//to get response msg
		String msg = httpconnection.getResponseMessage();
		
		URL url1 = httpconnection.getURL();
		System.out.println("Response code is" +code);
		System.out.println("Response msg is" +msg);
		System.out.println("Response url is" +url1);
		
		
	}
}
