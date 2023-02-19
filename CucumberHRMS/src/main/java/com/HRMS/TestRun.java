package com.HRMS;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","html:target/cucumber-html-report"},tags={"@Application"})


public class TestRun {
 
}