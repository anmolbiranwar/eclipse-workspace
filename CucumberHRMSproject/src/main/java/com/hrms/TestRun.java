package com.hrms;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","html:target/cucumber-html-report"},tags={"@Application"})


public class TestRun {
 
}
