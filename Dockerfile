# Paso 1: Compilar la aplicación (Se mantiene igual)
FROM maven:3.8.4-openjdk-11-slim AS build
COPY . /app
WORKDIR /app
RUN mvn clean package

FROM payara/micro:5.2022.5-jdk11
COPY --from=build /app/target/proyectoFinalCRUDJakartaee-1.0-SNAPSHOT.war $DEPLOY_DIR/ROOT.war

EXPOSE 8080