package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/parameterization.feature", glue = {
		"stepDefinations" }, monochrome = true, plugin = { "pretty", "html:reports/htmlReport/html",
				"json:reports/JsonReport/Cucumber.json", "junit:reports/JunitReport/report.xml" })


public class TesrRunnerParameterization {

}
