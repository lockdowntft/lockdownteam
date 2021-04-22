package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/ahmedshuily/eclipse-workspace/lockdownteam/src/main/java/features",
							glue="step_defination",
							plugin= {"pretty","html:target/TFT-Report"},
							monochrome=true)
public class TestRunner {

}
