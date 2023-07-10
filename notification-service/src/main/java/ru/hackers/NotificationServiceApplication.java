package ru.hackers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class NotificationServiceApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(NotificationServiceApplication.class);
    }
}