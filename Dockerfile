FROM openjdk:17
EXPOSE 7000
ADD target/springboot-image.jar springboot-image.jar
ENTRYPOINT ["java","-jar","/springboot-image.jar"]