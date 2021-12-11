package com.ajio.stats.repository;

import com.ajio.stats.entity.TimeLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeLogsRepo extends JpaRepository<TimeLogs, Long> {
}
