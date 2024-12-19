package Feature;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(tags="",features="src/test/resources/Feature",
glue= {"StepDefinition"},monochrome =true,
plugin={"pretty","html:target/htmlReports/report.html"})
		
public class RunnerTest extends AbstractTestNGCucumberTests{
	
	

}


