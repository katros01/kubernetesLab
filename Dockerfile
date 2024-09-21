FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/KubernetesLab-0.0.1-SNAPSHOT.war /app/

EXPOSE 8080

CMD ["java", "-jar", "/app/KubernetesLab-0.0.1-SNAPSHOT.war"]