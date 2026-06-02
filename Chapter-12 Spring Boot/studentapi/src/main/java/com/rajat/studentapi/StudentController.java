package com.rajat.studentapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        Student s = new Student("Rajat", 20, 85.5);
        return s;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rajat", 20, 85.5));
        students.add(new Student("Peehu", 19, 95.5));
        students.add(new Student("Krishna", 21, 99.9));
        return students;
    }
}