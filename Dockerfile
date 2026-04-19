FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .
RUN javac App.java
CMD ["cmd","/c","java App && timeout /t 3600"]