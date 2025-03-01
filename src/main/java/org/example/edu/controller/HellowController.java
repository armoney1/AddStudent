package org.example.edu.controller;

import org.example.edu.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    @GetMapping("/Hello")
    public String Hello(String name) {
        return "Hello " + name;
    }


    @GetMapping("/student")
    public Student getStudent() {
        Student st = new Student(1, "Valer", "valera@ya.ru", 19);
        return st;
    }
}