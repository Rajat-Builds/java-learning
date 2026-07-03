# Library Management REST API

A REST API built with Spring Boot and MySQL to manage a library's book collection.
Built independently to apply Spring Boot concepts learned in Chapter 12.

## Tech Stack
- Java
- Spring Boot
- MySQL
- JPA / Hibernate
- Postman (for testing)

## Features
- Add a new book
- Get all books
- Get book by ID
- Search books by author
- Filter books by price
- Update book details
- Delete a book

## Concepts Used
- `@RestController`, `@Service`, `@Repository` — layered architecture
- `@Entity`, `@Id`, `@GeneratedValue` — JPA mapping to MySQL
- `JpaRepository` — free CRUD operations without writing SQL
- Derived query methods — `findByAuthor()`, `findByPriceLessThan()`
- `Optional` and `isPresent()` — safe database lookups
- `ResponseEntity` — proper HTTP status codes (200, 400, 404)
- Input validation — preventing invalid data from entering the database
- Separation of Concerns — Controller, Service, Repository each have one job

## How to Run
1. Start MySQL and create database: `CREATE DATABASE librarydb;`
2. Update `application.properties` with your MySQL credentials
3. Run the Spring Boot application
4. Test endpoints using Postman on `http://localhost:8080`
