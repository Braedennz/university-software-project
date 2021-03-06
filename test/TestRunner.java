import cucumber.api.CucumberOptions ;
import org.junit.runner.RunWith ;
import cucumber.api.junit.Cucumber ;
import cucumber.api.SnippetType ;

@RunWith ( Cucumber.class )
@CucumberOptions (
        features = "classpath:features",
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"},
        glue = "javaSteps.steps",
        snippets = SnippetType.CAMELCASE)

public class TestRunner {
    
}
