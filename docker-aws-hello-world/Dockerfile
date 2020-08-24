FROM java:8-jdk-alpine
COPY . /docker/workdir/docker-aws-hello-world/
WORKDIR /docker/workdir/docker-aws-hello-world/target

EXPOSE 8088
ENTRYPOINT [ "java","-jar","docker-aws-hello-world-1.0.0.jar" ]
