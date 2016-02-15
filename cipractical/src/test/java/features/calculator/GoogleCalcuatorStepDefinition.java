package features.calculator;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleCalcuatorStepDefinition 
{
	private GoogleCalculatorTester myTester;
	
	@Given("^I open google$")
	public void i_open_google() throws Throwable 
	{
	    myTester = new GoogleCalculatorTester();
	    myTester.launchGoogleCalculator();
	}

	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void i_enter_in_search_textbox(String arg1) throws Throwable 
	{
	    myTester.submitEquation(arg1);
	}

	@Then("^I should get result as \"([^\"]*)\"$")
	public void i_should_get_result_as(String arg1) throws Throwable 
	{
	    String actualResult = myTester.getResult();
	    Assert.assertEquals( arg1, actualResult );
	}

}
