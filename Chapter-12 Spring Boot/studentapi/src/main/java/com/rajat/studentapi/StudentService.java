package com.rajat.studentapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    public boolean deleteStudentById(int id) {
         Optional<Student> studentOptional = studentRepository.findById(id);
       
            if (studentOptional.isPresent()) {
                studentRepository.deleteById(id);
                return true;
            }
        
        return false;
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

    public Student searchStudent(String name) {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student ;
            }
        }
        return null ;
    }

   public Student getStudentById(int id) {
    Optional<Student> studentOptional = studentRepository.findById(id);
    if (studentOptional.isPresent()) {
        return studentOptional.get();
    }
    return null;
}
}


