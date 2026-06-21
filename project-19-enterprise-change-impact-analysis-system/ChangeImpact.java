package com.alhanoof.sdlc.changeimpact.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "change_impacts")
public class ChangeImpact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String changeCode;

    private String changeTitle;

    @Column(length = 3000)
    private String description;

    private String impactedModule;

    private String impactedRequirement;

    private String impactedRelease;

    private String impactedUAT;

    private String riskLevel;

    private String impactLevel;

    private String owner;

    private LocalDate assessmentDate;

    public ChangeImpact() {
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

    public String getChangeTitle() {
        return changeTitle;
    }

    public void setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImpactedModule() {
        return impactedModule;
    }

    public void setImpactedModule(String impactedModule) {
        this.impactedModule = impactedModule;
    }

    public String getImpactedRequirement() {
        return impactedRequirement;
    }

    public void setImpactedRequirement(String impactedRequirement) {
        this.impactedRequirement = impactedRequirement;
    }

    public String getImpactedRelease() {
        return impactedRelease;
    }

    public void setImpactedRelease(String impactedRelease) {
        this.impactedRelease = impactedRelease;
    }

    public String getImpactedUAT() {
        return impactedUAT;
    }

    public void setImpactedUAT(String impactedUAT) {
        this.impactedUAT = impactedUAT;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getImpactLevel() {
        return impactLevel;
    }

    public void setImpactLevel(String impactLevel) {
        this.impactLevel = impactLevel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }
}
