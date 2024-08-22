FROM openjdk:17-jdk-slim
WORKDIR /opt
COPY target/restorantlisting-0.0.1-SNAPSHOT.jar restorantlisting.jar
ENV PORT 9096
EXPOSE 9096
ENTRYPOINT exec java $JAVA_OPTS -jar restorantlisting.jar

###  run commands
#### docker build -t restorantlisting:latest .
#### docker run -p9096:9096 restorantlisting:latest