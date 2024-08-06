# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and source code to the container
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the previous stage
COPY --from=build /app/target/soloint-0.0.0.1.jar /app/soloint-0.0.0.1.jar

# Expose the port that the application will run on
EXPOSE 8082

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/soloint-0.0.0.1.jar"]
