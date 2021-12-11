package com.ajio.stats.repository;

import com.ajio.stats.entity.UserStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStatsRepo extends JpaRepository<UserStats, Long> {
}
