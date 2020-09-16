package br.com.commons;

import br.com.enums.Browsers;
import br.com.interfaces.BrowserApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected BrowserApplication browserApplication;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static DataGenerator dataGenerator = new DataGenerator();

    /**
     * Inicializa o {@code driver}
     */
    protected void initializeWebApplication() {
        if (getOsName().toLowerCase().contains("win")) {
            browserApplication = Browsers.CHROME_WINDOWS;
            driver = browserApplication.getDriver();
            driver.manage().window().maximize();
        } else {
            browserApplication = Browsers.CHROME_MAC;
            driver = browserApplication.getDriver();
            driver.manage().window().fullscreen();
        }
        driver.get(PropertiesManager.getPropertiesValue("URL_QA"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
    }

    /**
     * fecha o driver web
     */
    protected static void closeWeb() {
        driver.quit();
    }

    protected String getOsName() {
        return System.getProperty("os.name");
    }

}
