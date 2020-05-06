package com.MirzaawalEcommerce.Cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Feature\\Sprint2.feature",
glue="com.MirzaAwalEcommer.Steps",
monochrome=true)

public class JunitRunnerRegistration {

}
