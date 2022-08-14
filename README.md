# TI Academy 3.6 Desafio - Java Spring Boot

Duas possibilidades de projeto realizados com base nos parâmetros estipulados pelo desafio da disciplina.

## Estrutura do repositório

&rarr; 📁 **atividade-01** &rarr; Pasta com a primeira atividade

------&rarr; 📁 **biblioteca** &rarr; Aplicação gerenciadora do banco de dados de autores, editoras e livros

------&rarr; 📁 **times** &rarr; Aplicação gerenciadora do banco de dados de jogadores e clubes de futebol

------&rarr; 📁 **exemploBancoDeDados** &rarr; Pasta com arquivos .ibd e screenshots do Postman a título de exemplo de uma utilização de cada aplicação.


&rarr; 📁 **atividade-02** &rarr; Pasta com a segunda atividade

------&rarr; 📁 **times** &rarr; Adição de relacionamento entre as tabelas e diversas rotas de consulta.

------&rarr; 📁 **exemploBancoDeDados** &rarr; Pasta com arquivos .ibd e screenshots do Postman a título de exemplo de uma utilização da aplicação.


## 1- Base de Dados de Jogadores e Clubes de Futebol

Trata-se de um banco de dados com aplicação para um serviço de estatísticas esportivas.

- `1 Jogador:` Que possui id, nome, posição e idade.
- `2 Clube:` Que possui id, nome, série, ranking IFFHS (Federação Internacional de História e Estatísticas do Futebol) e ano de fundação.

Relacionamento Many to One entre Jogador e Clubes:

- `1 Jogador:` Possui uma clube.
- `2 Clube:` Possui vários jogadores.

Uma possibilidade adicional seria a implicamentação de tabelas para as diversas federações de Futebol no mundo e as diversas competições como Libertadores, Copa do Brasil, Champions League, etc.

Além disso existem várias consultas implementadas:

- `1 Jogador:` Consulta por nome, posição ou idade, customizável própria rota de acesso através de Path Variables.
- `2 Clube:` Consulta por nome, serie, rank ou ano de fundação customizável própria rota de acesso através de Path Variables.

## 2- Base de Dados de Autores, Editoras e Livros

Trata-se de um banco de dados com aplicação para uma biblioteca com as seguintes tabelas.

- `1 Autor:` Que possui id, nome, ano de nascimento e ano de falecimento.
- `2 Editora:` Que possui id, nome e ano de fundação.
- `3 Livro:` Que possui id, nome, genero, ano de lançamento e quantidade de páginas.

Implementação desta base de dados realizada apenas para a atividade 1, logo não existem estruturas relacionais ou consultas, porém uma possibilidade seria:

- `1 Autor:` Possui vários livros e uma editora.
- `2 Editora:` Possui vários autores e vários livros.
- `3 Livro:` Possui um autor e uma editora.

## 💡 Importante

Favor verificar e modificar o arquivo **`application.properties`** situado em **`\src\main\resources`** conforme necessário para acessar/criar um novo banco de dados para confirmar o funcionamento das aplicações.

Liquibase **dbchangelog.xsd** e **liquibase-pro.xsd** utilizadas na versão 4.3 pois outras como 4.12 ou 4.14 estavam causando erros de compilação da aplicação.
