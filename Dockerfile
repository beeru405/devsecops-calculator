FROM openjdk:8-jdk-alpine

COPY target/your-calculator-app.jar /app/your-calculator-app.jar

CMD ["java", "-jar", "/app/your-calculator-app.jar"]
