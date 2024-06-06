# Estágio de build
FROM eclipse-temurin:17-jdk-alpine AS build

# Copie o código-fonte para o contêiner
COPY . .

# Executar comando Gradle para criar o arquivo JAR
RUN gradle bootJar

# Estágio de runtime
FROM eclipse-temurin:17-jdk-alpine

# Copie o arquivo JAR gerado pelo Gradle para o contêiner
COPY --from=build build/libs/CleanOceanic-0.0.1-SNAPSHOT.jar app.jar

# Exponha a porta em que a aplicação será executada
EXPOSE 8080

# Comando para executar a aplicação com o perfil especificado
ENTRYPOINT ["java", "-jar", "/app.jar"]