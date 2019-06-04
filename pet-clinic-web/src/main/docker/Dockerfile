# java image

FROM openjdk:8-jdk-alpine

VOLUME /tmp

#ADD /petclinic-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/petclinic-0.0.1-SNAPSHOT.jar"]
