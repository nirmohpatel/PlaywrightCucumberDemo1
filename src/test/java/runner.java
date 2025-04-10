import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    plugin = {"html:target/cucumber-report/cucumber-html-report.html"},
    features = "src/test/resources/features",
    glue = {"stepsDefs"},
    tags = "@Test1")
public class runner extends AbstractTestNGCucumberTests {}
