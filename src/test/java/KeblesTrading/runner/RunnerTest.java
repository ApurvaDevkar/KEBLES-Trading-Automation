package KeblesTrading.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/KeblesTrading/features"}, 
plugin = {"pretty", "html:target/cucumber-html-reports",  
"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", 		
"rerun:target/failed_scenarios.txt"}, 
monochrome = true, 
glue = {"KeblesTrading/stepdef"},
tags = {"@Test"})

public class RunnerTest extends AbstractTestNGCucumberTests {

} 

