FROM alpine:3.18.4

RUN apk add openjdk17
COPY target/threads-Unknown.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]


