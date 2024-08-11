# Use a base image with Java (OpenJDK)
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory to the container
COPY target/reasearchAndDevelopment-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on (default is 8080)
EXPOSE 8080

# Define the command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
