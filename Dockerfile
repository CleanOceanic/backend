# Estágio de build
FROM eclipse-temurin:17-jdk-alpine AS build

# Copie o código-fonte para o contêiner
COPY . .

# Copie o script gradlew
COPY gradlew .

# Install Gradle
RUN wget https://services.gradle.org/distributions/gradle-7.4.2-bin.zip && \
    unzip gradle-7.4.2-bin.zip && \
    rm gradle-7.4.2-bin.zip && \
    mv gradle-7.4.2 /usr/local/gradle && \
    export PATH=$PATH:/usr/local/gradle/bin

# Estágio de runtime
FROM eclipse-temurin:17-jdk-alpine

# Copie o arquivo JAR gerado pelo Gradle para o contêiner
COPY --from=build build/libs/CleanOceanic-0.0.1-SNAPSHOT.jar app.jar

# Exponha a porta em que a aplicação será executada
EXPOSE 8080

# Comando para executar a aplicação com o perfil especificado
ENTRYPOINT ["java", "-jar", "/app.jar"]