# Sample Multisage Docker Build Demo

## Description
Simple demo of buiulding Docker multistage containers

### Build
First node
```
docker build -t << image-name >> -f DockerNode1 .
```

Second node
```
docker build -t << image-name >> -f DockerNode2 .
```

During building second node you should get the following message:
```
Step 5/7 : ONBUILD RUN echo "Some settings will be changed for build matter"
```

