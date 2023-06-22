FROM openjdk:8

COPY target/provider.jar /usr/app/provider.jar

WORKDIR /usr/app/

EXPOSE 9090

ENTRYPOINT [ "java", "-jar", "provider.jar" ]
 


