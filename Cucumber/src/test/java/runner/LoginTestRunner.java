package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions( features = "./Feature", glue = "./stepDefinition")
public class LoginTestRunner extends AbstractTestNGCucumberTests {

}
