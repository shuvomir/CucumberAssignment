package com.MirzaawalEcommerce.Cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Feature//Sprint1.feature", 
glue = "com.MirzaAwalEcommer.Steps",
monochrome=true)
//dryRun=true
//tags= {"@SmokeTest"}

public class JunitRunner {

}
