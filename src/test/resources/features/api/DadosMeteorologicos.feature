#language: pt
#encoding: UTF-8
#author: Guilherme Teixeira
Funcionalidade: Validar a chamada dos dados meteorológicos atuais para um local

  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pelo nome da cidade
    Quando realizo uma requisição GET no serviço pelo nome "Brazil"
    Então valido o retorno "200"

  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pelo ID da cidade
    Quando realizo uma requisição GET no serviço pelo id da cidade "2172797"
    Então valido o retorno "200"

  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pela coordenada da cidade
    Quando realizo uma requisição GET no serviço pela coordenada da cidade long "" lat ""
    Então valido o retorno "200"

  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pelas cidades dentro de uma zona retângulo
    Quando realizo uma requisição GET no serviço pelas cidades "12,32,15,37,10"
    Então valido o retorno "200"