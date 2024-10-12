package com.example.profilingspring;

import com.example.profilingspring.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilingSpringApplication implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    @Value("${message}")
    private String message;


    public static void main(String[] args) {
        SpringApplication.run(ProfilingSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(message);

        emailService.sendEmail("john.doe@example.com", "Welcome to Our Service!", "Hello and welcome to Our Service!");
    }
}
