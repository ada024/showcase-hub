FROM openjdk:22-jdk
LABEL authors="ada024"
ADD target/showcase-hub.jar showcase-hub.jar
ENTRYPOINT ["java", "-jar","/showcase-hub.jar"]