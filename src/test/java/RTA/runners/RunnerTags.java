package RTA.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/RTA.feature",
        tags = "@stories",
        glue = "RTA.stepdefinitions",
        snippets= SnippetType.CAMELCASE)


public class RunnerTags {
}
