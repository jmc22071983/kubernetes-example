FROM java:8
MAINTAINER jmc
ADD config-services-k8s-0.0.1-SNAPSHOT.jar config-services-k8s.jar
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-services-k8s.jar"]