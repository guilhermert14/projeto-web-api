package br.com.zeDelivery.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntrarPage {

    public EntrarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "create-account-link")
    private WebElement linkCriarConta;

    @FindBy(id = "login-mail-input-email")
    private WebElement campoEmail;

    @FindBy(id = "login-mail-input-password")
    private WebElement campoSenha;

    public WebElement getLinkCriarConta() {
        return linkCriarConta;
    }

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }
}
