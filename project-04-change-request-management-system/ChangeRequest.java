package com.alhanoof.sdlc.changerequest.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "change_requests")
public class ChangeRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String changeCode;

    private String title;

    @Column(length = 3000)
    private String description;

    private String requestedBy;

    private String priority;

    private String impactLevel;

    private String status;

    private LocalDate requestDate;

    private LocalDate targetReleaseDate;

    public ChangeRequest() {
    }

    public Long getId() {
        return id;
    }

    public String getChangeCode() {
        return changeCode;
    }

    public void setChangeCode(String changeCode) {
        this.changeCode = changeCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getImpactLevel() {
        return impactLevel;
    }

    public void setImpactLevel(String impactLevel) {
        this.impactLevel = impactLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public LocalDate getTargetReleaseDate() {
        return targetReleaseDate;
    }

    public void setTargetReleaseDate(LocalDate targetReleaseDate) {
        this.targetReleaseDate = targetReleaseDate;
    }
}
