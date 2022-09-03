package runnerPac;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions

			(
				features = "./Feature",	
				glue     = "./stepDefinition" 
					
		     )


public class MyRunnerClass extends AbstractTestNGCucumberTests{

}
