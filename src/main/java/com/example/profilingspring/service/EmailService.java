package com.example.profilingspring.service;

public interface EmailService {
    void sendEmail(String to, String subject, String content);
}
