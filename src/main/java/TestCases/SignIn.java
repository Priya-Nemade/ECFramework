package TestCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Keywords.Keyword;

@Listeners(Keyword.class)
public class SignIn {
	Logger logger = Logger.getLogger(SignIn.class);

	@Test
	public void tc_01() throws IOException, InterruptedException {
		logger.info("browser opening");
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.google.com");
		logger.debug("url not open");
		// Keyword.readExcelData("D:\\EagercrowData.xlsx");
		// assertEquals(false, true);
		Keyword.fullPageScreenShot(7000, "eagercrow.png");

	}
}
