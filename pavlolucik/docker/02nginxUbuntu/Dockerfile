FROM ubuntu:latest
LABEL maintainer="Pavlo Lucik pavel.lucik@gmail.com"
RUN apt-get update
RUN apt-get install -y nginx
ENTRYPOINT ["/usr/sbin/nginx","-g","daemon off;"]
EXPOSE 80
