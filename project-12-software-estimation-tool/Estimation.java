package com.alhanoof.sdlc.estimation.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "estimations")
public class Estimation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    private Integer storyPoints;

    private Integer teamSize;

    private Integer sprintVelocity;

    private Integer estimatedDays;

    private Double estimatedCost;

    private LocalDate estimationDate;

    public Estimation() {
    }

    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(Integer storyPoints) {
        this.storyPoints = storyPoints;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    public Integer getSprintVelocity() {
        return sprintVelocity;
    }

    public void setSprintVelocity(Integer sprintVelocity) {
        this.sprintVelocity = sprintVelocity;
    }

    public Integer getEstimatedDays() {
        return estimatedDays;
    }

    public void setEstimatedDays(Integer estimatedDays) {
        this.estimatedDays = estimatedDays;
    }

    public Double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(Double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public LocalDate getEstimationDate() {
        return estimationDate;
    }

    public void setEstimationDate(LocalDate estimationDate) {
        this.estimationDate = estimationDate;
    }
}
