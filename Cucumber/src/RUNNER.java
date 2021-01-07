package ClassCucumber.Cucumbers;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/Nusrat/Desktop/Bittech/Cucumbers/src/login.feature"}, tags= {"@smoke"},
plugin = {"html:index"} )

public class RUNNER {

}
