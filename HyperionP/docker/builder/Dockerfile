FROM busybox as builder
USER dummy
FROM builder
RUN id
FROM busybox as builder
ONBUILD USER root
ONBUILD RUN echo "Some settings will be changed for build matter"
FROM builder
RUN id
