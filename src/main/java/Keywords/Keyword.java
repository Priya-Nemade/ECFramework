/*
 * Project Name: EagerCrow
 * Author: 
 * Client:
 * Organization: Testing Shastra
 */
package Keywords;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	

	/**
	 * This method opens browser as per browser name Chrome, Firefox, IE, Opera, Edge, HTMLUnit.
	 * 
	 * @param browserName
	 */
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			System.out.println("Chrome browser opemimg");
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			break;
		case "Firefox":
			System.out.println("Firefox browser opemimg");
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			break;
		case "IE":
			System.out.println("InternetExplorer browser opemimg");
			WebDriverManager.iedriver().setup();
			Constants.driver = new InternetExplorerDriver();
			break;
		case "Opera":
			System.out.println("Opera browser opemimg");
			WebDriverManager.operadriver().setup();
			Constants.driver = new OperaDriver();
			break;
		case "Edge":
			System.out.println("Edge browser opemimg");
			WebDriverManager.edgedriver().setup();
			Constants.driver = new EdgeDriver();
			break;
		case "HTMLUnit":
			System.out.println("HtmlUnit browser opemimg");
			Constants.driver = new HtmlUnitDriver();
			break;

		default:
			System.out.println("Invalid Browser Name" + browserName);
			break;
		}
	}

	/**
	 * This method opens url by specified url name
	 * 
	 * @param urlName is in {@code String} format.
	 */
	public static void launchUrl(String urlName) {

		Constants.driver.get(urlName);
	}

	/**
	 * This method is used to get {@code WebElement}
	 * 
	 * @param locatorType  It should be
	 *                     XPATH,CSS,ID,NAME,CLASS,LINKTEXT,PARTIAL_LINK_TEXT.
	 * @param locatorValue
	 * @return {@code WebElement}
	 */
	private static WebElement getWebElement(String locatorType, String locatorValue) {
		switch (locatorType) {
		case "XPATH":
			Constants.element = Constants.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			Constants.element = Constants.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			Constants.element = Constants.driver.findElement(By.id(locatorValue));
			break;
		case "NAME":
			Constants.element = Constants.driver.findElement(By.name(locatorValue));
			break;
		case "CLASS":
			Constants.element = Constants.driver.findElement(By.className(locatorValue));
			break;
		case "LINK_TEXT":
			Constants.element = Constants.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			Constants.element = Constants.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "TAG_NAME":
			Constants.element = Constants.driver.findElement(By.tagName(locatorValue));
			break;
		default:
			System.out.println("Invalid locator Type Name " + locatorType
					+ " Expected: XPATH, CSS, ID, CLASS, LINK_TEXT, PARTIAL_LINK_TEXT,TAG_NAME.");
			break;
		}
		return Constants.element;
	}

	/**
	 * This Method is used to send text to TEXTBOX
	 * 
	 * @param element
	 * @param textToEnter
	 */
	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);

	}

	/**
	 * This method takes 3 parameter to send text to WebElement
	 * 
	 * @param locatorType  XPATH,CSS,ID,NAME,CLASS,LINKTEXT,PARTIAL_LINK_TEXT
	 * @param locatorValue
	 * @param textToEnter  Specific text you want to enter.
	 */
	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	/**
	 * You can click on webelement by using locator type and Locator value
	 * 
	 * @param locatorType  {@code String}
	 * @param locatorValue {@code String}
	 */
	public static void clickOn(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}
	/**
	 * It will accept the alert.
	 */

	public static void acceptAlertMassage() {
		Constants.alert = Constants.driver.switchTo().alert();
		Constants.alert.accept();
	}
	/**
	 * It will reject the alert.
	 */

	public static void rejectAlertMassage() {
		Constants.alert = Constants.driver.switchTo().alert();
		Constants.alert.dismiss();
	}
/**
 * It will display alert massage.
 */
	public static void getAlertMassage() {
		Constants.alert = Constants.driver.switchTo().alert();
		System.out.println(Constants.alert.getText());
	}
	/**
	 * This method will maximize the Window.
	 */

	public static void toMaximizeWindow() {
		Constants.driver.manage().window().maximize();
	}

}
