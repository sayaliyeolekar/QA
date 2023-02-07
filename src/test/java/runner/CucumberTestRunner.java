package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
                   (
		  
		               features= {"src/test/java/buisnesslogic/createincident.feature"},
		               glue= {"cucumbermap","hook"},
		               monochrome=true,
		               plugin= {"pretty"}
		  
		           )











public class CucumberTestRunner extends AbstractTestNGCucumberTests
{

	
	
}
