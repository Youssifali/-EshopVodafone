package BDDTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/BDDTests/Feature.feature"},
        glue = {"BDDTests"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class Runner extends AbstractTestNGCucumberTests{
}
