package com.automateQA.runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/com/automateQA",glue={"com.automateQA.stepDefinitions"},tags="@tagOne or @tagTwo or @tagThree")
public class RunnerClass extends AbstractTestNGCucumberTests {

}
