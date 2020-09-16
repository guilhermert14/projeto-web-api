#language: pt
#encoding: UTF-8
#author: Guilherme Teixeira
@web
Funcionalidade: Validar a pesquisa de produtos

  Contexto:
    Dado seleciono maioridade "sim"

  @pesquisaProduto
  Esquema do Cenario: Validar a pesquisa do produto <produto>
    Dado insiro o endereço "rua minneapolis 2 S F"
    Quando pesquiso pelo produto <produto>
    Então valido o produto selecionado

    Exemplos:
      | produto    |
      | "Brahma"   |
      | "Skol"     |

