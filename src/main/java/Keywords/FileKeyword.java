package Keywords;

import java.io.IOException;

public class FileKeyword {
public static void fileUpload(String locatorType, String locatorValue, String textToEnter) {
	//Keyword.clickOn(locatorType, locatorValue);
	Keyword.enterText(locatorType, locatorValue, textToEnter);
	try {
		Runtime.getRuntime().exec("D:\\AutoIT\\File1Upload.exe");
	} catch (IOException e) {
		System.out.println("Unable to find file");
		e.printStackTrace();
	}

}
}
