package com.alhanoof.sdlc.quality.dto;

public class DashboardDTO {

    private Double testCoverage;
    private Double defectClosureRate;
    private Double releaseSuccessRate;
    private Double riskMitigationRate;
    private Double uatSuccessRate;

    public DashboardDTO() {
    }

    public DashboardDTO(
            Double testCoverage,
            Double defectClosureRate,
            Double releaseSuccessRate,
            Double riskMitigationRate,
            Double uatSuccessRate) {

        this.testCoverage = testCoverage;
        this.defectClosureRate = defectClosureRate;
        this.releaseSuccessRate = releaseSuccessRate;
        this.riskMitigationRate = riskMitigationRate;
        this.uatSuccessRate = uatSuccessRate;
    }

    public Double getTestCoverage() {
        return testCoverage;
    }

    public Double getDefectClosureRate() {
        return defectClosureRate;
    }

    public Double getReleaseSuccessRate() {
        return releaseSuccessRate;
    }

    public Double getRiskMitigationRate() {
        return riskMitigationRate;
    }

    public Double getUatSuccessRate() {
        return uatSuccessRate;
    }
}
