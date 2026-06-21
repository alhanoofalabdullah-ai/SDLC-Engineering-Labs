package com.alhanoof.sdlc.configuration.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "baselines")
public class Baseline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String baselineCode;

    private String baselineName;

    private String releaseVersion;

    private String approvedBy;

    private LocalDate baselineDate;

    private String status;

    public Baseline() {
    }

    public Long getId() {
        return id;
    }

    public String getBaselineCode() {
        return baselineCode;
    }

    public void setBaselineCode(String baselineCode) {
        this.baselineCode = baselineCode;
    }

    public String getBaselineName() {
        return baselineName;
    }

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public LocalDate getBaselineDate() {
        return baselineDate;
    }

    public void setBaselineDate(LocalDate baselineDate) {
        this.baselineDate = baselineDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
