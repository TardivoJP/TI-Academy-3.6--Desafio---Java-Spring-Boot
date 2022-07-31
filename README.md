# TI Academy 3.6 Desafio - Java Spring Boot

Projeto realizado com base nos parâmetros estipulados pelo desafio da disciplina.

Trata-se de um banco de dados com aplicação para uma biblioteca com as seguintes tabelas.

- `1 Autor:` Que possui id, nome, ano de nascimento e ano de falecimento.
- `2 Editora:` Que possui id, nome e ano de fundação.
- `3 Livro:` Que possui id, nome, genero, ano de lançamento e quantidade de páginas.

Posteriormente conforme o desenvolvimento das aulas e próximos desafios será implementada uma estrutura relacional entre as tabelas.

- `1 Autor:` Possui vários livros e uma editora.
- `2 Editora:` Possui vários autores e vários livros.
- `3 Livro:` Possui um autor e uma editora.

### Estrutura do repositório

&rarr; 📁 **biblioteca** &rarr; Aplicação gerenciadora do banco de dados

&rarr; 📁 **exemploBancoDeDados** &rarr; Pasta com arquivos .ibd e screenshots do Postman a título de exemplo de uma utilização da aplicação.

### 💡 Importante

Favor verificar e modificar o arquivo **`application.properties`** situado em **`biblioteca\src\main\resources`** conforme necessário para acessar/criar um novo banco de dados para confirmar o funcionamento da aplicação.
