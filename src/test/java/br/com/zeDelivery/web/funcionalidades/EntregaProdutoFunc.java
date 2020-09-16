package br.com.zeDelivery.web.funcionalidades;

import br.com.commons.BaseTest;
import br.com.zeDelivery.web.pages.EntregaProdutoPage;

public class EntregaProdutoFunc extends BaseTest {

    EntregaProdutoPage entregaProdutoPage = new EntregaProdutoPage(driver);

    public String getTitleProduto(){
        return entregaProdutoPage.getTitleProdutoSelecionado().getText();
    }
}
