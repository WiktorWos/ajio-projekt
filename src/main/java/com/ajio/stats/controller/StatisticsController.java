package com.ajio.stats.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
public class StatisticsController {
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }
}
