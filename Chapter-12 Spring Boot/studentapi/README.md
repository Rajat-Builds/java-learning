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
- `POST /students/add` — add a new student
- `GET /students/search?name=Rajat` — search student by name

**Day 4 — DELETE and PUT Requests, Full CRUD**
- `@DeleteMapping` — handles DELETE requests
- `@PutMapping` — handles PUT requests
- Built complete CRUD API — Create, Read, Update, Delete all working
- Tested all 4 operations in Postman
- HTTP status codes — `200 OK`, `404 Not Found`, `400 Bad Request`, `405 Method Not Allowed`

**Day 5 — Service Layer**
- Controller — only receives request and calls service
- Service — contains all the actual logic
- `@Service` — tells Spring Boot this class is a service
- `@Autowired` — Spring Boot automatically injects the service
- Dependency Injection — Spring manages object creation
- Refactored entire StudentController to use StudentService

**Day 6 — MySQL and JPA Integration**
- Installed MySQL and created `studentdb` database
- Connected Spring Boot to MySQL via `application.properties`
- Added JPA and MySQL dependencies to `pom.xml`
- `@Entity` — marks Student class as a database table
- `@Id` and `@GeneratedValue` — auto assigns unique ID to each student
- `StudentRepository` extends `JpaRepository` — gives free CRUD operations
- Updated StudentService to use repository instead of in-memory list
- Data now saves permanently in MySQL — survives server restarts

**Day 7 — PathVariable and MySQL Revision**
- Revised MySQL, `@Entity`, `@Id`, `@GeneratedValue`, JpaRepository, `application.properties`
- Confirmed data persists in MySQL across server restarts
- `@PathVariable` — extracts value directly from the URL path like `/students/1`
- Difference between `@PathVariable` and `@RequestParam`:
  - `@PathVariable` — value is part of the URL: `/students/{id}`
  - `@RequestParam` — value is a query parameter: `/students/search?name=Rajat`
- Added `GET /students/{id}` — get student by ID

### Complete API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| GET | `/students/search?name=Rajat` | Search student by name |
| POST | `/students/add` | Add a new student |
| PUT | `/students/update?name=Rajat&newMarks=99` | Update student marks |
| DELETE | `/students/delete?name=Rajat` | Delete a student |

### Key concepts
- Controller handles requests, Service handles logic — always keep them separate
- `@Autowired` and Dependency Injection are core Spring Boot concepts asked in every interview
- `@Entity` maps a Java class to a database table
- JpaRepository gives you save, findAll, findById, delete for free — no SQL needed
- Data stored in MySQL is permanent — in-memory list data is lost on server restart
- `@PathVariable` reads from URL path, `@RequestParam` reads from query string
- Postman is used to test API endpoints without a frontend
