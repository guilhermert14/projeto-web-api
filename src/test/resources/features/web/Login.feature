#language: pt
#encoding: UTF-8
#author: Guilherme Teixeira
@web
Funcionalidade: Validar login de usuário

  @login
  Cenario: Validar login efetuado com sucesso
    Dado que entro na tela de login
    Quando realizo o login com o usuario "ze delivery"
    Então valido o login efetuado