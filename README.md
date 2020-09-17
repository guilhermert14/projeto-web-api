<h1 align="center">Automação Zé Delivery</h1>
<h1 align="center">
    <a href="https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html">🔗 Java</a>
    <a href="https://www.selenium.dev/">🔗 Selenium</a>
    <a href="http://cucumber.io/">🔗 Cucumber</a>
    <a href="https://rest-assured.io/">🔗 RestAssured</a>
    <a href="https://junit.org/junit5/">🔗 jUnit</a>
    <a href="https://github.com/DiUS/java-faker">🔗 Faker</a>

</h1>
<p align="center">🚀 Projeto de automação de testes utilizando as técnicas da metodologia BDD.</p>


## Começando

Para executar o projeto, será necessário instalar os seguintes programas:

- [JDK 8: Necessário para executar o projeto Java](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven 3.6.3: Necessário para realizar o build do projeto Java](https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)

*Não Esqueça de configurar as variáveis de ambiente para execução.
- [Tutorial para configuração das variáveis](https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26#:~:text=Bom%2C%20mas%20o%20que%20s%C3%A3o,arquivos%20necess%C3%A1rios%2C%20inclusive%20os%20bin%C3%A1rios.)
- [IntelliJ: Para desenvolvimento do projeto](https://www.jetbrains.com/pt-br/idea/) 
                                                                  
*Instale também os plugins Gherkin e Cucumber for Java.

- [Git: Para versionamento e clone do projeto](https://github.com/guilhermert14/projeto_web_api)


## Execução Via Terminal

É possível executar o projeto via linha de comando. Após configurar as variáveis de ambiente abra o terminal.

```bash
# clonando projeto do git
$ git clone https://github.com/guilhermert14/projeto_web_api.git

# acesse a pasta do projeto
$ cd ze-delivey

# execute o comando do maven para execução dos testes.
$ mvn clean install && test
```

## Execução via IDE

```bash
├───browser    - Contém o chromeWebDriver 
│   ├───mac                                        
│   └───windows                                                                      
├───src                                               
│   ├───main                                          
│   │   ├───java                                      
│   │   │   └───br                                    
│   │   │       └───com                               
│   │   │           └───commons                        
│   │   │           ├───configuracao             
│   │   │           ├───enums           
│   │   │           ├───interfaces      
│   │   │           ├───relatorios  
│   │   └───resources     - Properties do projeto. 
│   └───test                                          
│       ├───java                                      
│       │   └───br                                    
│       │       └───com                               
│       │           └───runTest   - Classe de execução dos testes.
│       │           ├───zeDelivery                       
│       │               ├───api
|       |               |    └───funcionalidades    - Interações com a api.
|       |               |    └───steps              - Steps de testes cucumber
│       │               └───web 
|       |                   └───funcionalidades     - Interações com a tela.
|       |                   └───pages               - Mapeamento de elementos
|       |                   └───steps               - Steps de testes cucumber
│       └───resources                                 
│           └───features  - Cenários de Teste no formato Gherkin
│               ├───api 
│               └───web  
```

O arquivo que deve ser executado encontra-se:
```bash
# src/test/java/br/com/runTest/RunTest.java

# Utilizar a tag para rodar os cénarios que deseja.
# Exemplo:
tags = {"@cadastro"})

```

#### [IntelliJ] Para executar o projeto basta clicar com o botão direito do mouse -> Run 'RunTest'

## StatusReport
####  Após rodar o cénario, execute a classe GenerateHTMLReport que está localizada em: 
```bash
src/main/java/br/com/relatorios/GenerateHTMLReport
```
Para executar a classe, basta clicar com o botão direito do mouse -> Run 'GenerateHTMLReport()'


## Fluxos escolhidos
####  Cadastro - critical flows
O cadastro é o fluxo mais importante porque não poderá concluir uma compra sem fornecer os dados pessoais para a entrega dos produtos que o usuário deseja.
####  Login
O login é um fluxo importante porque o usuário necessita informar o login para seguir com a compra dos produtos.
####  Pesquisa Produto
O fluxo de pesquisa de produto é importante porque o usuário deve informar o produto que ele deseja comprar.

## Diretrizes das decisões tomadas 
####  Linguagem de programação escolhida: Java
É a linguagem que eu possuo mais experiência.
####  Design Pattern: Page Factory 
Utilizei o page factory na estruturação do projeto. A instâcia do driver é feita na page. 
A tag @FindBy possui o mesmo conceito do comando driver.findElement().
Utilizando o page factory melhora a otimização do projeto, separando melhor a função de cada cada pacote. 


