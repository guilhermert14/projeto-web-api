package br.com.zeDelivery.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmarTelefonePage {

    public ConfirmarTelefonePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "confirm-phone-link-validate-later")
    private WebElement linkConfirmarDepois;

    public WebElement getLinkConfirmarDepois() {
        return linkConfirmarDepois;
    }
}
