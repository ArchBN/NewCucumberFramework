package RunTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//nbhat//IdeaProjects//NewCucumberFramework//src//test//resources//NewFeatures//Banklogin.feature",
        glue = {"Banksteps"},
        monochrome=true,
        plugin=  {"json:target/cucumber.json"}
)
public class NewRunTest {
}
