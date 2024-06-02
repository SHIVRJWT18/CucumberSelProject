package TestRunnerPkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features= "F:\\SHIV NEWSCRIPTS\\CucumberSelProject\\src\\main\\java\\FeaturesPkg\\Login.feature"
,glue = {"StepDefinitionPkg"}
,dryRun = true)

public class TestRunner extends AbstractTestNGCucumberTests
{
	//  ,tags = "@DeletePlace 
}
