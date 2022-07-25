# SpringBoot SPI demo

    ./gradlew bootRun

=> http://localhost:8008/greeting
=> http://localhost:8008/actuator/health


## Docker

Build the image 

    ./gradlew build
    docker build --tag spring-api-demo:latest .

Run
    docker run -p 9080:8080 --name my-spring-api-demo spring-api-demo:latest

=> http://localhost:9080/greeting


To reuse the same docker container
    docker rm my-spring-api-demo
