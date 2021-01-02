package StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

	@CucumberOptions(features="D:\\base project\\DicksmithPro\\featureFiles\\login.feature",glue="StepDef",dryRun=false,monochrome=true)
	public class TestRunner {

}
