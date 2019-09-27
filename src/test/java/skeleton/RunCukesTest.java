package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\DevOps_Day 2\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project-4.0\\src\\test\\resources\\skeleton\\Login.feature",plugin = {"json:target/CucumberReport.json"})
public class RunCukesTest {
}
