package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Feature files\\FbForgotPassword.feature",
"src\\test\\resources\\Feature files\\FbLogin.feature" },glue="org.stepdefinition",monochrome=true,strict=true,dryRun=false,plugin=
{"html:C:\\Users\\surut\\eclipse-workspace\\Cucumber\\Reports\\htmlReport",
"json:C:\\Users\\surut\\eclipse-workspace\\Cucumber\\Reports\\jsonReport\\fb.json",
"junit:C:\\Users\\surut\\eclipse-workspace\\Cucumber\\Reports\\junitReport\\fb.xml","rerun:C:\\Users\\surut\\eclipse-workspace\\Cucumber\\Rerun\\Face.txt"})
public class RunnerClass {
@AfterClass
public static void getReport() {
	JVMReportGeneration.buildReports("C:\\Users\\surut\\eclipse-workspace\\Cucumber\\Reports\\jsonReport\\fb.json");	
}
}
