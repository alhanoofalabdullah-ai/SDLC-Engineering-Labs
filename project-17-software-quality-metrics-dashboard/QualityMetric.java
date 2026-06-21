package com.alhanoof.sdlc.quality.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quality_metrics")
public class QualityMetric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer totalTestCases;

    private Integer passedTests;

    private Integer failedTests;

    private Integer openDefects;

    private Integer closedDefects;

    private Integer criticalDefects;

    private Integer openRisks;

    private Integer mitigatedRisks;

    private Integer successfulReleases;

    private Integer failedReleases;

    private Integer uatPassed;

    private Integer uatFailed;

    public QualityMetric() {}

    public Long getId() {
        return id;
    }

    public Integer getTotalTestCases() {
        return totalTestCases;
    }

    public void setTotalTestCases(Integer totalTestCases) {
        this.totalTestCases = totalTestCases;
    }

    public Integer getPassedTests() {
        return passedTests;
    }

    public void setPassedTests(Integer passedTests) {
        this.passedTests = passedTests;
    }

    public Integer getFailedTests() {
        return failedTests;
    }

    public void setFailedTests(Integer failedTests) {
        this.failedTests = failedTests;
    }

    public Integer getOpenDefects() {
        return openDefects;
    }

    public void setOpenDefects(Integer openDefects) {
        this.openDefects = openDefects;
    }

    public Integer getClosedDefects() {
        return closedDefects;
    }

    public void setClosedDefects(Integer closedDefects) {
        this.closedDefects = closedDefects;
    }

    public Integer getCriticalDefects() {
        return criticalDefects;
    }

    public void setCriticalDefects(Integer criticalDefects) {
        this.criticalDefects = criticalDefects;
    }

    public Integer getOpenRisks() {
        return openRisks;
    }

    public void setOpenRisks(Integer openRisks) {
        this.openRisks = openRisks;
    }

    public Integer getMitigatedRisks() {
        return mitigatedRisks;
    }

    public void setMitigatedRisks(Integer mitigatedRisks) {
        this.mitigatedRisks = mitigatedRisks;
    }

    public Integer getSuccessfulReleases() {
        return successfulReleases;
    }

    public void setSuccessfulReleases(Integer successfulReleases) {
        this.successfulReleases = successfulReleases;
    }

    public Integer getFailedReleases() {
        return failedReleases;
    }

    public void setFailedReleases(Integer failedReleases) {
        this.failedReleases = failedReleases;
    }

    public Integer getUatPassed() {
        return uatPassed;
    }

    public void setUatPassed(Integer uatPassed) {
        this.uatPassed = uatPassed;
    }

    public Integer getUatFailed() {
        return uatFailed;
    }

    public void setUatFailed(Integer uatFailed) {
        this.uatFailed = uatFailed;
    }
}
