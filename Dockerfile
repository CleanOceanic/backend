FROM ubuntu:latest AS build

# Atualizar lista de pacotes
RUN apt-get update

# Instalar OpenJDK 17
RUN apt-get install openjdk-17-jdk -y

# Instalar Gradle
RUN apt-get install gradle -y

# Executar comando Gradle para buildar o projeto
RUN gradle build

FROM openjdk:17-jdk-slim

# Expor porta 8080
EXPOSE 8080

# Copiar arquivo JAR gerado pelo Gradle para o container
COPY build/libs/*.jar app.jar

# Definir ponto de entrada do container
ENTRYPOINT [ "java", "-jar", "app.jar" ]