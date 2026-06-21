package com.alhanoof.sdlc.release.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "releases")
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String releaseCode;

    private String releaseName;

    private String versionNumber;

    private String environment;

    private String status;

    private String releaseManager;

    private LocalDate plannedReleaseDate;

    private LocalDate actualReleaseDate;

    @Column(length = 3000)
    private String releaseNotes;

    public Release() {
    }

    public Long getId() {
        return id;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public void setReleaseCode(String releaseCode) {
        this.releaseCode = releaseCode;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
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

    public String getReleaseManager() {
        return releaseManager;
    }

    public void setReleaseManager(String releaseManager) {
        this.releaseManager = releaseManager;
    }

    public LocalDate getPlannedReleaseDate() {
        return plannedReleaseDate;
    }

    public void setPlannedReleaseDate(LocalDate plannedReleaseDate) {
        this.plannedReleaseDate = plannedReleaseDate;
    }

    public LocalDate getActualReleaseDate() {
        return actualReleaseDate;
    }

    public void setActualReleaseDate(LocalDate actualReleaseDate) {
        this.actualReleaseDate = actualReleaseDate;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }
}
