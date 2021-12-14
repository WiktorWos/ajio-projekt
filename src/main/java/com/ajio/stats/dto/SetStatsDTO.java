package com.ajio.stats.dto;

import javax.validation.constraints.NotNull;

public class SetStatsDTO {
    @NotNull
    private Long userID;
    @NotNull
    private Integer doneFlashcards;
    @NotNull
    private Integer correctFlashcards;
    @NotNull
    private Integer learned;
    @NotNull
    private Integer recordedTime;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Integer getDoneFlashcards() {
        return doneFlashcards;
    }

    public void setDoneFlashcards(Integer doneFlashcards) {
        this.doneFlashcards = doneFlashcards;
    }

    public Integer getCorrectFlashcards() {
        return correctFlashcards;
    }

    public void setCorrectFlashcards(Integer correctFlashcards) {
        this.correctFlashcards = correctFlashcards;
    }

    public Integer getLearned() {
        return learned;
    }

    public void setLearned(Integer learned) {
        this.learned = learned;
    }

    public Integer getRecordedTime() {
        return recordedTime;
    }

    public void setRecordedTime(Integer recordedTime) {
        this.recordedTime = recordedTime;
    }
}
