# Single stage build for Koyeb (simpler, more compatible)
FROM maven:3.9-eclipse-temurin-21 AS builder

WORKDIR /app

# Copy backend files
COPY backend/pom.xml ./pom.xml
COPY backend/src ./src

# Build the application
RUN mvn clean package -DskipTests -B

# Runtime
FROM eclipse-temurin:21-jre

WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

# Memory-optimized for free tier
ENTRYPOINT ["java", "-Xmx256m", "-Xms128m", "-jar", "app.jar"]
