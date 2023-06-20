package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features/T001Login.feature",
                         glue="steps",
                         monochrome=true,
                         publish=true)
public class T001CucumberRunner extends AbstractTestNGCucumberTests{

}