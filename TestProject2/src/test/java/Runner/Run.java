package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/Features/Test.feature", glue ={"StepDefinitions"}

)

public class Run extends AbstractTestNGCucumberTests {
}
