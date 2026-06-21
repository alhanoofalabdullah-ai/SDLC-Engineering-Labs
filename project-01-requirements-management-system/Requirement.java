package com.alhanoof.sdlc.requirements.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "requirements")
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requirementCode;

    private String title;

    @Column(length = 3000)
    private String description;

    private String businessOwner;

    private String priority;

    private String status;

    private String sdlcPhase;

    private LocalDate createdDate;

    public Requirement() {
    }

    public Requirement(String requirementCode, String title, String description,
                       String businessOwner, String priority, String status,
                       String sdlcPhase, LocalDate createdDate) {
        this.requirementCode = requirementCode;
        this.title = title;
        this.description = description;
        this.businessOwner = businessOwner;
        this.priority = priority;
        this.status = status;
        this.sdlcPhase = sdlcPhase;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public String getRequirementCode() {
        return requirementCode;
    }

    public void setRequirementCode(String requirementCode) {
        this.requirementCode = requirementCode;
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

    public String getBusinessOwner() {
        return businessOwner;
    }

    public void setBusinessOwner(String businessOwner) {
        this.businessOwner = businessOwner;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSdlcPhase() {
        return sdlcPhase;
    }

    public void setSdlcPhase(String sdlcPhase) {
        this.sdlcPhase = sdlcPhase;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
