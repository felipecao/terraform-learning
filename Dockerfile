FROM openjdk:11-jre
EXPOSE 8080
ENTRYPOINT ["/launch.sh"]
COPY launch.sh /
RUN chmod +x /launch.sh

COPY build/libs/*.jar /app.jar