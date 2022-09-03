package com.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	 ( features = "./Features",
	   
	 glue     = "com.ny.steps",
	 tags     = "@Smoke"
		
		
		
		)
public class MyRunner extends AbstractTestNGCucumberTests {
	


}
