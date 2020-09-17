package br.com.zeDelivery.web.funcionalidades;

import br.com.commons.BaseTest;
import br.com.zeDelivery.web.pages.HomePage;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage(driver);
    CommonFunc commonFunc = new CommonFunc();

    public void selecionoOpcaoDeMaioridade(String opcao) {
        if (opcao.toLowerCase().equals("sim")) {
            homePage.getOpcaoSimIframe().click();
        } else {
            homePage.getOpcaoNaoIframe().click();
        }

    }

    public void selecionoAceitarCoockies() {

        if (commonFunc.verificaElementoVisivel(homePage.getXpathBotaoAceitarCookies())) {
            commonFunc.clicarJs(homePage.getBotaoAceitarCookies());
        }

    }

    public String getContaPedidos(){
        return homePage.getLinkContaPedidos().getText();
    }

    public void insereEndereco(String endereco){
        homePage.getPesquisaEndereco().click();
        homePage.getCampoPesquisaEndereco().sendKeys(endereco);
        homePage.getListaEndereco().get(0).click();
    }

    public void insereComplemento(String complemento){
        homePage.getCampoComplemento().sendKeys(complemento);
    }

    public void insereNumero(String numero){
        homePage.getCampoNumero().sendKeys(numero);
    }




}
