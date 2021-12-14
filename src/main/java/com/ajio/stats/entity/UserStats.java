package com.ajio.stats.entity;

import com.ajio.stats.dto.UserStatsDTO;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_stats")
public class UserStats implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "done_flashcards")
    private Integer doneFlashcards;

    @Column(name = "correct_flashcards")
    private Integer correctFlashcards;

    @Column(name = "learned_num")
    private Integer learnedNum;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "stats_id", referencedColumnName="id")
    private List<TimeLogs> timeLogs = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getLearnedNum() {
        return learnedNum;
    }

    public void setLearnedNum(Integer learnedNum) {
        this.learnedNum = learnedNum;
    }

    public List<TimeLogs> getTimeLogs() {
        return timeLogs;
    }

    public void setTimeLogs(List<TimeLogs> timeLogs) {
        this.timeLogs = timeLogs;
    }

    public void addTimeLog(TimeLogs timeLogs) {
        this.timeLogs.add(timeLogs);
    }

    public UserStats convertFromDTO(UserStatsDTO dto) {
        this.userID = dto.getUserID();
        this.doneFlashcards = dto.getDoneFlashcards();
        this.correctFlashcards = dto.getCorrectFlashcards();
        this.learnedNum = dto.getLearned();
        TimeLogs timeLog = new TimeLogs();
        timeLog.setMinutes(dto.getRecordedTime());
        timeLog.setDate(LocalDate.now());
        timeLogs.add(timeLog);
        return this;
    }
}
