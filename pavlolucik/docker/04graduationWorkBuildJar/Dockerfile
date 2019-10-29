FROM ubuntu
MAINTAINER Pavlo Lucik (pavel.lucik@gmail.com)
RUN apt-get update
RUN apt-get install -y git \
 openjdk-8-jdk \
 maven
RUN git clone https://github.com/pavel-lucik/gw-spring-boot.git
RUN cd /gw-spring-boot && \
git checkout 2.1.x
RUN cd /gw-spring-boot/spring-boot-samples/spring-boot-sample-web-ui && \
mvn clean install
ENTRYPOINT ["/usr/bin/java","-jar","/gw-spring-boot/spring-boot-samples/spring-boot-sample-web-ui/target/spring-boot-sample-web-ui-2.1.10.BUILD-SNAPSHOT.jar"]
EXPOSE 8080
