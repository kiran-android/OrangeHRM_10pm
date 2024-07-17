package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = "FeatureFiles/adminlogin.feature",
		glue = "stepdefinitions",
		dryRun = false,
		plugin = {"pretty","html:Test Reports/loginresult.html"}
	
)

public class AdminLoginTest extends AbstractTestNGCucumberTests{

}
