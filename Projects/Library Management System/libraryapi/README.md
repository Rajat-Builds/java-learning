# Library Management REST API

A Spring Boot REST API for managing library books with full CRUD operations.

## Technologies Used
- Java
- Spring Boot
- MySQL
- Spring Data JPA
- Postman (for testing)

## Features
- Add, update, delete books
- Get all books or search by ID
- Search books by author
- Find books below a certain price
- Input validation with proper error responses

## How to Run
1. Start MySQL server
2. Create database: CREATE DATABASE librarydb;
3. Run: mvnw spring-boot:run
4. Test endpoints via Postman on localhost:8080
