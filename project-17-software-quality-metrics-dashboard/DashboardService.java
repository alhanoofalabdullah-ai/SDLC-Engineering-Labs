package com.alhanoof.sdlc.quality.service;

import com.alhanoof.sdlc.quality.dto.DashboardDTO;
import com.alhanoof.sdlc.quality.entity.QualityMetric;
import com.alhanoof.sdlc.quality.repository.QualityMetricRepository;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final QualityMetricRepository repository;

    public DashboardService(
            QualityMetricRepository repository) {
        this.repository = repository;
    }

    public DashboardDTO getDashboard(Long id) {

        QualityMetric metric =
                repository.findById(id)
                .orElseThrow();

        double testCoverage =
                ((double) metric.getPassedTests()
                / metric.getTotalTestCases()) * 100;

        double defectClosure =
                ((double) metric.getClosedDefects()
                / (metric.getClosedDefects()
                + metric.getOpenDefects())) * 100;

        double releaseSuccess =
                ((double) metric.getSuccessfulReleases()
                / (metric.getSuccessfulReleases()
                + metric.getFailedReleases())) * 100;

        double riskMitigation =
                ((double) metric.getMitigatedRisks()
                / (metric.getMitigatedRisks()
                + metric.getOpenRisks())) * 100;

        double uatSuccess =
                ((double) metric.getUatPassed()
                / (metric.getUatPassed()
                + metric.getUatFailed())) * 100;

        return new DashboardDTO(
                testCoverage,
                defectClosure,
                releaseSuccess,
                riskMitigation,
                uatSuccess
        );
    }
}
