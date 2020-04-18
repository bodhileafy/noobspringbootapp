FROM openjdk:8u252-slim
WORKDIR /opt
COPY ./build/libs/noobspringbootapp-1.0.jar /opt/noobspringbootapp-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/noobspringbootapp-1.0.jar"]