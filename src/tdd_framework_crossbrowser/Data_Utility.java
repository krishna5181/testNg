package tdd_framework_crossbrowser;

import java.io.FileInputStream;
import java.util.Properties;

public class Data_Utility {
	public String getdataFromproperties(String data) throws Exception
	{
	FileInputStream fis=new FileInputStream("D:\\Selenium Folder\\login.ohrm.properties.txt");
	Properties pos=new Properties();
	pos.load(fis);
	return pos.getProperty(data);
	
	}
}
