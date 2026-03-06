FROM openjdk:27-ea-trixie

WORKDIR /app

COPY target/sel-java-app.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
