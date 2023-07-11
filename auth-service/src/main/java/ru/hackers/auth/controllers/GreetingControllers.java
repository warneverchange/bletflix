package ru.hackers.auth.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class GreetingControllers {
    @GetMapping("greeting")
    public String getGreeting() {
        return "Hello";
    }
}
