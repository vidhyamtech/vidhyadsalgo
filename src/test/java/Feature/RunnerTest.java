package Feature;


import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@logintag",features="src/test/resources/Feature",glue= {"StepDefinition"},monochrome =true
//plugin={"pretty","html:target/htmlReports/report.html"},
		)
public class RunnerTest {
	
	

}

