FROM openjdk:11
EXPOSE 8080
ADD target/devops-github-actions.jar devops-github-actions.jar
ENTRYPOINT ["java", "-jar", "/devops-github-actions"]