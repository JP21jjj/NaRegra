
# NaRegra

Projeto Spring Boot para cadastro de usuários com MongoDB.

## Como rodar

1. Configure o arquivo `src/main/resources/application.properties` com sua URI do MongoDB.
2. Execute:
   ```
   mvn spring-boot:run
   ```
3. Acesse a API em `http://localhost:8080/usuarios`

## Endpoints principais

- `GET /usuarios` — Lista todos os usuários
- `POST /usuarios` — Cria um novo usuário

## Tecnologias

- Java 17
- Spring Boot
- MongoDB
