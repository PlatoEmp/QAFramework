package com.QAframe;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features"},
        glue = {"com.QAframe.StepDefinitions"})
public class TestRunner extends AbstractTestNGCucumberTests {
}