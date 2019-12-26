package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\VinayKrishna141\\eclipse-workspace\\CucumberFramework\\src\\main\\java\\Features\\login.feature",
		glue= {"StepDefinition"},
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, //to generate different types of report
		monochrome=true, //to display output in proper readable format
		strict=true,//it will check if any step is not defined in stepDefinition file
		dryRun=false //to check the mapping is proper between feature file and stepDefinition file- true->chrome not launched : false->chrome launched
		//tags= {"~@SmokeTest","~@RegressionTest","~@End2End"}	
		)

public class TestRunner {
	 

}
 
// ORed  : tags= {"@SmokeTest,@RegressionTest"}	-execute all test tags tagged as @SmokeTest OR @RegressionTest		==15 test cases
// ANDed : tags= {"@SmokeTest","@RegressionTest"}	-execute all test tags tagged as @SmokeTest AND @RegressionTest	==5 test cases
 		//tags= {"@SmokeTest"} --13 test cases
		//tags= {"@End2End"}   --6 test cases
		//tags= {"@RegressionTest"}  --7 test cases
		//tags= {"@SmokeTest,@RegressionTest"}	//--15 test cases(OR)
		//tags= {"@SmokeTest","@RegressionTest"}	//--5 test cases(AND)
		//tags= {"~@SmokeTest","@RegressionTest"}	// ignore smoke test using '~' , 2 test cases w.r.t Regression test only
		//tags= {"~@SmokeTest","~@RegressionTest"}	//ignore both smoke and regression tests. , 2 test cases which are related End2End test
		//tags= {"~@SmokeTest","~@RegressionTest","~@End2End"}	//1 test case which is not tagged with any Test is dispalyed