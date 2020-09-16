package br.com.zeDelivery.web.funcionalidades;

import br.com.commons.BaseTest;
import br.com.commons.VariaveisEstaticas;
import br.com.zeDelivery.web.pages.ProdutosPage;

import java.util.Random;

public class ProdutosFunc extends BaseTest {

    ProdutosPage produtosPage = new ProdutosPage(driver);
    Random random = new Random();

    public void pesquisaProduto(String produto){
        produtosPage.getCampoPesquisaProduto().sendKeys(produto);
        int qtdProdutos = produtosPage.getListaProdutos().size();
        int numeroProdutoSelecionado = random.nextInt(qtdProdutos);
        VariaveisEstaticas.setTitleProduto(produtosPage.getListaNomeProdutos().get(numeroProdutoSelecionado).getText());
        produtosPage.getListaProdutos().get(numeroProdutoSelecionado).click();
    }
}
