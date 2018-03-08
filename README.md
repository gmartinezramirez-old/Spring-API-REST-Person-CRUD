# REST Web Service for CRUD operations
[Active] REST web service using Spring JPA, Spring MVC and Spring Boot. 

<a href="http://www.repostatus.org/#active"><img src="http://www.repostatus.org/badges/latest/active.svg" alt="Project Status: Active – The project has reached a stable, usable state and is being actively developed." /></a>
[![Build Status](https://travis-ci.org/gmartinezramirez/Spring-API-REST-Person-CRUD.svg?branch=master)](https://travis-ci.org/gmartinezramirez/Spring-API-REST-Person-CRUD)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7709ced7f8ea421e9a3c3ed2310cff49)](https://www.codacy.com/app/gonzalo-martinez-ra/Spring-API-REST-Person-CRUD?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=gmartinezramirez/Spring-API-REST-Person-CRUD&amp;utm_campaign=Badge_Grade)

+ Spring web service of a CRUD of persons using Spring JPA, Spring MVC and Spring Boot, including GET, PUT, POST and DELETE operations for a person entity.
+ Attributes: firstname and lastname.


<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/architecture.png"></p>

<!-- In this section add TOC for easy navegation -->
<p align="center">
<b><a href="#requeriments">Requeriments</a></b>
|
<b><a href="#Howtorun">How to run</a></b>
|
<b><a href="#HowtousetheAPI">How to use the API</a></b>
</p>


## Requeriments

* Java - 1.8.x
* JDK or OpenJDK - 1.8.x
* Maven - 3.x.x
* MySQL - 5.x.x or MariaDB 10.x.x
* Spring - 2.0.0.RELEASE (inclued in pom.xml)

* Tested on:
* GNU/Linux Solus 3
* JDK 1.8.0_161
* Linux Kernel 4.15.6-58.current
* MariaDB 10.1.29

## How to run

**1. Clone the repository.**

```bash
git clone https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD.git
```

**2. Create the database "persons" in MySQL or MariaDB.**

```
mysql -u root -p
```

```
mysql> create database persons;
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`.

+ change `spring.datasource.username` and `spring.datasource.password` as per your MySQL installation.

+ by default the user is: 'root' and password is: '1234' (without the ').


```java
spring.datasource.url = jdbc:mysql://localhost:3306/persons?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false
spring.datasource.username = root
spring.datasource.password = 1234
```

**4. Build and run the app using Maven**

```bash
mvn package
java -jar target/person-1.0.0.jar
```

<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/mvn-package.gif"></p>

+ Also, you can run the app without packaging it using:

```bash
mvn spring-boot:run
```

+ Also, you can run the app without packaging it using:

```bash
./run.sh
```

<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/mvn-spring-bootrun.gif"></p>


+ The app will start running at <http://localhost:8080>.
+ The REST service is running at <http://localhost:8080/api/v1.0>.


## How to use the API

+ The current version of the API is v1.0.

1. Creating a new Person using POST /api/v1.0/persons API
+ localhost:8080/api/persons/
+ Example: {"firstName": "Gonzalo", "lastName":"Martinez"}

<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/01-POST.png"></p>

2. Retrieving all Persons using GET /api/v1.0/persons API
+ localhost:8080/api/persons/

<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/02-GET.png"></p>

3. Retrieving a single Person using GET /api/v1.0/persons/{personId} API
+ localhost:8080/api/persons/1

<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/03-GET.png"></p>

4. Updating a Person using PUT /api/v1.0/persons/{personId} API
+ localhost:8080/api/persons/1
+ Example: {"firstName": "Frederic", "lastName":"Chopin"}

<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/04-PUT.png"></p>

5. Deleting a Person using DELETE /api/v1.0/persons/{personId} API
+ localhost:8080/api/persons/1

<p align="center"><img width=95% src="https://github.com/gmartinezramirez/Spring-API-REST-Person-CRUD/blob/master/docs/05-DEL.png"></p>
