package StepDefinitions;

import org.testng.annotations.Test;

import Keywords.Keyword;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInPageSteps {
	@Test
	@Given("^Chrome browser is opened$")
	public void chrome_browser_is_opened()  {
	    Keyword.openBrowser("Chrome");
	    Keyword.launchUrl("https://www.facebook.com");
	    
	}

	@When("^User enters invalid uname and password$")
	public void user_enters_invalid_uname_and_password()  {
		System.out.println("uname and password has entered");
	    
	}

	@Then("^User will get an error message$")
	public void user_will_get_an_error_message()  {
		System.out.println("uname and password is invalid");
	}

}
