package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./Features", glue ="step.definition", tags = "@Sanity")
public class MyRunner extends AbstractTestNGCucumberTests {

}
