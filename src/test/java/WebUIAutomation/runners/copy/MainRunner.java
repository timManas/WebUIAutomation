package WebUIAutomation.runners.copy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/java/WebUIAutomation/resources/features"}, // MAKE SURE NO STARTING '/'
		glue = {""}, // LOL wtf ... why does this blank work?
		monochrome = true, 
		tags = {}, 
		plugin = { 	"pretty", 
					"html:target/cucumber", 
					"json:target/cucumber.json" })


public class MainRunner extends AbstractTestNGCucumberTests {
}



