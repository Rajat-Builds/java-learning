package com.rajat.studentapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public Student getStudent() {
        Student s = new Student("Rajat", 20, 85.5);
        return s;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students/add")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

   @GetMapping("/students/search")
public ResponseEntity<Student> searchStudent(@RequestParam String name) {
    Student student = studentService.searchStudent(name);
    if (student == null) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(student);
}

    @DeleteMapping("/students/delete")
    public String deleteStudent(@RequestParam String name) {
        return studentService.deleteStudent(name);
    }

    @PutMapping("/students/update")
    public String updateStudent(@RequestParam String name, @RequestParam double newMarks) {
        return studentService.updateStudent(name, newMarks);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

}
