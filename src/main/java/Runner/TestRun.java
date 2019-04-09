package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:/shareit/Eclipse/CricBuzz/src/main/java/Features/cricbuzz.feature",
		glue={"StepDefinitons"},
		format = {"pretty","html:test-output","junit:junit_xml/cucumber.xml"},
		dryRun=false,
		monochrome=true,
		strict = true
		)

public class TestRun {

	
	
}
