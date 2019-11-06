# Simple Flask application

## Description
Simple flash application that listen port 5000 <br>
When you access to port it prints "Hello world"<br>

### Build
```
docker build -t myflask .
```

### Run
as service abd bind port 5000 to randon port on localhost
```
docker run -d -P myflask
```
check binded port
```
docker port << CONTAINER ID >>
```

### Usage
```
curl localhost:port
```

