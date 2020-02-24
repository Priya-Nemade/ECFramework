package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Workplace\\EagerCrowProjectFramework\\src\\main\\java\\Feature\\Smoke.feature", glue= {"StepDefinitions"})
public class Runner {

}
