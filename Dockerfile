FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app
COPY . ./

RUN chmod +x ./mvnw
#RUN ./mvnw jooq:generate
RUN ./mvnw package -DskipTests
#RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/course_project-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "course_project-0.0.1-SNAPSHOT.jar"]
