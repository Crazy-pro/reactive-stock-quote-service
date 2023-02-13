### Reactive Stock Quote Service
Simple Web Application written to understand Spring WebFlux Framework concept.



### How to start:
1. Install and run any IDE for working with Java.
2. Install the latest version of docker if you still haven't done it.
3. Run MongoDB and RabbitMQ Docker Containers or just use the PC clients:
   - docker pull mongo
   - docker pull rabbitmq
   - docker run -d --name mdb    -p 27017:27017 mongo
   - docker run -d --name rabbit -p 5672:5672   rabbitmq
4. Run the application and check end-points work using Postman and link below:
   - http://localhost:8080/



### Technologies:
- Programming language: Java 11;
- Frameworks:
  - Spring (Boot, Core, Data, WebFlux, Test);
  - Hibernate.
- IDE: IntelliJ IDEA;
- Database: MongoDB;
- Message Broker: Reactive RabbitMQ;
- Tools: JUnit 5, Mockito, Lombok, Postman, Maven, Git, Docker, HTTPs, XML, YAML, JSON;
- Others: GitHub, CircleCI, CodeCov, SonarLint, SonarCloud.

[![CircleCI](https://circleci.com/gh/Crazy-pro/reactive-stock-quote-service.svg?style=svg)](https://app.circleci.com/gh/Crazy-pro/reactive-stock-quote-service)
[![CodeCov](https://codecov.io/gh/Crazy-pro/reactive-stock-quote-service/branch/master/graph/badge.svg)](https://codecov.io/gh/Crazy-pro/reactive-stock-quote-service)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)

[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)

[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Crazy-pro_reactive-stock-quote-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Crazy-pro_reactive-stock-quote-service)
