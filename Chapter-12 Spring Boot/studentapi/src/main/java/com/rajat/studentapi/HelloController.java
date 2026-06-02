package com.rajat.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot!";

    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Student API!";
    }

    @GetMapping("/info")
    public String rajat() {
        return "This is my first API!";
    }

    @GetMapping("/topper")
    public Student getTopper() {
        List<Student> students = Arrays.asList(
                new Student("Gopal", 22, 100),
                new Student("Madhav", 20, 98.8),
                new Student("Raj", 18, 89));

        Student topper = students.get(0);
        for (Student student : students) {
            if (student.getMarks() > topper.getMarks()) {
                topper = student;
            }
        }
        return topper;
    }
}
