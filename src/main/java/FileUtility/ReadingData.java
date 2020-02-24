package FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingData {
public static String readDataFromFile()   {
	String browserName = null;
	Properties prop=new Properties();
	try {
		FileInputStream fis=new FileInputStream("D:\\Workplace\\EagerCrowProjectFramework\\Input\\Data.properties");
	prop.load(fis);
	 browserName=prop.getProperty("browser");
	} catch (IOException e) {
		System.out.println("File not found");
		e.printStackTrace();
	}
return browserName;
}
}
