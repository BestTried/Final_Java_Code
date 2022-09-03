 package com.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features ="./Features",
	glue ="com/us/stepdefinition"
	)
 public class MyRunner extends AbstractTestNGCucumberTests{

}
