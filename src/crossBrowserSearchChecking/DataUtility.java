package crossBrowserSearchChecking;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtility 
{
	public String getDataProperties(String data) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium Folder\\credentials.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(data);
	}
	

}
