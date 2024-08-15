# Docker file for ScoreInfo
FROM openjdk:8
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/scoreinfo.jar
ENTRYPOINT ["java", "-jar", "/opt/scoreinfo.jar"]

#To create image .. to go project folder and run below command
# docker image build -t scoreinfo-application .
#To execute the image 
# docker run -d -p 8080:8080 --name scoreinfo-application scoreinfo-application:latest
