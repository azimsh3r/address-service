FROM openjdk

WORKDIR /app

COPY . .

#RUN gradlew build

EXPOSE 7072

CMD ["java", "-jar", "build/libs/address-service.jar"]