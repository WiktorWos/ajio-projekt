package com.ajio.stats.controller;

import com.ajio.stats.dto.SetStatsDTO;
import com.ajio.stats.dto.SetStatsResponseDTO;
import com.ajio.stats.dto.UserStatsDTO;
import com.ajio.stats.dto.UserStatsResponseDTO;
import com.ajio.stats.service.SetStatsService;
import com.ajio.stats.service.UserStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/stats/set")
public class SetStatisticsController {
    private SetStatsService setstatsService;

    @Autowired
    public SetStatisticsController(SetStatsService setstatsService) {
        this.setstatsService = setstatsService;
    }

    @GetMapping("/{setID}")
    public ResponseEntity<SetStatsResponseDTO> getSetStatsByID(@PathVariable Long setID) {
        SetStatsResponseDTO stats = setstatsService.getStatsBySetID(setID);
        return ResponseEntity.ok(stats);
    }

    @PostMapping
    public ResponseEntity<Void> updateStats(@RequestBody @Validated SetStatsDTO dto) throws Exception {
        setstatsService.setSetStats(dto);
        return ResponseEntity.created(new URI("")).build();
    }
}
