package com.example.profilingspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilingSpringApplication implements CommandLineRunner {

    @Value("${message}")
    private String message;


    public static void main(String[] args) {
        SpringApplication.run(ProfilingSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
              System.out.println(message);
    }
}
