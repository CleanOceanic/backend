# Use uma imagem base do JDK 17
FROM eclipse-temurin:17-jdk-alpine

# Copie o arquivo JAR para o contêiner
COPY build/libs/CleanOceanic-0.0.1-SNAPSHOT.jar app.jar

# Exponha a porta em que a aplicação será executada
EXPOSE 8080

# Comando para executar a aplicação com o perfil especificado
ENTRYPOINT ["java", "-jar", "/app.jar"]