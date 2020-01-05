package testData;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.asserts.SoftAssert;

public class linkutility 
{
	public static void responseForLink(String link)
	{
		//generic method
			try {
				URL url = new URL(link);
				HttpURLConnection httpUrlConection = (HttpURLConnection) url.openConnection();
				httpUrlConection.setConnectTimeout(2000);
				httpUrlConection.connect();
				int code = httpUrlConection.getResponseCode();
				String msg = httpUrlConection.getResponseMessage();
				URL url1 = httpUrlConection.getURL();
				if (code == 200) {
					System.out.println(url1 + " is working fine.And response code is :" + code + " response msg is :" + msg);
				} else {
					System.out.println(url1 + " is broken.And response code is :" + code + " response msg is :" + msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			
		


			
		}
	}

}
