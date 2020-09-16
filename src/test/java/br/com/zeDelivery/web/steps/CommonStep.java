package br.com.zeDelivery.web.steps;

import br.com.zeDelivery.web.funcionalidades.CommonFunc;
import cucumber.api.java.pt.*;

public class CommonStep {

    CommonFunc commonFunc = new CommonFunc();

    @Dado("seleciono o botão \"([^\"]*)\"$")
    public void selecioonoOBotão(String botao) {
        commonFunc.clicarTexto(botao);
    }


    @Quando("clico no link \"([^\"]*)\"$")
    public void clicoNoLink(String link) {
        commonFunc.clicarTexto(link);
    }


}
