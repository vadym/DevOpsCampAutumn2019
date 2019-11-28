# Custom Packer Image

## Description
This is simple example of creation custom image of Hashicorp Packer<br>
Version of packer might be set during image build<br>
Version by default is 1.4.5

### Build
Packer with defaults. Ver 1.4.5
```
docker build -t << image-name >> .
```

Set custom packer version
```
docker build -t << image-name >> --build-arg PACKER_VERSION=<<version>> .
```

### Run
```
docker run -i -t << image-name >>  <command>
``` 
