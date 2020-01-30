package TestCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Keywords.Keyword;

public class SignIn {
Logger logger=Logger.getLogger(SignIn.class);

@Test
public void tc_01() {
	logger.info("browser opening");
	Keyword.openBrowser("Chrome");
	Keyword.launchUrl("https://www.google.com");
	logger.debug("url not open");

}
}
