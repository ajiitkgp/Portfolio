package com.analjyoti.portfolio.service;

import com.analjyoti.portfolio.dto.ContactRequest;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Value("${sendgrid.api.key}")
    private String sendGridApiKey;

    @Value("${contact.recipient.email}")
    private String recipientEmail;

    public void sendContactEmail(ContactRequest contactRequest) {
        logger.info("Attempting to send email via SendGrid to: {}", recipientEmail);

        try {
            Email from = new Email(recipientEmail); // Must be verified in SendGrid
            Email to = new Email(recipientEmail);
            String subject = "Portfolio Contact: " + contactRequest.getSubject();

            String emailBody = String.format(
                "New contact form submission from your portfolio:\n\n" +
                "Name: %s\n" +
                "Email: %s\n" +
                "Subject: %s\n\n" +
                "Message:\n%s\n\n" +
                "---\n" +
                "Reply to: %s\n" +
                "This email was sent from your portfolio contact form.",
                contactRequest.getName(),
                contactRequest.getEmail(),
                contactRequest.getSubject(),
                contactRequest.getMessage(),
                contactRequest.getEmail()
            );

            Content content = new Content("text/plain", emailBody);
            Mail mail = new Mail(from, subject, to, content);
            
            // Set reply-to address to the person who submitted the form
            mail.setReplyTo(new Email(contactRequest.getEmail()));

            SendGrid sg = new SendGrid(sendGridApiKey);
            Request request = new Request();
            
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            logger.info("Sending email with subject: {}", subject);
            
            Response response = sg.api(request);

            if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
                logger.info("Email sent successfully via SendGrid. Status: {}", response.getStatusCode());
            } else {
                logger.error("SendGrid returned non-success status: {}. Body: {}", 
                    response.getStatusCode(), response.getBody());
                throw new RuntimeException("Failed to send email. Status: " + response.getStatusCode());
            }

        } catch (IOException e) {
            logger.error("Failed to send email via SendGrid. Error: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to send email: " + e.getMessage(), e);
        }
    }
}
