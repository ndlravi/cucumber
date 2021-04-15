package runer;
import org.junit.runer.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Login", glue="StepDefinition")

dryrun=true,//check did i impletmet all the method/incase ifi mised any method
monochrome=true,//basivcally to get right formst in ocnsole
strict=true// check ctrictly wetehr any steps are missed in step defination
plugin = {"html:testout/ravi.html"}
  )

public class runner_Runner {
	

}
