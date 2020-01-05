package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataUtility
{//create a generic file
	
 
	public static String getProperyData(String key)
	{
		File f = new File("./Data/Input.properties");
		try {
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return " ";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return " ";
		}
	}
}
