package runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
 features = "src/test/resource/functionalTests",
		 glue= {"userStepDefinition", "runners"},
		 plugin= {"pretty", "html:target/cucumber-reports"},
		 monochrome= true
 )
public class TestRunner {
}
