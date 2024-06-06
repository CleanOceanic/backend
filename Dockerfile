FROM ubuntu:latest AS build

# Atualizar lista de pacotes
RUN apt-get update

# Instalar OpenJDK 17
RUN apt-get install openjdk-17-jdk -y
COPY . .

# Instalar Gradle
RUN apt-get install gradle -y

# Executar o comando Gradle para construir o projeto
RUN gradle bootJar

FROM openjdk:17-jdk-slim

# Expor porta 8080
EXPOSE 8080

# Copiar o arquivo JAR gerado pelo Gradle para o contêiner
COPY --from=build /build/libs/*.jar app.jar

# Definir ponto de entrada do contêiner
ENTRYPOINT [ "java", "-jar", "app.jar" ]