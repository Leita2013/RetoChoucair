package co.com.choucair.reto.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/co.com.choucair.reto.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE )


public class RunnerReto {
}
