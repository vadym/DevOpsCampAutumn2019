# Simple nmap implementation

## Description
Sample implementation of nmap <br>
By default it scans server scanme.nmap.org

### Build
```
docker build -t nmap:1.0 .
```

### Run
to use by default
```
docker run -it nmap:1.0
```
to scan some server 
```
docker run -it nmap:1.0 i.ua
```
scan udp ports
```
docker run -it nmap:1.0 -sU 8.8.8.8
```

