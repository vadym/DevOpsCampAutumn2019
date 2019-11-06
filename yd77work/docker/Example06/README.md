Exercise #1


Dockerfile #6_1 - Building With Arguments

Image: https://hub.docker.com/repository/docker/yd77work/devopscampautumn2019-example6_1

Usage: docker build --build-arg BASE_IMAGE=ubuntu:16.04 -t yd77work/devopscampautumn2019-example6_1 -f Dockerfile.ubuntu1 .


Dockerfile #6_1-1 - Building With Arguments

Image: https://hub.docker.com/repository/docker/yd77work/devopscampautumn2019-example6_1-1

Usage: docker build --build-arg BASE_IMAGE=ubuntu:18.04 -t yd77work/devopscampautumn2019-example6_1-1 -f Dockerfile.ubuntu1 .


Dockerfile #6_2 - Building With Arguments

Image: https://hub.docker.com/repository/docker/yd77work/devopscampautumn2019-example6_2

Usage: docker build --build-arg BUILD_DATE=$(date -u +'%Y-%m-%dT%H:%M:%SZ') -t yd77work/devopscampautumn2019-example6_2 -f Dockerfile.ubuntu2 .
