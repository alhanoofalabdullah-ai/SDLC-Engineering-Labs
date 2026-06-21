package com.alhanoof.sdlc.devops.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pipelines")
public class Pipeline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pipelineName;

    private String repositoryName;

    private String buildNumber;

    private String environment;

    private String status;

    private String triggeredBy;

    private LocalDateTime buildStartTime;

    private LocalDateTime buildEndTime;

    private LocalDateTime deploymentTime;

    public Pipeline() {
    }

    public Long getId() {
        return id;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public LocalDateTime getBuildStartTime() {
        return buildStartTime;
    }

    public void setBuildStartTime(LocalDateTime buildStartTime) {
        this.buildStartTime = buildStartTime;
    }

    public LocalDateTime getBuildEndTime() {
        return buildEndTime;
    }

    public void setBuildEndTime(LocalDateTime buildEndTime) {
        this.buildEndTime = buildEndTime;
    }

    public LocalDateTime getDeploymentTime() {
        return deploymentTime;
    }

    public void setDeploymentTime(LocalDateTime deploymentTime) {
        this.deploymentTime = deploymentTime;
    }
}
