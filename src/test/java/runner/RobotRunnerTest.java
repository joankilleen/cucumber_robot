package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features/robot.feature"},
glue={"step_definitions"})
public class RobotRunnerTest {

}
