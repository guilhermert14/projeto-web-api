package br.com.zeDelivery.web.steps;

import br.com.zeDelivery.web.funcionalidades.ProdutosFunc;
import cucumber.api.java.pt.Quando;

public class ProdutosStep {

    ProdutosFunc produtosFunc = new ProdutosFunc();

    @Quando("^pesquiso pelo produto \"([^\"]*)\"$")
    public void pesquisoPeloProduto(String produto) {
        produtosFunc.pesquisaProduto(produto);
    }


}
