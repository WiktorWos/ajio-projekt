package com.ajio.stats.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_stats")
public class UserStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "accuracy")
    private Integer accuracy;

    @Column(name = "learned_num")
    private Integer learnedNum;

    @OneToMany(mappedBy = "userStats")
    private List<TimeLogs> timeLogs;

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

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
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
}
