package com.rajat.studentapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>();
    
    public List<Student> getAllStudents(){
        return students;
    }


    public String addStudent(Student student) {
    students.add(student);
    return "Student added: " + student.getName();
}

 public String searchStudent( String name) {
        for (Student student : students){
            if (student.getName().equals(name)) {
                return student.getName() + " found!";
            }
        }
        return "Student not found";
    }

     public String deleteStudent ( String name){
            for(Student student : students){
                if (student.getName().equals(name)) {
                    students.remove(student);
                    return "Student deleted: " +name;
                } 
        }
        return "Student not found";
    }

     public String updateStudent( String name, double newMarks){
for(Student student : students){
    if(student.getName().equals(name)) {
        student.setMarks(newMarks);
        return "Marks update for: " + name;
    }
}
return "Student not found";
    }
    
        
    }


