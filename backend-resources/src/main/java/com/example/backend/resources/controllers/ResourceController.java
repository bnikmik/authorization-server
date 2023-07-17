package com.example.backend.resources.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/hello")
    public String getMessages() {
        return "Hello, world";
    }
}
