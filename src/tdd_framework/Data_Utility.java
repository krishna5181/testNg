package tdd_framework;

import java.io.FileInputStream;
import java.util.Properties;

public class Data_Utility 
{
	public String getDatafromProperties(String data) throws Exception
	{
	FileInputStream fis = new FileInputStream("D:\\Selenium Folder\\credentials.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	return pobj.getProperty(data);
	}

}
