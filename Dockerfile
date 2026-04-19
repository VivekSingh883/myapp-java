FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .
RUN javac App.java
CMD ["java","App"]