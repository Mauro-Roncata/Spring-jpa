# 🍃 Spring Boot JPA Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

## 📝 Sobre o Projeto

Este é um projeto simples e prático desenvolvido com **Spring Boot** e **Spring Data JPA**, focado na implementação de persistência de dados. O objetivo principal do repositório é demonstrar o mapeamento objeto-relacional (ORM), a configuração de entidades e as operações de CRUD (Create, Read, Update, Delete).

Para facilitar os testes e a execução, o projeto utiliza o banco de dados em memória **H2**, dispensando a necessidade de instalar um SGBD externo.

## 🚀 Tecnologias e Ferramentas Utilizadas

* **Java** (JDK 17+)
* **Spring Boot** (Framework principal)
* **Spring Data JPA / Hibernate** (Persistência de dados e ORM)
* **Maven** (Gerenciamento de dependências e build)
* **H2 Database** (Banco de dados em memória)

## 📦 Estrutura de Dependências Principais (`pom.xml`)

As principais dependências utilizadas neste projeto incluem:
- `spring-boot-starter-data-jpa`: Para integração com banco de dados e repositórios.
- `spring-boot-starter-web`: Para expor os endpoints REST.
- `h2`: Banco de dados em memória para testes e desenvolvimento ágil.

## ⚙️ Como executar o projeto localmente

### Pré-requisitos
Antes de começar, você vai precisar ter as seguintes ferramentas instaladas em sua máquina:
* [Git](https://git-scm.com)
* [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
* [Maven](https://maven.apache.org/)

### Passo a passo

1. **Clone o repositório:**
```bash
git clone [https://github.com/Mauro-Roncata/Spring-jpa.git](https://github.com/Mauro-Roncata/Spring-jpa.git)
```

2. **Acesse a pasta do projeto:**
```bash
cd Spring-jpa
```

3. **Compile e execute o projeto usando Maven:**
```bash
mvn spring-boot:run
```
*Alternativamente, você pode importar o projeto na sua IDE favorita (IntelliJ, Eclipse, VS Code) e rodar a classe principal.*

4. **Acesse o Console do H2 (Opcional):**
   Com a aplicação rodando, você pode visualizar o banco de dados acessando no navegador:
   `http://localhost:8080/h2-console`
   *(Verifique no seu `application.properties` se o console do H2 está habilitado com `spring.h2.console.enabled=true` e confirme a URL JDBC, que geralmente é `jdbc:h2:mem:testdb`).*

## 📂 Estrutura Padrão do Projeto

```text
src/
 ├── main/
 │   ├── java/com/seu_pacote/
 │   │   ├── config/       # Configurações do projeto e instaciação de dados
 │   │   ├── controllers/  # Controladores REST (Endpoints da API)
 │   │   ├── entities/     # Entidades JPA (Mapeamento das tabelas)
 │   │   ├── repositories/ # Interfaces Spring Data JPA
 │   │   └── services/     # Regras de negócio
 │   └── resources/
 │       └── application.properties # Configurações da aplicação (Porta, H2, etc.)
 └── test/                 # Testes da aplicação
```
