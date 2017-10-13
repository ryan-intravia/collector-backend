package com.collector.collectorbackend.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/health")
@RestController
public class HealthController {

    @GetMapping
    public ResponseEntity getHealthStatus() {
        return ResponseEntity.ok("Alive and well!");
    }
}