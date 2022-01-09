package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/Features/WebApplication.feature", glue ={"StepDefinitions"}

)
public class WebApplication extends AbstractTestNGCucumberTests {
}
