package br.com.zeDelivery.web.steps;

import br.com.commons.VariaveisEstaticas;
import br.com.zeDelivery.web.funcionalidades.EntregaProdutoFunc;
import cucumber.api.java.pt.Então;
import org.junit.Assert;

public class EntregaProdutoStep {

    EntregaProdutoFunc entregaProdutoFunc = new EntregaProdutoFunc();

    @Então("^valido o produto selecionado$")
    public void validoOProdutoSelecionado() {
        Assert.assertEquals(VariaveisEstaticas.getTitleProduto(), entregaProdutoFunc.getTitleProduto());
    }
}
