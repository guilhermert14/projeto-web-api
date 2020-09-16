package br.com.zeDelivery.web.steps;

import br.com.zeDelivery.web.funcionalidades.CommonFunc;
import br.com.zeDelivery.web.funcionalidades.HomeFunc;
import cucumber.api.PendingException;
import cucumber.api.java.pt.*;
import org.junit.Assert;

public class HomeStep {

    CommonFunc commonFunc = new CommonFunc();
    HomeFunc homeFunc = new HomeFunc();


    @Dado("que entro na tela de login")
    public void queEntroNaTelaDeLogin() {
        homeFunc.selecionoOpcaoDeMaioridade("sim");
        homeFunc.selecionoAceitarCoockies();
        commonFunc.clicarTexto("Entrar");

    }

    @E("^insiro o endereço \"([^\"]*)\"$")
    public void insiroOEndereço(String endereco) {
        homeFunc.insereEndereco(endereco);
        homeFunc.insereNumero("12");
        homeFunc.insereComplemento("Casa");
        commonFunc.clicarTexto("Ver produtos disponíveis");
    }

    @Então("valido o login efetuado")
    public void validoOLoginEfetuado() {
        Assert.assertEquals("Conta e pedidos", homeFunc.getContaPedidos());
    }


    @Dado("^seleciono maioridade \"([^\"]*)\"$")
    public void selecionoMaioridade(String opcao) {
        homeFunc.selecionoOpcaoDeMaioridade(opcao);
        homeFunc.selecionoAceitarCoockies();
    }
}
