package com.ajio.stats.dto;

import java.time.LocalDate;

public class UserStatsResponseDTO {
    private Integer accuracy;
    private Integer learned;
    private Double averageTimeFromWeek;
    private LocalDate bestDayFromWeek;
    private Integer bestTimeFromWeek;

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getLearned() {
        return learned;
    }

    public void setLearned(Integer learned) {
        this.learned = learned;
    }

    public Double getAverageTimeFromWeek() {
        return averageTimeFromWeek;
    }

    public void setAverageTimeFromWeek(Double averageTimeFromWeek) {
        this.averageTimeFromWeek = averageTimeFromWeek;
    }

    public LocalDate getBestDayFromWeek() {
        return bestDayFromWeek;
    }

    public void setBestDayFromWeek(LocalDate bestDayFromWeek) {
        this.bestDayFromWeek = bestDayFromWeek;
    }

    public Integer getBestTimeFromWeek() {
        return bestTimeFromWeek;
    }

    public void setBestTimeFromWeek(Integer bestTimeFromWeek) {
        this.bestTimeFromWeek = bestTimeFromWeek;
    }
}
