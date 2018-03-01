# Web-service-Spring
[Active] REST web service using Spring JPA, Spring MVC and Spring Boot. 

<a href="http://www.repostatus.org/#active"><img src="http://www.repostatus.org/badges/latest/active.svg" alt="Project Status: Active – The project has reached a stable, usable state and is being actively developed." /></a>
[![Build Status](https://travis-ci.org/gmartinezramirez/Web-service-Spring.svg?branch=master)](https://travis-ci.org/gmartinezramirez/Web-service-Spring)

Construir un servicio web REST en Spring usando Spring JPA, Spring MVC y Spring BOOT que realice operaciones GET, PUT, POST y DELETE sobre una entidad Persona (atributos: Nombre y Apellido). 

## Instructions

* mysql -u root -p
* pass: 1234
* create database persons;
* open src/main/resources/application.properties
* change spring.datasource.username and spring.datasource.password as per your mysql installation
* mvn package
* optional: java -jar target/person-1.0.0.jar
* mvn spring-boot:run
* http://localhost:8080

## How to use the API

* Creating a new Person using POST /api/persons API
* localhost:8080/api/persons/
* Example: {"firstName": "Gonzalo", "lastName":"Martinez"}

* Retrieving all Persons using GET /api/persons API
* localhost:8080/api/persons/

* Retrieving a single Person using GET /api/persons/{personId} API
* localhost:8080/api/persons/1

* Updating a Person using PUT /api/persons/{personId} API
* localhost:8080/api/persons/1
* Example: {"firstName": "Frederic", "lastName":"Chopin"}

* Deleting a Note using DELETE /api/persons/{personId} API
* localhost:8080/api/persons/1
