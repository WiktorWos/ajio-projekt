package com.ajio.stats.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "set_stats")
public class SetStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "set_id")
    private Long setID;

    @Column(name = "done_flahcards")
    private Integer doneFlashcards;

    @Column(name = "correct_flashcards")
    private Integer correctFlashcards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSetID() {
        return setID;
    }

    public void setSetID(Long setID) {
        this.setID = setID;
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
}
