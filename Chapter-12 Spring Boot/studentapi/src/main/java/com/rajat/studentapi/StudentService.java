package com.rajat.studentapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added: " + student.getName();
    }

    public String deleteStudent(String name) {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                studentRepository.delete(student);
                return "Student deleted: " + name;
            }
        }
        return "Student not found";
    }

    public String updateStudent(String name, double newMarks) {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setMarks(newMarks);
                studentRepository.save(student);
                return "Marks updated for: " + name;
            }
        }
        return "Student not found";
    }

    public String searchStudent(String name) {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student.getName() + " found!";
            }
        }
        return "Student not found";
    }
}


