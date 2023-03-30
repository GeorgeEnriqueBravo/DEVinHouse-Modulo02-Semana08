# Bem vindo à DEVinHouse <img width="180px" alt="Philips" src="ExerciciosM02S08/images/logo-phil.png"/>
## Módulo 02 - Semana 08

Repositório criado para a elaboração dos 10 exercícios referentes a essa semana. <br>

Para visualizar os exercícios, <a href="https://github.com/GeorgeEnriqueBravo/DEVinHouse-Modulo02-Semana08/archive/refs/heads/main.zip" target="_blank">
    clique aqui
</a>
para baixa-los. <br>

Após o download, abra a pasta "ExerciciosM02S08" utilizando o software `IntelliJ`. Para baixar a última versão grátis do IntelliJ 
<a href="https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC" target="_blank">
    clique aqui
</a>.
  
---

# Lista de exercícios <img width="75px" alt="Philips" src="ExerciciosM02S08/images/lista.png"/>
### [M2S08] Ex 1 - Guarda empresas

Criei uma aplicação Servlet, que receberá uma requisição http no seguinte formato:

http://localhost:8080/HelloWorld/novaEmpresa?nome=Empresa

Esse programa deve exibir o nome da empresa na tela e no terminal da aplicação.

### [M2S08] Ex 2 - Lista empresas

- Crie um programa que recebe o nome de uma empresa com o CNPJ em um método doPost por meio de um formulário.
- Armazene essa empresa em uma lista.
- Ao chamarmos um método doGet o cliente deve receber uma lista dos nomes das empresas cadastradas anteriormente.

### [M2S08] Ex 3 - Projeto Maven

- Crie um novo projeto Maven em sua IDE e uma classe Cliente.
- Baixe uma dependência utilizando o pom.
- Comprove que ela foi baixada no diretório onde o Maven mantém as dependências localmente, através de um print.
- A dependência fica a critério do aluno.
- Por fim, o Aluno deve executar o comando packge e o comando install.

### [M2S08] Ex 4 - Projeto Modular Maven

- Crie um novo projeto e dentro dele 3 módulos com a IDE de sua escolha.
- Na raiz do projeto deve adicionar uma dependência de sua escolha e 2 módulos como dependências do 3º.

### [M2S08] Ex 5 - Cliente

Crie um Projeto Spring Framework que tenha uma entidade "Cliente".
O programa deve ser capaz de:

- Criar um novo objeto Cliente.
- Pesquisar todos os Clientes
- Deletar um Cliente específico com base no seu ID
- Alterar um Cliente com base no seu ID
- Pesquisar um Cliente com base no seu ID
- O Cliente precisa ter um nome e o CPF e o serviço de validação do CPF antes de criar um novo cliente.

### [M2S08] Ex 6 - Conta e Cliente

No Projeto Spring Framework, adicione uma entidade Conta.
O programa deve ser capaz de:

- Criar um novo objeto Conta
- Pesquisar todos os objetos Conta
- Deletar um objeto Conta específico com base no seu ID
- Alterar um objeto Conta com base no seu ID
- Pesquisar um objeto Conta com base no seu ID
- A Conta deve ter um cliente vinculado a ela e ser criada com um valor zerado.
- Deve ser possível realizar depósitos e saques de valores de uma Conta, porém o valor na Conta nunca pode ficar negativo.

### [M2S08] Ex 7 - Conte e Cliente na Web

Com base no programa criado com o Spring Framework, crie um programa Spring Boot que nos permita realizar o cadastro e a consulta das entidades "Conta" e "Cliente".
Essas funcionalidades devem ser feitas por meio de requisições HTTP:

- As requisições devem ser POST para cadastro e GET para consulta.
- As requisições devem ser feitas nos endpoints /cliente e no /conta.
- As requisições devem ser no padrão JSON.

### [M2S08] Ex 8 - Conta e Cliente com Memória de curto prazo

Agora expandindo as funcionalidades do programa anterior, devemos ser capazes de realizar todas as operações CRUD(Create, Read, Update, Delete) tanto para a "Conta" quanto para o "Cliente".

- Os endpoints devem ser os mesmos
- A operação de Update deve ser feita por meio do PUT e deve usar o ID da entidade em questão, seja ela Cliente ou Conta.
- A operação de Delete deve ser feita por meio do Delete, e deve também usar o ID da entidade em questão.

### [M2S08] Ex 9 - Adicionando Verificações e Transferência

Adicione as verificações que já existiam anteriormente e também crie um endpoint /conta/transfere que ao receber um método PUT com o ID de 2 contas, fará a transferência do valor de uma delas para a outra.

O corpo da resposta tem que ter o novo valor de cada uma das contas no formato JSON.

### [M2S08] Ex 10 - Mensagens de Erro

- Adicione mensagens de ERRO que serão retornadas no formato JSON para cada método que podemos realizar.
No corpo dessas mensagens deve constar o método e a classe onde o ERRO ocorreu, bem como a descrição do ERRO fornecida no catch.
- Deve ser retornado no formato JSON.
- As mensagens devem ser enviadas com um status apropriado.


---

# O que é DEVinHouse?
DEVinhouse é uma jornada de aceleração da carreira com: grade curricular direcionada, professores do mercado, prática constante, interação frequente com as houses parceiras de cada turma, simulação do dia-a-dia DEV e vagas exclusivas que são abertas pelas Houses durante a jornada.

No DEVinHouse você vira um desenvolvedor Fullstack em 9 meses, ao longo de 900 horas de conteúdo, divididas em três módulos de 3 meses cada, com intervalo de uma semana entre cada um. Aproximadamente 25 horas de dedicação por semana entre aulas, atividades e vivências.

__1º módulo:__ Front-End – JavaScript e Angular <br/>
__2º módulo:__ Back-End – Java, Spring e SQL <br/>
__3º módulo:__ Full-Stack – Scrum, DevOps, Clean Code e Design Patterns <br/>
__Ferramentas__ – GitHub, Trello e Slack

---

# Tecnologias Utilizadas <img width="35px" alt="🌐" src="ExerciciosM02S08/images/tag.gif"/>
Nos exercícios dessa semana foram utilizadas as seguintes tecnologias:
<div style="display: inline_block">
    <img align="center" alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
    <img align="center" alt="Spring" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
    <img align="center" alt="Intellij" src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
    <img align="center" alt="Trello" src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white"/>
    <img align="center" alt="GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/>
</div>
