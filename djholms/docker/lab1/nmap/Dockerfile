FROM centos
RUN yum install -y nmap && \
	yum clean all
ENTRYPOINT ["nmap"]
CMD ["scanme.nmap.org"]
