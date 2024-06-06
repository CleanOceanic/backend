FROM eclipse-temurin:17-jdk-alpine AS build
FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN ./gradlew bootJar --no-daemon

# Copie o arquivo JAR para o contêiner
COPY /build/libs/CleanOceanic-0.0.1-SNAPSHOT.jar app.jar

# Exponha a porta em que a aplicação será executada
FROM openjdk:17-jdk-slim
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]
COPY --from=build /build/libs/**SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]