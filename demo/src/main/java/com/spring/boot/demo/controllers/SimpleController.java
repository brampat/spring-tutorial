package com.spring.boot.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    String hello() {
        return "Hello from Spring Boot!";
    }

}
