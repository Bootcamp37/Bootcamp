FROM openjdk:11
VOLUME /tmp
EXPOSE 8889
ADD ./target/discovery-service-0.0.1-SNAPSHOT.jar ms-discovery.jar
ENTRYPOINT ["java","-jar","/ms-discovery.jar"]