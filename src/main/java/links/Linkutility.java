package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Linkutility 
{
	public static void verifylink(String href)
	{
		
		 try {
			 URL url=new URL(href);
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
			
			httpurlconnection.connect();
			
			int acode = httpurlconnection.getResponseCode();
			
			int ecode=200;
			
		String msg = httpurlconnection.getResponseMessage();
		
	URL	purl= httpurlconnection.getURL();
	
	SoftAssert sa=new SoftAssert();
	
	sa.assertEquals(acode, ecode);
	
	Reporter.log("url is"+purl+"Response code is:"+acode+"response message is"+msg);
		
		 } 
		 
		 catch (IOException e) {


			e.printStackTrace();
		}
	}

}
