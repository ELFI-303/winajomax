# Spring Boot Sample

Spring Boot Web application to provide Back-end to WinajoMax app

## 1. Getting started

### 1.1. Initier l'application

```
$ mvn clean install
```

### 1.2. Lancer l'application

```
$ mvn spring-boot:run
```

### 1.3. API

Method | Path           | Description                    |
-------|----------------|--------------------------------|
GET    | /demo/customer | get the current logged user    |
GET    | /demo/olympic  | get all olympic events         |
POST   | /demo/gamble   | save a list of gamble events   | ( also update the customer money )
GET    | /demo/gamble   | get all customer gamble events |

### 1.4. Présentation générale

Spring Boot est un framework pour construire rapidement des applications Java/JEE riches (web ou standalone).

Spring Boot accélère le développement logiciel en proposant un ensemble de conventions, d'abstraction et de mécanismes prêt à l'emploi.

Concrètement, Spring Boot se présente sous la forme d'un POM parent et de dépendances -- a.k.a. des "starters" -- (Maven ou Gradle).

### 1.5 Récupération des données via curl
```
// GET /customer
$ curl -X GET http://localhost:8080/demo/customer -i
    -H "username: Jean"
    -H "password: jeanbg"
    -H "Content-Type: application/json"
// GET /customer
$ curl -X GET http://localhost:8080/demo/olympic -i
    -H "username: Jean"
    -H "password: jeanbg"
    -H "Content-Type: application/json"
// GET /customer
$ curl -X GET http://localhost:8080/demo/gamble -i
    -H "username: Jean"
    -H "password: jeanbg"
    -H "Content-Type: application/json"
// POST /demo/gamble
$ curl -X POST http://localhost:8080/api/demo/gamble -i
    -H "Accept: application/json"
    -H "Content-Type: application/json"
    -H "username: Jean"
    -H "password: jeanbg"
    -d '{"gambleId":1,"userId":1,"amount":100.00,"pay":"France","olympicEvent":"{\"dateTime\":\"2024-07-13T10:00:00\",\"result\":\"Suisse\",\"eventId\":1,\"cote\":\"{\\\"France\\\":\\\"0.73\\\",\\\"Suisse\\\":\\\"2.31\\\",\\\"Espagne\\\":\\\"1.95\\\",\\\"Allemagne\\\":\\\"3.42\\\"}\",\"discipline\":\"tir à l'arc\",\"lieu\":\"Stade de france\",\"participants\":\"{\\\"France\\\": \\\"Didier des champs,Philippe Etchebest,Pascal LGF\\\",\\\"Suisse\\\":\\\"Charle Suisse,Arthur Oclock,JCVD\\\",\\\"Espagne\\\":\\\"Manuel El Toro,Carlos Flamenco,Javier Navarro\\\",\\\"Allemagne\\\":\\\"Fritz Müller,Hans Schmidt,Lena Wagner\\\"}\"}"}'
