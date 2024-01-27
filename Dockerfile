FROM openjdk:11-jdk-alpine

COPY target/calculator-app.jar /app/calculator-app.jar

CMD ["java", "-jar", "/app/calculator-app.jar"]
