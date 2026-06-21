package com.alhanoof.sdlc.traceability.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "traceability_matrix")
public class TraceabilityMatrix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requirementCode;

    private String userStoryCode;

    private String testCaseCode;

    private String uatScenarioCode;

    private String releaseCode;

    private String coverageStatus;

    public TraceabilityMatrix() {
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

    public String getUserStoryCode() {
        return userStoryCode;
    }

    public void setUserStoryCode(String userStoryCode) {
        this.userStoryCode = userStoryCode;
    }

    public String getTestCaseCode() {
        return testCaseCode;
    }

    public void setTestCaseCode(String testCaseCode) {
        this.testCaseCode = testCaseCode;
    }

    public String getUatScenarioCode() {
        return uatScenarioCode;
    }

    public void setUatScenarioCode(String uatScenarioCode) {
        this.uatScenarioCode = uatScenarioCode;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public void setReleaseCode(String releaseCode) {
        this.releaseCode = releaseCode;
    }

    public String getCoverageStatus() {
        return coverageStatus;
    }

    public void setCoverageStatus(String coverageStatus) {
        this.coverageStatus = coverageStatus;
    }
}
