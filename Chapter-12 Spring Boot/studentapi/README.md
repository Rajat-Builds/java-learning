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
- `POST /students/add` — add a new student
- `GET /students/search?name=Rajat` — search student by name

**Day 4 — DELETE and PUT Requests, Full CRUD**
- `@DeleteMapping` — handles DELETE requests
- `@PutMapping` — handles PUT requests
- `@RequestParam` with multiple parameters — `?name=Rajat&newMarks=99`
- Added `setMarks()` setter to Student class
- Built complete CRUD API — Create, Read, Update, Delete all working
- Tested all 4 operations in Postman
- HTTP status codes — `200 OK`, `404 Not Found`, `400 Bad Request`, `405 Method Not Allowed`

**Day 5 — Service Layer**
- Why Controller should not contain business logic
- Controller — only receives request and calls service
- Service — contains all the actual logic — finding, adding, deleting, updating
- `@Service` — tells Spring Boot this class is a service
- `@Autowired` — Spring Boot automatically creates and injects the service
- Dependency Injection — Spring manages object creation, no need to write `new ServiceName()`
- Refactored entire StudentController to use StudentService

### Complete API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Get all students |
| GET | `/students/search?name=Rajat` | Search student by name |
| POST | `/students/add` | Add a new student |
| PUT | `/students/update?name=Rajat&newMarks=99` | Update student marks |
| DELETE | `/students/delete?name=Rajat` | Delete a student |

### Key concepts
- Spring Boot auto-configures everything — no complex setup needed
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` map HTTP methods to Java methods
- `@RequestBody` converts incoming JSON to a Java object automatically
- `@RequestParam` reads query parameters from the URL
- CRUD = Create, Read, Update, Delete — the four basic operations of any API
- Controller handles requests, Service handles logic — always keep them separate
- `@Autowired` and Dependency Injection are core Spring Boot concepts asked in every interview
- Postman is used to test API endpoints without a frontend
