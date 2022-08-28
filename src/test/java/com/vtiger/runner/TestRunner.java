package com.vtiger.runner;

import org.junit.runner.RunWith;

import com.vtiger.stepdefinitions.Login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/",
		glue= {"com.vtiger.stepdefinitions"},
		//plugin= {"pretty","html:target/cucumber-reports.html"},
		
				plugin= {"pretty","html:target/cucumber-html-reports.html","json:target/Cucumber.json"},
		monochrome=true,
	//tags="@Teste2e"
		tags="@Test"
		//dryRun = true
	
		
		
		)
public class TestRunner {

}
