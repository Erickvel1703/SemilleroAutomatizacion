package co.com.falabella.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        tags = "",
        glue = "co.com.falabella.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class LoginRunner {
}
