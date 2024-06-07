# CleanOceanic - Java Advanced
Os oceanos, cobrindo mais de 70% da Terra, são vitais para a vida e a regulação climática, mas estão ameaçados pela poluição, 
especialmente plástica, com 8 milhões de toneladas de plástico entrando nos oceanos anualmente. Se não houver ações imediatas, 
até 2050 haverá mais plástico do que peixes. Esse problema não só afeta a vida marinha, mas também a saúde humana, 
já que os resíduos entram na cadeia alimentar. No Brasil, a falta de conhecimento sobre o descarte correto do lixo agrava essa situação.

Para enfrentar esse desafio, foi desenvolvida a Clean Oceanic, uma plataforma que conecta biólogos, empresas e voluntários com o objetivo de preservar e limpar os oceanos. 
A plataforma facilita a colaboração através de chats, grupos, artigos e videochamadas. Além disso, oferece uma tecnologia para identificar tipos de resíduos a partir de fotos, 
informando se são recicláveis, não recicláveis ou tóxicos, e orientando sobre o descarte correto. A Clean Oceanic também permite rastrear e quantificar os resíduos, 
promovendo uma reciclagem mais transparente e eficaz. A plataforma visa criar uma comunidade comprometida em salvar os oceanos e assegurar um futuro sustentável.

## Integrantes do Grupo

- Kaique Santos de Andrade - RM99562
- Marcelo Augusto de Mello Paixão - RM99466
- Rodrigo Batista Freire - RM99513
- Thiago Martins Bezerra - RM98644
- Vinicius Oliveira de Almeida - RM97967
#

## Tecnologias utilizadas

- [x] Lombok (`org.projectlombok:lombok:1.18.30`)
- [x] Spring Data JPA (`org.springframework.boot:spring-boot-starter-data-jpa`)
- [x] Spring Web (`org.springframework.boot:spring-boot-starter-web`)
- [x] Spring HATEOAS (`org.springframework.boot:spring-boot-starter-hateoas`)
- [x] H2 Database (`com.h2database:h2`)
- [x] Bean Validation (`org.springframework.boot:spring-boot-starter-validation`)
- [x] Spring Security (`org.springframework.boot:spring-boot-starter-security`)
- [x] Spring OAuth2 Client (`org.springframework.boot:spring-boot-starter-oauth2-client`)
- [x] SpringDoc OpenAPI Starter WebMVC UI (`org.springdoc:springdoc-openapi-ui:1.6.11`)
#

# Documentação da API

Esta documentação descreve os endpoints disponíveis na API e as operações que podem ser realizadas em cada um deles.

## Endpoints

### 1. Usuários
- **URL Base:** `http://localhost:8080/api/public/usuarios`

#### Operações:
- **POST**
  - **Descrição:** Cria um novo usuário.
  - **Exemplo:** 
    ```http
    POST /api/public/usuarios
    ```
- **GET All**
  - **Descrição:** Recupera todos os usuários.
  - **Exemplo:** 
    ```http
    GET /api/public/usuarios
    ```
- **GET by ID**
  - **Descrição:** Recupera um usuário pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/usuarios/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza um usuário pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/usuarios/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta um usuário pelo ID.
  - **Exemplo:** 
    ```http
    DELETE /api/public/usuarios/{id}
    ```

### 2. Endereços
- **URL Base:** `http://localhost:8080/api/public/enderecos`

#### Operações:
- **POST**
  - **Descrição:** Cria um novo endereço.
  - **Exemplo:** 
    ```http
    POST /api/public/enderecos
    ```
- **GET All**
  - **Descrição:** Recupera todos os endereços.
  - **Exemplo:** 
    ```http
    GET /api/public/enderecos
    ```
- **GET by ID**
  - **Descrição:** Recupera um endereço pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/enderecos/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza um endereço pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/enderecos/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta um endereço pelo ID.
  - **Exemplo:** 
    ```http
    DELETE /api/public/enderecos/{id}
    ```

### 3. Empresas
- **URL Base:** `http://localhost:8080/api/public/empresas`

#### Operações:
- **POST**
  - **Descrição:** Cria uma nova empresa.
  - **Exemplo:** 
    ```http
    POST /api/public/empresas
    ```
- **GET All**
  - **Descrição:** Recupera todas as empresas.
  - **Exemplo:** 
    ```http
    GET /api/public/empresas
    ```
- **GET by ID**
  - **Descrição:** Recupera uma empresa pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/empresas/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza uma empresa pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/empresas/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta uma empresa pelo ID.
  - **Exemplo:** 
    ```http
    DELETE /api/public/empresas/{id}
    ```

### 4. Pontos de Coleta
- **URL Base:** `http://localhost:8080/api/public/pontoColetas`

#### Operações:
- **POST**
  - **Descrição:** Cria um novo ponto de coleta.
  - **Exemplo:** 
    ```http
    POST /api/public/pontoColetas
    ```
- **GET All**
  - **Descrição:** Recupera todos os pontos de coleta.
  - **Exemplo:** 
    ```http
    GET /api/public/pontoColetas
    ```
- **GET by ID**
  - **Descrição:** Recupera um ponto de coleta pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/pontoColetas/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza um ponto de coleta pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/pontoColetas/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta um ponto de coleta pelo ID.
  - **Exemplo:** 
    ```http
    DELETE /api/public/pontoColetas/{id}
    ```

### 5. Resíduos Coletados
- **URL Base:** `http://localhost:8080/api/public/residuoColetados`

#### Operações:
- **POST**
  - **Descrição:** Cria um novo resíduo coletado.
  - **Exemplo:** 
    ```http
    POST /api/public/residuoColetados
    ```
- **GET All**
  - **Descrição:** Recupera todos os resíduos coletados.
  - **Exemplo:** 
    ```http
    GET /api/public/residuoColetados
    ```
- **GET by ID**
  - **Descrição:** Recupera um resíduo coletado pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/residuoColetados/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza um resíduo coletado pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/residuoColetados/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta um resíduo coletado pelo ID.
  - **Exemplo:** 
    ```http
    DELETE /api/public/residuoColetados/{id}
    ```

### 6. Destino de Resíduos
- **URL Base:** `http://localhost:8080/api/public/destinoResiduos`

#### Operações:
- **POST**
  - **Descrição:** Cria um novo destino de resíduo.
  - **Exemplo:** 
    ```http
    POST /api/public/destinoResiduos
    ```
- **GET All**
  - **Descrição:** Recupera todos os destinos de resíduos.
  - **Exemplo:** 
    ```http
    GET /api/public/destinoResiduos
    ```
- **GET by ID**
  - **Descrição:** Recupera um destino de resíduo pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/destinoResiduos/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza um destino de resíduo pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/destinoResiduos/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta um destino de resíduo pelo ID.
  - **Exemplo:** 
    ```http
    DELETE /api/public/destinoResiduos/{id}
    ```

### 7. Destino de Resíduos em Pontos de Coleta
- **URL Base:** `http://localhost:8080/api/public/destinoResiduoPontoColetas`

#### Operações:
- **POST**
  - **Descrição:** Cria um novo destino de resíduo em ponto de coleta.
  - **Exemplo:** 
    ```http
    POST /api/public/destinoResiduoPontoColetas
    ```
- **GET All**
  - **Descrição:** Recupera todos os destinos de resíduos em pontos de coleta.
  - **Exemplo:** 
    ```http
    GET /api/public/destinoResiduoPontoColetas
    ```
- **GET by ID**
  - **Descrição:** Recupera um destino de resíduo em ponto de coleta pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/destinoResiduoPontoColetas/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza um destino de resíduo em ponto de coleta pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/destinoResiduoPontoColetas/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta um destino de resíduo em ponto de coleta pelo ID.
  - **Exemplo:** 
    ```http
    DELETE /api/public/destinoResiduoPontoColetas/{id}
    ```

### 8. Endereços de Empresas
- **URL Base:** `http://localhost:8080/api/public/empresaEnderecos`

#### Operações:
- **POST**
  - **Descrição:** Cria um novo endereço de empresa.
  - **Exemplo:** 
    ```http
    POST /api/public/empresaEnderecos
    ```
- **GET All**
  - **Descrição:** Recupera todos os endereços de empresas.
  - **Exemplo:** 
    ```http
    GET /api/public/empresaEnderecos
    ```
- **GET by ID**
  - **Descrição:** Recupera um endereço de empresa pelo ID.
  - **Exemplo:** 
    ```http
    GET /api/public/empresaEnderecos/{id}
    ```
- **PUT by ID**
  - **Descrição:** Atualiza um endereço de empresa pelo ID.
  - **Exemplo:** 
    ```http
    PUT /api/public/empresaEnderecos/{id}
    ```
- **DELETE by ID**
  - **Descrição:** Deleta um endereço de empresa pelo ID.
 
