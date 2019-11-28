# Simple Apache httpd implementation

## Description
Implementation of httpd on 80 port with sample web page

### Build
```
docker build -t myhttpd .
```

### Run
Run the container
```
docker run -d -P myhttpd
```
Check binded port on localhost
```
docker port << CONTAINER ID >>
```

Check web page
```
curl localhost:port
```
