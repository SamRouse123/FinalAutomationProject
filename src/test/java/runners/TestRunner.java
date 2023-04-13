package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue={"stepDefinitions"}, plugin = {"json:target/cucumber-reports/Cucumber.json",
        "html:target/cucumber-reports/cucumber-test-results.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner {
}