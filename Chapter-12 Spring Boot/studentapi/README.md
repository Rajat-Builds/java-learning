## Chapter 12 — Spring Boot Introduction

### What I learned

- What Spring Boot is — a framework to build REST APIs in Java
- Setting up a Spring Boot project using start.spring.io
- Running the server using `.\mvnw spring-boot:run`
- Server runs on port 8080 by default
- `@RestController` — marks a class as a web request handler
- `@GetMapping` — maps a URL path to a method
- What a REST API endpoint is and how it works
- Created 3 working endpoints — `/hello`, `/welcome`, `/info`

### Key concepts
- Spring Boot removes the need for complex configuration — it auto-configures everything
- Every endpoint is a method inside a `@RestController` class
- `@GetMapping("/path")` tells Spring which URL triggers which method
- The server listens on port 8080 — you access it via `http://localhost:8080`
- Spring Boot is the most used Java framework in backend development
