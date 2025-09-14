FROM amazoncorretto:21-alpine
WORKDIR /app

# Copy any jar from the build context root into /app/app.jar
COPY *.jar app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]
