FROM openjdk:8
EXPOSE 8080
ADD target/todojwt.jar todojwt.jar
ENTRYPOINT ["java", "-jar", "/todojwt.jar"]