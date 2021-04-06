package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/ahmedshuily/eclipse-workspace"
		+ "/WelmertBDDPOM/src/main/java/features",
		glue="Step_Defination",
		plugin={"pretty","html:target/Walmart-Report"},
		monochrome = true)

public class TestRunner {

}
