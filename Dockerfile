FROM maven:3.8.4-openjdk-11-slim AS build
COPY . /app
WORKDIR /app
RUN mvn clean package

FROM payara/micro:6.2023.10-jdk11
COPY --from=build /app/target/proyectoFinalCRUDJakartaee-1.0-SNAPSHOT.war $DEPLOY_DIR/ROOT.war

EXPOSE 8080
