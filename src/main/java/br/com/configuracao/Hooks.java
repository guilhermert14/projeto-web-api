package br.com.configuracao;

import br.com.commons.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Hooks extends BaseTest {

    @Before(value = "@web")
    public void beforeScenarioWebWindows() {
        System.out.println("Teste execução Hooks Web");
        initializeWebApplication();
    }

    @After(value = "@web")
    public void afterScenarioWeb(Scenario scenario) {
        printImageReport(scenario);
        closeWeb();
    }

    private void printImageReport(Scenario scenario) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] data = FileUtils.readFileToByteArray(scrFile);
            scenario.embed(data, "image/png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
