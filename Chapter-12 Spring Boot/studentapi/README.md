## Chapter 12 — Spring Boot

### What I learned

**Day 1 — Introduction**
- What Spring Boot is — a framework to build REST APIs in Java
- Setting up a Spring Boot project using start.spring.io
- Running the server using `.\mvnw spring-boot:run`
- Server runs on port 8080 by default
- `@RestController` — marks a class as a web request handler
- `@GetMapping` — maps a URL path to a method
- Created 3 working endpoints — `/hello`, `/welcome`, `/info`

**Day 2 — Returning JSON**
- Created `Student.java` model class with getters
- Getters are required for Spring Boot to convert objects to JSON
- `/student` — returns a single Student object as JSON
- `/students` — returns a list of students as JSON array
- Spring Boot automatically converts Java objects to JSON — no extra code needed
- Installed and used Postman to test GET requests
- `200 OK` — means the request was successful

**Day 3 — POST Requests**
- `@PostMapping` — handles POST requests
- `@RequestBody` — converts incoming JSON to Java object automatically
- `@RequestParam` — receives query parameters from URL like `?name=Rajat`
- Stored students in a class level list so data persists during server runtime
- Built full flow — POST a student, GET all students, Search by name
- Tested everything in Postman
- `POST /students/add` — add a new student
- `GET /students/search?name=Rajat` — search student by name

### Key concepts
- Spring Boot auto-configures everything — no complex setup needed
- Every endpoint is a method inside a `@RestController` class
- `@GetMapping` maps GET requests, `@PostMapping` maps POST requests
- `@RequestBody` converts incoming JSON to a Java object automatically
- `@RequestParam` reads query parameters from the URL
- Getters must be present in model classes for JSON conversion to work
- Postman is used to test API endpoints without a frontend
- Spring Boot is the most used Java framework in backend development
