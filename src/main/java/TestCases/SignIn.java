package TestCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FileUtility.ReadingData;
import Keywords.Constants;
import Keywords.FileKeyword;
import Keywords.Keyword;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {
Logger logger=Logger.getLogger(SignIn.class);

@Test
public void tc_01() throws InterruptedException, IOException {
	System.out.println("SignUp successfully");
	//logger.info("browser opening");
	//Keyword.openBrowser(ReadingData.readDataFromFile());
   // Keyword.launchUrl("https://www.google.com");
   // WebElement fileUpload=Constants.driver.findElement(By.id("1"));
    //FileKeyword.fileUpload("ID", "1", "D:\\AutoIT\\File1Upload.exe");
    
    /**Keyword.toMaximizeWindow();
	Keyword.verifyBreakDownLinks();
	Thread.sleep(3000);
	FileKeyword.fileUpload("NAME", "uploaded_file");
	Keyword.clickOn("CLASS", "upload_txt");
	Runtime.getRuntime().exec("D:\\AutoIT/File1Upload.exe");
	Keyword.launchUrl("https://www.google.com");
	Keyword.enterText("NAME", "q", "rose images");
	Keyword.clickOn("NAME", "btnK");*/
}
}
