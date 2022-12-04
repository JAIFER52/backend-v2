FROM java11
EXPOSE 8081
ADD demohelpme-0.0.1-SNAPSHOT .jar demohelpme .jar/
ENTRYPOINT [java, -java, demohelpme.jar]