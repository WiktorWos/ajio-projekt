package com.ajio.stats.controller;

import com.ajio.stats.entity.UserStats;
import com.ajio.stats.service.UserStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
public class StatisticsController {
    private UserStatsService userStatsService;

    @Autowired
    public StatisticsController(UserStatsService userStatsService) {
        this.userStatsService = userStatsService;
    }

    @GetMapping("/{userID}")
    public ResponseEntity<UserStats> getUserStatsByID(@PathVariable Long userID) {
        UserStats stats = userStatsService.getStatsByUserID(userID);
        return ResponseEntity.ok(stats);
    }
}
