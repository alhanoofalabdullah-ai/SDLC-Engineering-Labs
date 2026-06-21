package com.alhanoof.sdlc.agile.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sprints")
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sprintCode;

    private String sprintName;

    @Column(length = 2000)
    private String sprintGoal;

    private LocalDate startDate;

    private LocalDate endDate;

    private String status;

    private Integer plannedStoryPoints;

    private Integer completedStoryPoints;

    private String scrumMaster;

    public Sprint() {
    }

    public Sprint(
            String sprintCode,
            String sprintName,
            String sprintGoal,
            LocalDate startDate,
            LocalDate endDate,
            String status,
            Integer plannedStoryPoints,
            Integer completedStoryPoints,
            String scrumMaster
    ) {
        this.sprintCode = sprintCode;
        this.sprintName = sprintName;
        this.sprintGoal = sprintGoal;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.plannedStoryPoints = plannedStoryPoints;
        this.completedStoryPoints = completedStoryPoints;
        this.scrumMaster = scrumMaster;
    }

    public Long getId() {
        return id;
    }

    public String getSprintCode() {
        return sprintCode;
    }

    public void setSprintCode(String sprintCode) {
        this.sprintCode = sprintCode;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public String getSprintGoal() {
        return sprintGoal;
    }

    public void setSprintGoal(String sprintGoal) {
        this.sprintGoal = sprintGoal;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPlannedStoryPoints() {
        return plannedStoryPoints;
    }

    public void setPlannedStoryPoints(Integer plannedStoryPoints) {
        this.plannedStoryPoints = plannedStoryPoints;
    }

    public Integer getCompletedStoryPoints() {
        return completedStoryPoints;
    }

    public void setCompletedStoryPoints(Integer completedStoryPoints) {
        this.completedStoryPoints = completedStoryPoints;
    }

    public String getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(String scrumMaster) {
        this.scrumMaster = scrumMaster;
    }
}
