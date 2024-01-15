Spring Boot 3 with Scala JS
===========================
This is a simple project containing a Spring Boot 3 webservice and a Scala JS shared library.

Build
-----
No automated build is included. You can build with the following manual steps:

1. In scala-js-lib-sbt run ```> sbt publishM2``` to create the Maven library
1. In same directory run ```> sbt fastLinkJS``` to create the JavaScript
1. Go to spring-boot-3-service-mvn and run ```> mvn package```, this will copy the JavaScript

Run
---
When you have built using the steps above you can manually run with the following steps:

1. Go to spring-boot-3-service-mvn and run ```> mvn spring-boot:start```
1. Browse to localhost:9090

github.com/aimmoth