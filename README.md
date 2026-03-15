# Hack Manager API

A simple RESTful backend service for managing hackathons.
This project demonstrates a standard **Spring Boot architecture** with CRUD APIs for creating, updating, retrieving, and deleting hackathon entries.














It serves as a learning project for implementing REST APIs using Spring Boot.


---

## Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Lombok
* Maven

---

## Project Structure

```
hack-manager
│
├── src
│   └── main
│       ├── java
│       │   └── com.hackmanager
│       │       ├── controller
│       │       │   └── HackController.java
│       │       ├── service
│       │       │   └── HackService.java
│       │       ├── repository
│       │       │   └── HackRepository.java
│       │       ├── model
│       │       │   └── Hack.java
│       │       ├── dto
│       │       │   └── HackRequestDTO.java
│       │       ├── exception
│       │       │   └── GlobalExceptionHandler.java
│       │       └── HackManagerApplication.java
│       │
│       └── resources
│           └── application.properties
│
└── pom.xml
```

---

## Features

* Create a hackathon entry
* Retrieve all hackathons
* Retrieve a hackathon by ID
* Update hackathon details
* Delete a hackathon
* Filter hackathons by completion status

---

## Running the Project

From the project root directory:

```
mvn spring-boot:run
```

The server will start at:

```
http://localhost:8080
```

---

## Example Request

### Create Hackathon

**POST**

```
/api/hacks
```

Request body:

```json
{
  "title": "AI Hackathon",
  "description": "Build innovative AI solutions",
  "completed": false
}
```

---

## Database

The application uses an **H2 in-memory database** for development.

H2 console:

```
http://localhost:8080/h2-console
```

Connection settings:

```
JDBC URL: jdbc:h2:mem:hackdb
Username: sa
Password: (empty)
```

---

## Future Improvements

Potential enhancements:

* Authentication and authorization (JWT)
* User and team management
* Hackathon registration workflows
* Pagination and sorting
* API documentation with Swagger/OpenAPI
* PostgreSQL integration
* Docker containerization

---

## License

MIT License
This project is intended for personal use.
