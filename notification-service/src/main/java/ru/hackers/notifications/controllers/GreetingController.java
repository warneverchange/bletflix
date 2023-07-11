package ru.hackers.notifications.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hackers.clients.auth.AuthClient;


@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
public class GreetingController {
    private final AuthClient authClient;

    @GetMapping("/greeting")
    public String getGreeting() {
        return authClient.getGreeting();
    }
}
