package com.hrms.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",//need to give a path for our feature file.
        glue = "com/hrms/stepdefinitions", //need to glue our step definitions - implementations.
        dryRun = false,  // when set as true, will run over the feature and reveal unimplemented steps in console.
        tags = {"@validCreds"}, //adding tag whatever you want
        strict = false, //when set as true, wil fail the execution when undefined step is found
        plugin = {"pretty",//will print executed steps inside the console
                   "html:target/cucumber-default-reports",//generates default html report
                   "rerun:target/FailedTests.txt",//generates txt reports for the tests failed only
                    "json:target/cucumber.json"// JavaScript Object Notation generates json report (mostly for API TESTs)

                                             }
                                              )
public class TestRunner {

}
