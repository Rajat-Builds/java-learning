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

**Day 8 — Error Handling**
- `findById().get()` crashes with `500 Internal Server Error` when student doesn't exist
- `Optional` — a container that may or may not hold a value
- `.isPresent()` — safely checks if a value exists before accessing it
- Proper HTTP status codes — `404 Not Found` for missing resources instead of crashing or returning empty `200`
- `ResponseEntity` — controls both the status code and response body
- Updated `getStudentById()` to return `404` properly instead of crashing
- Updated `searchStudent()` to return the actual Student object with proper status codes instead of a plain message
- Real world debugging — used `netstat` to find a process stuck on port 8080, then `taskkill` to kill it

**Day 9 — DELETE by ID**
- Added `deleteStudentById(int id)` in `StudentService.java` using the Optional pattern
- Added `DELETE /students/{id}` endpoint using `@PathVariable` and `ResponseEntity`
- Tested deleting a student by ID — confirmed removal from the database
- Reinforced the find-check-respond pattern: `findById()` → `isPresent()` → return proper status code (200 or 404)

**Day 10 — UPDATE by ID**
- Built `updateStudentById(int id, double newMarks)` using the Optional pattern: find, check, modify, save, return
- Built `PUT /students/{id}` combining `@PathVariable` and `@RequestParam`, using `ResponseEntity`
- Tested updating a student's marks via ID and confirmed it with a GET request
- Completed full CRUD with both name-based and ID-based operations

**Key difference learned — DELETE vs UPDATE return types**
- `deleteStudentById()` only checks existence and deletes — returns a simple `boolean` since no data needs to be sent back
- `updateStudentById()` modifies the object (`student.setMarks(newMarks)`) before saving — must return the actual `Student` object since the caller needs to see the updated data
- This is why delete uses `ResponseEntity<String>` (success message) while update uses `ResponseEntity<Student>` (the updated object)

**Day 11 — Input Validation**
- Discovered the API was accepting invalid data — empty names, negative ages, marks of 999
- Learned the difference between key HTTP error codes:
  - `400 Bad Request` — invalid data sent by the client
  - `404 Not Found` — requested resource doesn't exist
  - `500 Internal Server Error` — server crashed due to a bug
- Added validation logic inside `addStudent()` — checking for empty name, age ≤ 0, and marks outside 0–100 range, returning `null` when invalid
- Updated controller to return `400 Bad Request` when validation fails, `200 OK` when it succeeds
- Real-world debugging — a stray space in the Postman URL (`/students/add%20`) caused a confusing `405 Method Not Allowed` error; learned to check exact URLs carefully when errors seem unrelated to the code
- Killed a stuck process on port 8080 again using `netstat` and `taskkill`
- Manually deleted a bad record directly in MySQL using raw SQL — `DELETE FROM student WHERE id = 4`

### Complete API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID — 200 or 404 |
| GET | `/students/search?name=Rajat` | Search student by name — 200 or 404 |
| POST | `/students/add` | Add a new student |
| PUT | `/students/update?name=Rajat&newMarks=99` | Update student marks by name |
| PUT | `/students/{id}?newMarks=99` | Update student marks by ID |
| DELETE | `/students/delete?name=Rajat` | Delete a student by name |
| DELETE | `/students/{id}` | Delete a student by ID |

### Key concepts
- Controller handles requests, Service handles logic — always keep them separate
- `@Autowired` and Dependency Injection are core Spring Boot concepts asked in every interview
- `@Entity` maps a Java class to a database table
- JpaRepository gives you save, findAll, findById, delete for free — no SQL needed
- Data stored in MySQL is permanent — in-memory list data is lost on server restart
- `@PathVariable` reads from URL path, `@RequestParam` reads from query string
- `Optional` prevents crashes when a value might not exist
- `ResponseEntity` lets you return both data and the correct HTTP status code
- Return type depends on what the caller needs — boolean for delete confirmations, the actual object for updates
- The find-check-respond pattern is the standard way to safely handle database lookups
- Postman is used to test API endpoints without a frontend
