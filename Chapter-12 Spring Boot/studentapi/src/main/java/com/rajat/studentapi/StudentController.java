package com.rajat.studentapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();
    @GetMapping("/student")
    public Student getStudent() {
        Student s = new Student("Rajat", 20, 85.5);
        return s;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping("/students/add")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added: " + student.getName();
    }

    @GetMapping("/students/search")
    public String searchStudent(@RequestParam String name) {
        for (Student student : students){
            if (student.getName().equals(name)) {
                return student.getName() + " found!";
            }
        }
        return "Student not found";
    }
    @DeleteMapping("/students/delete")
        public String deleteStudent (@RequestParam String name){
            for(Student student : students){
                if (student.getName().equals(name)) {
                    students.remove(student);
                    return "Student deleted: " +name;
                } 
        }
        return "Student not found";
    }

    @PutMapping("/students/update")
    public String updateStudent(@RequestParam String name, @RequestParam double newMarks){
for(Student student : students){
    if(student.getName().equals(name)) {
        student.setMarks(newMarks);
        return "Marks update for: " + name;
    }
}
return "Student not found";
    }


    
}



