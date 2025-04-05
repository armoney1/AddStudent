package org.example.edu.controller;

import org.example.edu.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

}
