FROM openjdk:latest

COPY target/*.jar /srv/
COPY src/main/resources/application.yml /srv/config/

EXPOSE 8005

ENTRYPOINT ["java","-jar","/srv/subscription-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:/srv/config/application.yml"]

