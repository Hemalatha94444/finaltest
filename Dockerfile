FROM openjdk:21
COPY ./target/finalproject.jar finalproject.jar
CMD ["java","-jar","finalproject.jar"]