package com.analjyoti.portfolio.controller;

import com.analjyoti.portfolio.dto.ContactRequest;
import com.analjyoti.portfolio.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ContactController {

    private final EmailService emailService;

    public ContactController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/contact")
    public ResponseEntity<Map<String, String>> submitContactForm(@RequestBody ContactRequest contactRequest) {
        Map<String, String> response = new HashMap<>();
        
        try {
            if (contactRequest.getName() == null || contactRequest.getName().trim().isEmpty() ||
                contactRequest.getEmail() == null || contactRequest.getEmail().trim().isEmpty() ||
                contactRequest.getSubject() == null || contactRequest.getSubject().trim().isEmpty() ||
                contactRequest.getMessage() == null || contactRequest.getMessage().trim().isEmpty()) {
                
                response.put("status", "error");
                response.put("message", "All fields are required");
                return ResponseEntity.badRequest().body(response);
            }
            
            if (!contactRequest.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                response.put("status", "error");
                response.put("message", "Invalid email format");
                return ResponseEntity.badRequest().body(response);
            }
            
            emailService.sendContactEmail(contactRequest);
            
            response.put("status", "success");
            response.put("message", "Thank you for your message! I will get back to you soon.");
            return ResponseEntity.ok(response);
            
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Failed to send message. Please try again later or contact me directly via email.");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}

