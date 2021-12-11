package com.ajio.stats.service;

import com.ajio.stats.entity.UserStats;
import com.ajio.stats.repository.UserStatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserStatsService {
    private UserStatsRepo userStatsRepo;

    @Autowired
    public UserStatsService(UserStatsRepo userStatsRepo) {
        this.userStatsRepo = userStatsRepo;
    }

    public UserStats getStatsByUserID(Long userID) {
        return userStatsRepo.findByUserID(userID);
    }
}
