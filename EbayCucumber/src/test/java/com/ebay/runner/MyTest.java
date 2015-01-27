package com.ebay.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(//dryRun = false,
		 features = "src/test/resources/com/ebay/runner/test")
		
public class MyTest {
	//Trying to check the git...
}
