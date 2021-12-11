package com.ajio.stats.repository;

import com.ajio.stats.entity.UserStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatsRepo extends JpaRepository<UserStats, Long> {
    UserStats findByUserID(Long userID);
}
