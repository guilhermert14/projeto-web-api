package br.com.zeDelivery.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntregaProdutoPage {

    public EntregaProdutoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='css-aibq80-productTitle']")
    private WebElement titleProdutoSelecionado;

    public WebElement getTitleProdutoSelecionado() {
        return titleProdutoSelecionado;
    }
}
