package com.trump.progress;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ProgressBar {

    public ProgressBar() {
    }

    public ProgressBar(String description, String title, int increments, int currentIncrement, LocalDate startDate, LocalDate endDate, ProgressUser user) {
        this.description = description;
        this.title = title;
        this.increments = increments;
        this.currentIncrement = currentIncrement;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
    }

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String description;
    @Column
    private String title;
    @Column
    private int increments;
    @Column
    private int currentIncrement;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;

    @ManyToOne
    private ProgressUser user;

}
