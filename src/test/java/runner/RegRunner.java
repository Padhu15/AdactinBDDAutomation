package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\regression",glue="steps",
                                        tags="@wip0607",dryRun=false)
public class RegRunner {

	

}
