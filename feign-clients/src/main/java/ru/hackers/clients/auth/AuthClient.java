package ru.hackers.clients.auth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "auth-service"
)
public interface AuthClient {
    @GetMapping("/api/v1/greeting")
    String getGreeting();
}
