# tricentis-selenium-cucumber

Projeto de teste criado para automação de testes da url http://sampleapp.tricentis.com/101/app.php utilizando Selenium Webdriver e Cucumber, utilizando Page Objects.

Para rodar o projeto, após importar no eclipse, executar a classe TricentisCucumberRunner (src/test/java -> pacote br.com.tricetis.runner) como JUnit Test.

Estrutura do projeto:

- src/test/java:
    - br.com.tricentis.pages: onde estão os page objects
    - br.com.tricentis.runner: onde está o runner que conecta o Cucumber com o JUnit
    - br.com.tricentis.steps: onde está a classe com os steps para execução dos testes
- src/test/resources:
    - features: onde está a feature com descrição dos cenários de teste
- drivers: onde está o driver do chrome para execução da automação pelo selenium
- fotos: onde estão as fotos utilizadas nos testes para realizar upload
