FROM openjdk:17-slim as build

MAINTAINER byusluer

COPY target/account-service-0.0.1-SNAPSHOT.jar account-service-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar", "/account-service-0.0.1-SNAPSHOT.jar"]

