package com.rajat.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot!" ;

    }
    @GetMapping("/welcome") 
    public String welcome() {
        return "Welcome to Student API!" ;
    } 
    
    @GetMapping("/info")
    public String rajat(){
        return "This is my first API!";
    }
    }



