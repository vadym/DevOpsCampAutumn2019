FROM maven:3.3-jdk-8 as builder
COPY . /build/
WORKDIR /build
RUN mvn clean install
FROM openjdk:8-jre
COPY --from=builder /build/target/demoapp.jar /opt/
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/opt/demoapp.jar"]
