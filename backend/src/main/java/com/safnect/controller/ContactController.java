package com.safnect.controller;

import com.safnect.model.ContactForm;
import com.safnect.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactFormRepository contactFormRepository;

    @PostMapping("/contact")
    public ResponseEntity<Map<String, Object>> submitContactForm(@RequestBody ContactForm contactForm) {
        ContactForm saved = contactFormRepository.save(contactForm);

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Thank you for contacting us! We will get back to you soon.");
        response.put("id", saved.getId());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> healthCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "SAFNECT Backend API");
        return ResponseEntity.ok(response);
    }
}
