# Use an OpenJDK base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Create a directory for logs
RUN mkdir -p /app/logs


# Copy the Spring Boot JAR file into the container
COPY buildpacks-demo.jar buildpacks-demo.jar

# Expose the port your Spring Boot application runs on
EXPOSE 9090

# Define an environment variable for the log directory (optional)
ENV LOG_DIR=/app/logs


# Command to run the Spring Boot application with log output directed to the log directory
CMD ["java", "-jar", "buildpacks-demo.jar", "--logging.file=/app/logs/application.log"]


