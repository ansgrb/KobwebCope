# Stage 1: Build the Kobweb application
FROM openjdk:17-jdk-slim as builder

WORKDIR /app

# Copy Gradle wrapper files
COPY gradlew .
COPY gradle gradle

# Copy build configuration
COPY build.gradle.kts .
COPY settings.gradle.kts .

# Copy the site source code
COPY site site

# Grant execution rights to gradlew
RUN chmod +x ./gradlew

# Build the application using the Kobweb export task
RUN ./gradlew :site:kobwebExport --no-daemon

# Stage 2: Create the final runtime image
FROM openjdk:17-jre-slim

WORKDIR /app

# Copy the exported application artifacts from the builder stage
COPY --from=builder /app/site/.kobweb/server /app

# Copy Gradle wrapper files needed to run the 'kobwebRun' task
COPY --from=builder /app/gradlew .
COPY --from=builder /app/gradle gradle
RUN chmod +x ./gradlew

# Copy necessary build files if kobwebRun task requires them
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY site site

# Expose the port the application runs on (default is 8080)
EXPOSE 8080

# Command to run the application in production mode
CMD ["./gradlew", ":site:kobwebRun", "--env", "prod", "--notty", "--no-daemon"]