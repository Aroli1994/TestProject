package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {

	// Global Hooks-is applicable for all scenario and executes before and after
	// each scenario
	@Before(order=0)
	public void setUp() {
		System.out.println("Launch FF");
		System.out.println("Enter URL of CRM pro");
	}
	
	@After(order=0)
	public void tearDown() {
		System.out.println("close the browser");
	}
	
	@Before(order=1)
	public void setUp1() {
		System.out.println("Launch FF");
		System.out.println("Enter URL of CRM pro");
	}
	
	@After(order=1)
	public void tearDown1() {
		System.out.println("close the browser");
	}
	

	// local- only for first scenario
	@Before("@First")
	public void beforeFirst() {
		System.out.println("only before: first scenario");
	}

	@After("@First")
	public void afterFirst() {
		System.out.println("only after: first scenario");
	}

	// local- only for second scenario
	@Before("@Second")
	public void beforeSecond() {
		System.out.println("only before: second scenario");
	}

	@After("@Second")
	public void afterSecond() {
		System.out.println("only after: second scenario");
	}

	// local- only for third scenario
	@Before("@Third")
	public void beforeThird() {
		System.out.println("only before: third scenario");
	}

	@After("@Third")
	public void afterThird() {
		System.out.println("only after: third scenario");
	}
	
	@Given("^this is first step$")
	public void this_is_first_step(){
		System.out.println("1st step");
	}

	@When("^this is second step$")
	public void this_is_second_step(){
		System.out.println("2nd step");
	}

	@Then("^this is third step$")
	public void this_is_third_step(){
		System.out.println("3rd step");
	}


}
