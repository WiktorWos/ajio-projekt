package com.ajio.stats.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity()
@Table(name = "time_logs")
public class TimeLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recorded_day")
    private LocalDate date;

    @Column(name = "recorded_minutes")
    private Integer minutes;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "user_id")
//    @JsonBackReference
//    private UserStats userStats;

    @Column(name = "stats_id")
    private Long userID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}
