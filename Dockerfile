FROM openjdk:11.0.15
ARG JAR_FILE=target/bc30-project04-part04-business-microservice00-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} bc30-project04-part04-business-microservice00-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/bc30-project04-part04-business-microservice00-0.0.1-SNAPSHOT.jar"]