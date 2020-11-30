package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\user1\\eclipse-workspace\\CucumberJava\\src\\main\\java\\Features\\deals.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			//monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
			plugin = {"pretty","html:test-outout", "junit:junit_xml/cucumber.xml"}, //"json:json_output/cucumber.json", , //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			//strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file, first make it true to check if mapping is proper then make it false
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
