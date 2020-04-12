FROM java:8-jdk-alpine

COPY ./target/e.commerce.project.artifactid-1.0.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch e.commerce.project.artifactid-1.0.jar'

ENTRYPOINT ["java","-jar","e.commerce.project.artifactid-1.0.jar"]