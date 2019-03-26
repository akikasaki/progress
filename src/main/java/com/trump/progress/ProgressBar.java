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

    public ProgressBar(String description, String title, int increments, int currentIncrement, LocalDate startDate, LocalDate endDate, boolean isActive, ProgressUser user) {
        this.description = description;
        this.title = title;
        this.increments = increments;
        this.currentIncrement = currentIncrement;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
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
    @Column
    private boolean isActive;


    @ManyToOne
    private ProgressUser user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIncrements() {
        return increments;
    }

    public void setIncrements(int increments) {
        this.increments = increments;
    }

    public int getCurrentIncrement() {
        return currentIncrement;
    }

    public void setCurrentIncrement(int currentIncrement) {
        this.currentIncrement = currentIncrement;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ProgressUser getUser() {
        return user;
    }

    public void setUser(ProgressUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ProgressBar{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", increments=" + increments +
                ", currentIncrement=" + currentIncrement +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActive=" + isActive +
                ", user=" + user +
                '}';
    }
}
