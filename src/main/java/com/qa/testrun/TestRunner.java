package com.qa.testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features= "E:\\Selenium Training\\Selenium_Workspace\\Demo_Project_Test\\src\\main\\java\\features\\login.feature",
	glue= "E:\\Selenium Training\\Selenium_Workspace\\Demo_Project_Test\\src\\main\\java\\com\\qa\\stepDefination\\StepDefination.java",
	dryRun=true
		
		
		)

public class TestRunner {

}
