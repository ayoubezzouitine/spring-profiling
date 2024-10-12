package com.example.profilingspring.service.impl;

import com.example.profilingspring.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEmailService implements EmailService {
    private static final Logger logger = LoggerFactory.getLogger(ProdEmailService.class);

    @Override
    public void sendEmail(String to, String subject, String content) {
        logger.error("Sending real email to: {}, subject: {}, content: {}", to, subject, content);    }
}
