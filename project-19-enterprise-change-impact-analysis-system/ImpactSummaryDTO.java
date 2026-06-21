package com.alhanoof.sdlc.changeimpact.dto;

public class ImpactSummaryDTO {

    private Long totalChanges;
    private Long highRiskChanges;
    private Long criticalImpactChanges;

    public ImpactSummaryDTO() {
    }

    public ImpactSummaryDTO(
            Long totalChanges,
            Long highRiskChanges,
            Long criticalImpactChanges) {

        this.totalChanges = totalChanges;
        this.highRiskChanges = highRiskChanges;
        this.criticalImpactChanges = criticalImpactChanges;
    }

    public Long getTotalChanges() {
        return totalChanges;
    }

    public Long getHighRiskChanges() {
        return highRiskChanges;
    }

    public Long getCriticalImpactChanges() {
        return criticalImpactChanges;
    }
}
