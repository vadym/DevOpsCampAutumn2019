FROM ubuntu
LABEL maintainer="Pavlo Lucik pavel.lucik@gmail.com"
RUN apt-get update
RUN apt-get install -y nginx
COPY index.html /var/www/html/index.nginx-debian.html
ENTRYPOINT ["/usr/sbin/nginx","-g","daemon off;"]
EXPOSE 80
