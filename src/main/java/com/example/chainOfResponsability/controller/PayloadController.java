package com.example.chainOfResponsability.controller;

import com.example.chainOfResponsability.dto.PayloadDTO;
import com.example.chainOfResponsability.service.ChainOfResponsibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payload")
public class PayloadController {

    @Autowired
    private ChainOfResponsibilityService service;

    @PostMapping
    public ResponseEntity<String> processPayload(@RequestBody PayloadDTO payload) {
        service.processPayload(payload);
        return ResponseEntity.ok("Payload procesado exitosamente");
    }
}
