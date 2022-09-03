package com.ny.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		features = "./CucumberFeatures", // features equal to location of the
		                         // feature folder
		glue = "com.usa.stepdef", //glue equal to step definition class 
		tags = "@smoke"
		                    
		)


public class MyRunner extends AbstractTestNGCucumberTests{

}
