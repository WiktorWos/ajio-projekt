package com.ajio.stats.repository;

import com.ajio.stats.entity.SetStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetStatsRepo extends JpaRepository<SetStats, Long> {
}
