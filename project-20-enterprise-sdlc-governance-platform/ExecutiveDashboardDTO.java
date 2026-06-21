package com.alhanoof.sdlc.governance.dto;

public class ExecutiveDashboardDTO {

    private Long totalRequirements;
    private Long totalUserStories;
    private Long totalTestCases;
    private Long totalUATScenarios;
    private Long totalReleases;
    private Long totalRisks;
    private Double governanceScore;

    public ExecutiveDashboardDTO() {
    }

    public ExecutiveDashboardDTO(
            Long totalRequirements,
            Long totalUserStories,
            Long totalTestCases,
            Long totalUATScenarios,
            Long totalReleases,
            Long totalRisks,
            Double governanceScore) {

        this.totalRequirements = totalRequirements;
        this.totalUserStories = totalUserStories;
        this.totalTestCases = totalTestCases;
        this.totalUATScenarios = totalUATScenarios;
        this.totalReleases = totalReleases;
        this.totalRisks = totalRisks;
        this.governanceScore = governanceScore;
    }

    public Long getTotalRequirements() {
        return totalRequirements;
    }

    public Long getTotalUserStories() {
        return totalUserStories;
    }

    public Long getTotalTestCases() {
        return totalTestCases;
    }

    public Long getTotalUATScenarios() {
        return totalUATScenarios;
    }

    public Long getTotalReleases() {
        return totalReleases;
    }

    public Long getTotalRisks() {
        return totalRisks;
    }

    public Double getGovernanceScore() {
        return governanceScore;
    }
}
