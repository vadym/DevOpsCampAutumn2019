FROM python:3.6
WORKDIR /whataboutfilm/
VOLUME ["/tmp/film-getter/"]
COPY requirments.txt ./
COPY whataboutfilm.py ./
RUN mkdir /tmp/film_getter/
RUN pip3 install -r requirments.txt
EXPOSE 5000
CMD python3 whataboutfilm.py
