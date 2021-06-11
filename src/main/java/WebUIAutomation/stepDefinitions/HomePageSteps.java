package WebUIAutomation.stepDefinitions;

import java.io.IOException;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends DriverFactory{
	
	@Given("^I access nasdaq homepage$")
	public void i_access_nasdaq_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage.getHomePage();
	}

	@Given("^I enter a symbol \"([^\"]*)\"$")
	public void i_enter_a_symbol(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^User is taken to Page$")
	public void user_is_taken_to_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}


}
