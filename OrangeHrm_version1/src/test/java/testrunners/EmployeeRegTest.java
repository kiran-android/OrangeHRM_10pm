package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "FeatureFiles/employeeReg.feature",
		glue = "stepdefinitions",
		dryRun = false,
		plugin = {"pretty","html:Test Reports/employeereg.html"}
)
public class EmployeeRegTest extends AbstractTestNGCucumberTests 
{

}
