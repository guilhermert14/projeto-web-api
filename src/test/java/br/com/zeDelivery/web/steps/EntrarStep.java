package br.com.zeDelivery.web.steps;

import br.com.zeDelivery.web.funcionalidades.CommonFunc;
import br.com.zeDelivery.web.funcionalidades.EntrarFunc;
import cucumber.api.java.pt.*;

public class EntrarStep {

    EntrarFunc entrarFunc = new EntrarFunc();
    CommonFunc commonFunc = new CommonFunc();

    @Quando("realizo o login com o usuario \"([^\"]*)\"$")
    public void realizoOLoginComOUsuario(String usuario) {
        entrarFunc.preenchoDadosUsuario(usuario);
        commonFunc.clicarTexto("Entrar");
    }


}
