package com.ajio.stats.repository;

import com.ajio.stats.entity.SetStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetStatsRepo extends JpaRepository<SetStats, Long> {
    SetStats findBySetID(Long setID);
}
