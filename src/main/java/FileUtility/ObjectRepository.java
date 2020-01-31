package FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Keywords.Constants;

public class ObjectRepository {
	String value = null;
	/**
	 * This will open ObjectRepository.properties and return value associated with key.
	 * @param key
	 * @return value in form of {@code String}
	 */
	protected String getLocators(String key) {
		
		try {
			Constants.fis = new FileInputStream("D:\\Workplace\\EagerCrowProjectFramework\\Input\\ObjectRepository.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			value = Constants.prop.getProperty(key);
		} catch (IOException e) {
			System.out.println("Unble open file");
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * This method open input file and return value associated with key.
	 * @param key
	 * @param filePath
	 * @return value in form of {@code String}
	 */
	protected String getLocators(String key, String filePath) {
		try {
			Constants.fis=new FileInputStream(filePath);
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			value = Constants.prop.getProperty(key);
		} catch (IOException e) {
			System.out.println("File "+filePath+" not found");
			e.printStackTrace();
		}
		return value;

	}
	/**
	 * This method will open ObjectRepository and return array value associated with key.
	 * @param key {@code String}
	 * @return value in form of {@code String[]}
	 */
	protected String[] getProperties(String key) {
		String[] values=null;
		try {
			Constants.fis=new FileInputStream("D:\\Workplace\\EagerCrowProjectFramework\\Input\\ObjectRepository.properties");
		    Constants.prop=new Properties();
		    Constants.prop.load(Constants.fis);
		    String part=Constants.prop.getProperty(key);
		    values=part.split("##");
		} catch (IOException e) {
			System.out.println("Unable to open ObjectRepository");
			e.printStackTrace();
		}
		
		return values;

	}
	

}
