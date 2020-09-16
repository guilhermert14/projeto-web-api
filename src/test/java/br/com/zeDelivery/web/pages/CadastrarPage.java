package br.com.zeDelivery.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastrarPage {

    public CadastrarPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "signup-form-input-name")
    private WebElement campoNomeSobrenome;

    @FindBy(id = "signup-form-input-email")
    private WebElement campoEmail;

    @FindBy(id = "signup-form-input-password")
    private WebElement campoSenha;

    @FindBy(id = "signup-form-input-document")
    private WebElement campoCpf;

    @FindBy(id = "signup-form-input-phone")
    private WebElement campoCelular;

    @FindBy(id = "signup-form-input-age")
    private WebElement campoIdade;

    @FindBy(id = "sign-up-form-input-terms")
    private WebElement checkboxAceitoTermos;

    String xpathCheckboxAceitoTermos = "//input[@id='sign-up-form-input-terms']";

    @FindBy(id = "signup-form-button-signup")
    private WebElement botaoContinuar;

    public WebElement getCampoNomeSobrenome() {
        return campoNomeSobrenome;
    }

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public WebElement getCampoCpf() {
        return campoCpf;
    }

    public WebElement getCampoCelular() {
        return campoCelular;
    }

    public WebElement getCampoIdade() {
        return campoIdade;
    }

    public WebElement getCheckboxAceitoTermos() {
        return checkboxAceitoTermos;
    }

    public WebElement getBotaoContinuar() {
        return botaoContinuar;
    }

    public String getXpathCheckboxAceitoTermos() {
        return xpathCheckboxAceitoTermos;
    }
}
