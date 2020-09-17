package br.com.runTest;

import br.com.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {"pretty",
        "json:target/cucumber.json"}, features = {".//src//test//resources//features"},
        glue = {"br.com.zeDelivery.web.steps","br.com.zeDelivery.api.steps", "br.com.configuracao"},
        tags = "@cadastro")


public class RunTest extends BaseTest {
    @AfterClass
    public static void AfterTests() {
        if (driver != null) {
            closeWeb();

        }
    }
}
