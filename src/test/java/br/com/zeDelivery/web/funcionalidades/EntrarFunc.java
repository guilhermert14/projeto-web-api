package br.com.zeDelivery.web.funcionalidades;

import br.com.commons.BaseTest;
import br.com.enums.OpcoesUsuarios;
import br.com.interfaces.Usuarios;
import br.com.zeDelivery.web.pages.EntrarPage;

public class EntrarFunc extends BaseTest {

    EntrarPage entrarPage = new EntrarPage(driver);

    public void clicarLinkCadastrar(){
        entrarPage.getLinkCriarConta().click();
    }

    public void preenchoDadosUsuario(String user){
        Usuarios usuarios = OpcoesUsuarios.valueOf(user.toUpperCase().replace(" ", "_"));
        entrarPage.getCampoEmail().sendKeys(usuarios.email());
        entrarPage.getCampoSenha().sendKeys(usuarios.senha());
    }
}
