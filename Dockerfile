FROM openjdk:8
COPY target/dockerHelloWorld.jar /application.jar
ENTRYPOINT ["java", "-jar","application.jar"]
EXPOSE 8080