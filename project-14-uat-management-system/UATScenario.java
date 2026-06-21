package com.alhanoof.sdlc.uat.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "uat_scenarios")
public class UATScenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scenarioCode;

    private String scenarioName;

    @Column(length = 3000)
    private String businessRequirement;

    private String businessOwner;

    private String testerName;

    private String status;

    private String signOffStatus;

    private LocalDate executionDate;

    private LocalDate signOffDate;

    public UATScenario() {}

    public Long getId() {
        return id;
    }

    public String getScenarioCode() {
        return scenarioCode;
    }

    public void setScenarioCode(String scenarioCode) {
        this.scenarioCode = scenarioCode;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public String getBusinessRequirement() {
        return businessRequirement;
    }

    public void setBusinessRequirement(String businessRequirement) {
        this.businessRequirement = businessRequirement;
    }

    public String getBusinessOwner() {
        return businessOwner;
    }

    public void setBusinessOwner(String businessOwner) {
        this.businessOwner = businessOwner;
    }

    public String getTesterName() {
        return testerName;
    }

    public void setTesterName(String testerName) {
        this.testerName = testerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSignOffStatus() {
        return signOffStatus;
    }

    public void setSignOffStatus(String signOffStatus) {
        this.signOffStatus = signOffStatus;
    }

    public LocalDate getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }

    public LocalDate getSignOffDate() {
        return signOffDate;
    }

    public void setSignOffDate(LocalDate signOffDate) {
        this.signOffDate = signOffDate;
    }
}
