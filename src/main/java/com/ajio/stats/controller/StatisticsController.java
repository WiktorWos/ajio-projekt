package com.ajio.stats.controller;

import com.ajio.stats.dto.SetStatsDTO;
import com.ajio.stats.dto.UserStatsResponseDTO;
import com.ajio.stats.entity.UserStats;
import com.ajio.stats.service.UserStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/stats")
public class StatisticsController {
    private UserStatsService userStatsService;

    @Autowired
    public StatisticsController(UserStatsService userStatsService) {
        this.userStatsService = userStatsService;
    }

    @GetMapping("/{userID}")
    public ResponseEntity<UserStatsResponseDTO> getUserStatsByID(@PathVariable Long userID) {
        UserStatsResponseDTO stats = userStatsService.getStatsByUserID(userID);
        return ResponseEntity.ok(stats);
    }

    @PostMapping
    public ResponseEntity<Void> updateStats(@RequestBody @Validated SetStatsDTO dto) throws Exception {
        userStatsService.setUserStats(dto);
        return ResponseEntity.created(new URI("")).build();
    }
}
