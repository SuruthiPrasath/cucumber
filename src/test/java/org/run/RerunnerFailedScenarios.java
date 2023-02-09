package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\\\Face.txt",glue="org.stepdefinition",monochrome=true,
plugin={"rerun:C:\\Users\\surut\\eclipse-workspace\\Cucumber\\Rerun\\Face.txt"})
public class RerunnerFailedScenarios {
}

