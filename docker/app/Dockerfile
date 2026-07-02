FROM eclipse-temurin:11-jre
LABEL maintainer="Prashant"
WORKDIR /app
COPY target/ecomapp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","app.jar" ]