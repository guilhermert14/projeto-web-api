package br.com.zeDelivery.web.funcionalidades;

import br.com.commons.BaseTest;
import br.com.commons.PropertiesManager;
import br.com.zeDelivery.web.pages.CadastrarPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CadastrarFunc extends BaseTest {

    CadastrarPage cadastrarPage = new CadastrarPage(driver);
    CommonFunc commonFunc = new CommonFunc();



    public void preencherCadastro(String opcao){
        cadastrarPage.getCampoNomeSobrenome().sendKeys(dataGenerator.getNomeCompleto());
        cadastrarPage.getCampoEmail().sendKeys(dataGenerator.getEmail());
        cadastrarPage.getCampoSenha().sendKeys(dataGenerator.getSenha());
        cadastrarPage.getCampoCpf().sendKeys(PropertiesManager.getPropertiesValue("CPF"));
        cadastrarPage.getCampoCelular().sendKeys(dataGenerator.getCelular());

        if (opcao.toLowerCase().equals("valido") || opcao.toLowerCase().equals("validos")) {
            cadastrarPage.getCampoIdade().sendKeys("20");
        }else {
            cadastrarPage.getCampoIdade().sendKeys("17");
        }
        commonFunc.clicarJs(cadastrarPage.getCheckboxAceitoTermos());
        commonFunc.clicarJs(cadastrarPage.getBotaoContinuar());

    }


}
