package com.alhanoof.sdlc.configuration.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "configuration_items")
public class ConfigurationItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ciCode;

    private String ciName;

    private String ciType;

    private String environment;

    private String owner;

    private String status;

    private String releaseVersion;

    private LocalDate createdDate;

    public ConfigurationItem() {
    }

    public Long getId() {
        return id;
    }

    public String getCiCode() {
        return ciCode;
    }

    public void setCiCode(String ciCode) {
        this.ciCode = ciCode;
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    public String getCiType() {
        return ciType;
    }

    public void setCiType(String ciType) {
        this.ciType = ciType;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
