FROM java:8
MAINTAINER jmc
ADD hotels-service-k8s-0.0.1-SNAPSHOT.jar hotels-service-k8s.jar
EXPOSE 8073
ARG COUCH_ADDR
ENV couchbase_addr=$COUCH_ADDR
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hotels-service-k8s.jar"]