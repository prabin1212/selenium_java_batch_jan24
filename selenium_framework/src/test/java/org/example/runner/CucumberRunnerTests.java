package org.example.runner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(tags = " ", features = {"src/main/resources/features/test.features"}, glue = {"org/example/stepdefinations"}, plugin = {"pretty", "html:target/cucumber-report.html"})
    class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}