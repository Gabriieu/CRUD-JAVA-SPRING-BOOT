# CRUD de Usuários em Java com Spring Boot

Este é um projeto simples de CRUD (Create, Read, Update, Delete) de usuários, desenvolvido em Java utilizando o framework Spring Boot. Ele oferece operações básicas para gerenciar informações de usuários, como criação, leitura, atualização e exclusão.

# Requisitos do Sistema
Java 17
<br/>
Maven
<br/>
MySQL (ou outro banco de dados configurado)

# Configuração do Banco de Dados
O projeto utiliza o Spring Data JPA e está configurado para se integrar ao MySQL. Certifique-se de criar um banco de dados e configurar as credenciais no arquivo application.properties.

# Endpoints da API
**URL base:** `localhost:8080/api/v1`
<br/>

### ***A API fornece os seguintes endpoints:***

`POST /users` *Cria um novo usuário.*
<br/>
<br/>
`GET /users/all` *Retorna todos os usuários cadastrados.*
<br/>
<br/>
`GET /users/{id}` *Retorna os detalhes de um usuário por id.*
<br/>
<br/>
`GET /users/name/{username}` *Retorna os detalhes de um usuário por username.*
<br/>
<br/>
`PATCH /users/{id}` *Atualiza as informações de um usuário.*
<br/>
<br/>
`DELETE /users/{id}` *Exclui um usuário.*

# Bibliotecas Utilizadas
**Spring Boot Starter Data JPA:** Suporte para persistência de dados.
<br/>
**Spring Boot Starter Validation:** Validação de dados.
<br/>
**Spring Boot Starter Web:** Suporte para desenvolvimento de aplicativos web.
<br/>
**Spring Boot DevTools:** Ferramentas para desenvolvimento mais eficiente.
<br/>
**MySQL Connector/J:** Conector JDBC para MySQL.
<br/>
**Lombok:** Para reduzir códigos repetitivos.
<br/>
**ModelMapper:** Facilita o mapeamento de objetos.
<br/>
**Spring Boot Starter Security:** Suporte básico para segurança.
<br/>
**Spring Boot Starter Test:** Suporte para testes.
