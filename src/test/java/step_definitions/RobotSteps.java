package step_definitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Robot;

public class RobotSteps {
	private Robot robot = new Robot("undefined");
	
	@Given("^I am in a \"([^\"]*)\" mood$")
	public void i_am_in_a_mood(String mood) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    robot.setMood(mood);
	}
	@When("^you \"([^\"]*)\" me$")
	public void you_me(String action) throws Throwable {
	    switch(action) {
	    	case "tickle":
	    		robot.tickle();
	    		break;
	    	default:
	    		throw new UnsupportedOperationException();
	    }
	}

	@Then("^I will \"([^\"]*)\"$")
	public void i_will(String testOutcome) throws Throwable {
	    String outcome = robot.getOutcome();
	    System.out.println("Outcome is: " +outcome);
	    assertEquals("Outcome should be " + testOutcome, testOutcome, outcome);
	}
	
	
	public RobotSteps(){
		System.out.println("Robotsteps constructor...");
	}
	
}