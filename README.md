# CRUD de Usuários em Java com Spring Boot

Este é um projeto simples de CRUD (Create, Read, Update, Delete) de usuários, desenvolvido em Java utilizando o framework Spring Boot. Ele oferece operações básicas para gerenciar informações de usuários, como criação, leitura, atualização e exclusão.

# Requisitos do Sistema
Java 17
Maven
MySQL (ou outro banco de dados configurado)

# Configuração do Banco de Dados
O projeto utiliza o Spring Data JPA e está configurado para se integrar ao MySQL. Certifique-se de criar um banco de dados e configurar as credenciais no arquivo application.properties.

# Endpoints da API

A API fornece os seguintes endpoints:

`GET /api/v1/users/all: Retorna todos os usuários cadastrados.`
`GET /api/v1/users/{id}: Retorna os detalhes de um usuário específico.`
`POST /api/v1/users: Cria um novo usuário.`
`PATCH /api/v1/users/{id}: Atualiza parcialmente as informações de um usuário.`
`DELETE /api/v1/users/{id}: Exclui um usuário.`

# Bibliotecas Utilizadas
**Spring Boot Starter Data JPA:** Suporte para persistência de dados.
**Spring Boot Starter Validation:** Validação de dados.
**Spring Boot Starter Web:** Suporte para desenvolvimento de aplicativos web.
**Spring Boot DevTools:** Ferramentas para desenvolvimento mais eficiente.
**MySQL Connector/J:** Conector JDBC para MySQL.
**ModelMapper:** Facilita o mapeamento de objetos.
**Spring Boot Starter Security:** Suporte básico para segurança.
**Spring Boot Starter Test:** Suporte para testes.
