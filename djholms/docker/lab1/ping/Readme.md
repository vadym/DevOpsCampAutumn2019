# Simple ping implementation

## Description
Sample implementation of ping tool <br>
By default it pings google.com with 1 packet

### Build
```
docker build -t ping:1.0 .
```

### Run
to use by default
```
docker run -it ping:1.0
```
to ping some server. To stop press Ctrl+C
```
docker run -it ping:1.0 i.ua
```
ping some server with 3 packets
```
docker run -it ping:1.0 -c3 8.8.8.8
```

