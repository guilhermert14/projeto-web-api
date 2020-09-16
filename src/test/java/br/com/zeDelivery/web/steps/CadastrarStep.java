package br.com.zeDelivery.web.steps;

import br.com.zeDelivery.web.funcionalidades.CadastrarFunc;
import br.com.zeDelivery.web.funcionalidades.EntrarFunc;
import cucumber.api.java.pt.E;

public class CadastrarStep {

    CadastrarFunc cadastrarFunc = new CadastrarFunc();
    EntrarFunc entrarFunc = new EntrarFunc();

    @E("realizo o cadastro com dados \"([^\"]*)\"$")
    public void realizoOCadastroComDados(String opcao) {
        entrarFunc.clicarLinkCadastrar();
        cadastrarFunc.preencherCadastro(opcao);
    }
}
