package br.com.zeDelivery.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "age-gate-button-yes")
    private WebElement opcaoSimIframe;

    @FindBy(css = "#age-gate-button-no")
    private WebElement opcaoNaoIframe;

    @FindBy(xpath = "//button[@title='Aceitar cookies']")
    private WebElement botaoAceitarCookies;

    @FindBy(id = "welcome-button-sign-in")
    private WebElement botaoEntrar;

    String xpathBotaoAceitarCookies = "//button[@title='Aceitar cookies']";

    @FindBy(xpath = "//a[@class='css-6e10nj-textBase-account']")
    private WebElement linkContaPedidos;

    @FindBy(id = "fake-address-search-input")
    private WebElement pesquisaEndereco;

    @FindBy(id = "address-search-input-address")
    private WebElement campoPesquisaEndereco;

    @FindBy(xpath = "//li[@itemid='google-address']")
    private List<WebElement> listaEndereco;

    @FindBy(id = "address-details-input-complement")
    private WebElement campoComplemento;

    @FindBy(id = "address-details-button-continue")
    private WebElement botaoVerProdutosDisponiveis;

    @FindBy(id = "address-details-input-number")
    private WebElement campoNumero;

    public WebElement getOpcaoSimIframe() {
        return opcaoSimIframe;
    }

    public WebElement getOpcaoNaoIframe() {
        return opcaoNaoIframe;
    }

    public WebElement getBotaoAceitarCookies() {
        return botaoAceitarCookies;
    }

    public String getXpathBotaoAceitarCookies() {
        return xpathBotaoAceitarCookies;
    }

    public WebElement getLinkContaPedidos() {
        return linkContaPedidos;
    }

    public WebElement getBotaoEntrar() {
        return botaoEntrar;
    }

    public WebElement getPesquisaEndereco() {
        return pesquisaEndereco;
    }

    public List<WebElement> getListaEndereco() {
        return listaEndereco;
    }

    public WebElement getCampoComplemento() {
        return campoComplemento;
    }

    public WebElement getBotaoVerProdutosDisponiveis() {
        return botaoVerProdutosDisponiveis;
    }

    public WebElement getCampoNumero() {
        return campoNumero;
    }

    public WebElement getCampoPesquisaEndereco() {
        return campoPesquisaEndereco;
    }
}
