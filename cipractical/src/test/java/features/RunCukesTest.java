package features;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cucumber-html-report",
	"json:target/cucumber-report.json"})
@RunWith( Cucumber.class )
public class RunCukesTest 
{

}
