#language: pt
#encoding: UTF-8
#author: Guilherme Teixeira
@web
Funcionalidade: Cadastro de usuário

  @cadastro @criticalFlow
  Cenario: Validar mensagem de sucesso ao cadastrar um usuário
    Dado que entro na tela de login
    E realizo o cadastro com dados "validos"
    Quando clico no link "validar mais tarde"
    Então valido o login efetuado
