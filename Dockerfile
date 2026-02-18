# Multi-stage Dockerfile that builds the `api` Maven module and produces a runtime image

FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /workspace
COPY . .
RUN mvn -f api/pom.xml -DskipTests package

FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /workspace/api/target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
