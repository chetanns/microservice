FROM openjdk:11
ADD build/libs/microservice-0.0.1-SNAPSHOT.jar microservice-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","microservice-0.0.1-SNAPSHOT.jar"]