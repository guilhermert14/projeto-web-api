package br.com.enums;

import br.com.interfaces.BrowserApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Browsers implements BrowserApplication {

    CHROME_WINDOWS {
        @Override
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "browser/windows/chromedriver.exe");
            return new ChromeDriver();
        }
    },

    CHROME_MAC {
        @Override
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "browser/mac/chromedriver");
            return new ChromeDriver();
        }
    }

}
