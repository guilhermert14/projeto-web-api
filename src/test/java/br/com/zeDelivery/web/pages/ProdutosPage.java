package br.com.zeDelivery.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProdutosPage {

    public ProdutosPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-product-input")
    private WebElement campoPesquisaProduto;

    @FindBy(xpath = "//div[@class='css-kzmtws-productCard']")
    private List<WebElement> listaProdutos;

    @FindBy(xpath = "//div[@class='css-kzmtws-productCard']/child::div/child::span[not(contains(@class, 'css-1exom2j-discountBadge'))]")
    private List<WebElement> listaNomeProdutos;

    public WebElement getCampoPesquisaProduto() {
        return campoPesquisaProduto;
    }

    public List<WebElement> getListaProdutos() {
        return listaProdutos;
    }

    public List<WebElement> getListaNomeProdutos() {
        return listaNomeProdutos;
    }
}
