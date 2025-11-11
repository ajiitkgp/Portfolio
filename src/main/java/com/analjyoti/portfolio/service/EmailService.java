package com.analjyoti.portfolio.service;

import com.analjyoti.portfolio.dto.ContactRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    private final JavaMailSender mailSender;

    @Value("${contact.recipient.email}")
    private String recipientEmail;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendContactEmail(ContactRequest contactRequest) {
        try {
            logger.info("Attempting to send email to: {}", recipientEmail);

            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(recipientEmail);
            message.setFrom(contactRequest.getEmail());
            message.setReplyTo(contactRequest.getEmail());
            message.setSubject("Portfolio Contact: " + contactRequest.getSubject());

            String emailBody = String.format(
                "New contact form submission from your portfolio:\n\n" +
                "Name: %s\n" +
                "Email: %s\n" +
                "Subject: %s\n\n" +
                "Message:\n%s\n\n" +
                "---\n" +
                "This email was sent from your portfolio contact form.",
                contactRequest.getName(),
                contactRequest.getEmail(),
                contactRequest.getSubject(),
                contactRequest.getMessage()
            );

            message.setText(emailBody);

            mailSender.send(message);

            logger.info("Email sent successfully to: {}", recipientEmail);

        } catch (Exception e) {
            logger.error("Failed to send email. Recipient: {}, Error: {}", recipientEmail, e.getMessage(), e);
            throw new RuntimeException("Failed to send email: " + e.getMessage(), e);
        }
    }
}

