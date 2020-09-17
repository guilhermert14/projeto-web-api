#language: pt
#encoding: UTF-8
#author: Guilherme Teixeira
Funcionalidade: Validar a chamada dos dados meteorológicos atuais para um local

  @localByName
  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pelo nome da cidade
    Quando realizo uma requisição GET no serviço pelo nome "Brazil"
    Então valido o nome "Brazil" no retorno do serviço

  @localById
  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pelo ID da cidade
    Quando realizo uma requisição GET no serviço pelo id da cidade "2172797"
    Então valido o id "2172797" no retorno do serviço

  @localByCoordinates
  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pela coordenada da cidade
    Quando realizo uma requisição GET no serviço pela coordenada da cidade lat "35" long "139"
    Então valido a lat "35" long "139" no retorno do serviço

  @localByZipCode
  Cenario: Validar a chamada dos dados meteorológicos atuais para um local pelo código postal
    Quando realizo uma requisição GET no serviço pelo código postal "94040" do país "US"
    Então valido o país "US" no retorno do serviço

  @localByIds
  Esquema do Cenario: Validar a chamada dos dados meteorológicos atuais para um local vários ID's da cidade
    Quando realizo uma requisição GET no serviço pelos IDs <ids>
    Então valido a quantidade de <qtd> IDs no retorno da api

    Exemplos:
      | ids                             | qtd |
      | "524901,703448,2643743"         | "3" |
      | "524901,703448,2643743,2172797" | "4" |