FROM openjdk:17-jdk AS build

RUN apt-get update && apt-get install -y \
    unzip \
    && rm -rf /var/lib/apt/lists/*

RUN wget https://services.gradle.org/distributions/gradle-x.x-bin.zip \
    && unzip -d /opt/gradle gradle-x.x-bin.zip \
    && rm gradle-x.x-bin.zip

ENV PATH=$PATH:/opt/gradle/gradle-x.x/bin

COPY build.gradle .
COPY settings.gradle .
COPY gradle.properties .
COPY gradlew .
COPY gradle ./gradle

COPY src ./src

# Construindo o projeto Gradle
RUN ./gradlew build

# Estágio de implantação
FROM openjdk:17-jdk-slim

# Copiando o arquivo jar construído no estágio de construção
COPY --from=build /app/build/libs/CleanOceanic-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]